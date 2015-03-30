package com.example.purbabhash;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Options extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		
		 Button news =(Button)findViewById(R.id.news);
		//.setTextColor(Color.BLACK);
		 Button cyclonecenter =(Button)findViewById(R.id.cycloneCenter);
		 //cyclonecenter.setTextColor(Color.BLACK);
		 
		 Button bipodsongket =(Button)findViewById(R.id.bipodsongket);
//bipodsongket.setTextColor(Color.BLACK);
		 Button durjogekoronio =(Button)findViewById(R.id.durjogekoronio);
	//	 durjogekoronio.setTextColor(Color.BLACK);
		 Button abohaoa =(Button)findViewById(R.id.abohaoa);
		// abohaoa.setTextColor(Color.BLACK);
		 // Button bt =(Button)findViewById(R.id.button1);
		 
		 /*bt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(),CycloneSignals2.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
					finish();
				}
			});
		*/ 
		 
		 news.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(),OpenClose.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//					finish();
				}
			});
		 bipodsongket.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),CycloneSignals.class);
				startActivity(i);
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//				finish();
			}
		});
		 cyclonecenter.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(),Cyclonecenter.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//					finish();
				}
			});
		
		 durjogekoronio.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(),Durjogekoronio.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//					finish();
				}
			});
		 
		abohaoa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(),Abohaoa.class);
					startActivity(i);
//					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//					finish();
				}
			});
		
		 
		
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
//		overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		finish();
	}

}
