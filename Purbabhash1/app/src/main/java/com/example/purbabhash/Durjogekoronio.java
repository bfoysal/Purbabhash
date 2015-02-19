package com.example.purbabhash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Durjogekoronio extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.durjoge_koronio);
		
		findViewById(R.id.checkBox1).setOnClickListener(this);
		findViewById(R.id.checkBox2).setOnClickListener(this);
		findViewById(R.id.checkBox3).setOnClickListener(this);
		findViewById(R.id.checkBox4).setOnClickListener(this);
		findViewById(R.id.checkBox5).setOnClickListener(this);
		findViewById(R.id.checkBox6).setOnClickListener(this);
		findViewById(R.id.checkBox7).setOnClickListener(this);
		findViewById(R.id.checkBox8).setOnClickListener(this);
		findViewById(R.id.checkBox9).setOnClickListener(this);
	}
     private int ck=0;
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.checkBox1:
			ck++;
			break;
		case R.id.checkBox2:
			ck++;
			break;
		case R.id.checkBox3:
			ck++;
			break;
		case R.id.checkBox4:
			ck++;
			break;
		case R.id.checkBox5:
			ck++;
			break;
		case R.id.checkBox6:
			ck++;
			break;
		case R.id.checkBox7:
			ck++;
			break;
		case R.id.checkBox8:
			ck++;
			break;
		case R.id.checkBox9:
			ck++;
			break;
		
		}
		if(ck==9){
			Durjogekoronio.this.finish();
			ck=0;
			startActivity(new Intent(Durjogekoronio.this,Cyclonecenter.class));
		}
		
		
		
		
		
	}
	
	  public void onBackPressed() {
			// TODO Auto-generated method stub
			super.onBackPressed();
			//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			Durjogekoronio.this.finish();
			startActivity(new Intent(Durjogekoronio.this,Options.class));
		
		}

}
