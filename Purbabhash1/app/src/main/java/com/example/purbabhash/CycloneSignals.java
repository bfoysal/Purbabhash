package com.example.purbabhash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CycloneSignals extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cyclone_signals);
		String arr[] = getResources().getStringArray(R.array.things_eleven); 
		TextView tv=(TextView)findViewById(R.id.header);
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "font/siyamrupali.ttf");
		tv.setTypeface(tf);
		tv.setText("Cyclone Signals:");
		
		for (int i = 0; i < 11;i++ ) {
			String buttonID = "textView" + (i) ;
		    int resID = getResources().getIdentifier(buttonID, "id", "com.example.purbabhash");
		    TextView temp= ((TextView) findViewById(resID));
		    temp.setTypeface(tf);

		    temp.setText(arr[i]);
//		    Toast.makeText(this," "+arr[i],Toast.LENGTH_SHORT).show();
		
//			System.out.println(arr[i]);
			Log.d("tag", ""+arr[i]+" :"+i);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		return false;   
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//		CycloneSignals.this.finish();
//		startActivity(new Intent(CycloneSignals.this,Options.class));
//
		finish();
	}

}
