package com.example.purbabhash;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class Saintmartin extends Activity implements OnClickListener{
	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saintmartin);
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		final LatLng CIU = new LatLng(22.056457,91.010755);
		Marker ciu = mMap.addMarker(new MarkerOptions().position(CIU).title(
				"Saint martin"));
		
		findViewById(R.id.dcoffice).setOnClickListener(this);
		findViewById(R.id.police).setOnClickListener(this);
		findViewById(R.id.firebrigade).setOnClickListener(this);
		findViewById(R.id.hospital).setOnClickListener(this);
		findViewById(R.id.costalguard).setOnClickListener(this);
		
	}
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.nijhum_dip, menu);
//		return true;
//	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		
		case R.id.dcoffice:
			String url1="tel:183272";
			Intent call =new Intent(Intent.ACTION_CALL,Uri.parse(url1));
			startActivity(call);
			break;
			
		case R.id.police:
			String url2="tel:376196";
			startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(url2)));
			//Log.i(LOGTAG, "you arrived here just fine ");
			break;
			
		case R.id.costalguard:
			String url3="tel:917248";
			startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(url3)));
			break;
			
		case R.id.firebrigade:
			String url4="tel:327467";
			startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(url4)));
			break;
			
		case R.id.hospital:
			String url5="tel:281748";
			startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(url5)));
			break;
		
		}
		
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/
	
	
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		Saintmartin.this.finish();
		startActivity(new Intent(Saintmartin.this,Cyclonecenter.class));
		
	//	finish();
	}
}
