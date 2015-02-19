package com.example.purbabhash;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Abohaoa extends Activity implements LocationListener {

	private String url1 = "http://api.openweathermap.org/data/2.5/weather?q=";
	private String url2 = "&mode=xml";
	private EditText location, country, temperature, humidity, pressure;
	private HandleXML obj;
	LocationManager locationManager;
	Button buttonW;

	private Location getLastBestLocation() {
		Location locationGPS = locationManager
				.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		Location locationNet = locationManager
				.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

		long GPSLocationTime = 0;
		if (null != locationGPS) {
			GPSLocationTime = locationGPS.getTime();
		}

		long NetLocationTime = 0;

		if (null != locationNet) {
			NetLocationTime = locationNet.getTime();
		}

		if (0 < GPSLocationTime - NetLocationTime) {
			if (null == locationGPS)
				Toast.makeText(getBaseContext(), "Found NuLL",
						Toast.LENGTH_SHORT).show();
			return locationGPS;
		} else {
			if (null == locationNet)
				Toast.makeText(getBaseContext(), "Found NuLL Net",
						Toast.LENGTH_SHORT).show();
			return locationNet;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abohaoa);
		buttonW = (Button) findViewById(R.id.button1);
		location = (EditText) findViewById(R.id.editText1);
		country = (EditText) findViewById(R.id.editText2);
		temperature = (EditText) findViewById(R.id.editText3);
		humidity = (EditText) findViewById(R.id.editText4);
		pressure = (EditText) findViewById(R.id.editText5);
		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
				5000, 10, this);
		
		
		onLocationChanged(getLastBestLocation());
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present.
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 */

	public void open(View view) {
		String url = location.getText().toString();
		String finalUrl = url1 + url + url2;
		country.setText(finalUrl);
		obj = new HandleXML(finalUrl);
		obj.fetchXML();
		while (obj.parsingComplete)
			;
		country.setText(obj.getCountry());
		temperature.setText(kelvinToCelsius(obj.getTemperature()));
		humidity.setText(obj.getHumidity());
		pressure.setText(obj.getPressure());

	}

	private CharSequence kelvinToCelsius(String temperature2) {
		// TODO Auto-generated method stub
		double d = Double.parseDouble(temperature2);
		d = d - 273;
		d = Math.floor(d + 0.5);
		return String.valueOf(d);
	}

	@Override
	public void onLocationChanged(Location loc) {
		// TODO Auto-generated method stub
		location.setText("");
		// pb.setVisibility(View.INVISIBLE);
		if (null != loc) {
			Toast.makeText(
					getBaseContext(),
					"Location changed: Lat: " + loc.getLatitude() + " Lng: "
							+ loc.getLongitude(), Toast.LENGTH_SHORT).show();
			String longitude = "Longitude: " + loc.getLongitude();
			// Log.v(TAG, longitude);
			String latitude = "Latitude: " + loc.getLatitude();
			// Log.v(TAG, latitude);

			/*------- To get city name from coordinates -------- */
			String cityName = null;
			Geocoder gcd = new Geocoder(getBaseContext(), Locale.getDefault());
			List<Address> addresses;
			try {
				addresses = gcd.getFromLocation(loc.getLatitude(),
						loc.getLongitude(), 1);
				if (addresses.size() > 0)
					System.out.println(addresses.get(0).getLocality());
				cityName = addresses.get(0).getLocality();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String s = cityName;
			location.setText(s);
			
		} else {
			location.setText("dhaka");
		}
		Toast.makeText(getBaseContext(),
				"Out of Coverage Pls use Manual Input", Toast.LENGTH_SHORT)
				.show();
		buttonW.performClick();
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub

	}
	
	  public void onBackPressed() {
			// TODO Auto-generated method stub
			super.onBackPressed();
			//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			Abohaoa.this.finish();
			startActivity(new Intent(Abohaoa.this,Options.class));
			
			//finish();
		}

}