package com.example.purbabhash;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Cyclonecenter extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//own(amader create kora) list view er khetre ei line ta comment out ore dite hobe..
		setContentView(R.layout.cyclonecenter);
	
		//ownListView
		ListView lv=(ListView) findViewById(R.id.listView1);
		//ownListView
		
		
	final String[] values=new String[]{"Barishal","Kuakata","Nijhum Dip","Saintmartin","Vola"};
	
	ArrayAdapter<String> aa=new ArrayAdapter<String>(this, 
			android.R.layout.simple_list_item_1, values);
	

	lv.setAdapter(aa);
	lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3)
		{
			Toast.makeText(Cyclonecenter.this,values[arg2],Toast.LENGTH_SHORT).show();
//			arg1.setTextColor(Color.BLACK);
			if(arg2==0)
			{
				
			Intent ii= new Intent(Cyclonecenter.this, Barishal.class);
			startActivity(ii);
			}
			
			else if(arg2==1)
			{
				Intent ii= new Intent(Cyclonecenter.this, Kuakata.class);
				startActivity(ii);
			}
			else if(arg2==2)
			{
				Intent ii= new Intent(Cyclonecenter.this, NijhumDip.class);
				startActivity(ii);
			}
			
			else if(arg2==3)
			{
				Intent ii= new Intent(Cyclonecenter.this, Saintmartin.class);
				startActivity(ii);
			}
			
			else if(arg2==4)
			{
				Intent ii= new Intent(Cyclonecenter.this, Vola.class);
				startActivity(ii);
			}
			
			
			
		}
		
	});
	
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
//			Cyclonecenter.this.finish();
//			startActivity(new Intent(Cyclonecenter.this,Options.class));
			
		//	finish();
		}

}
