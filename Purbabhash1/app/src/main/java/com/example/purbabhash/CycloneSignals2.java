package com.example.purbabhash;

import android.app.Activity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class CycloneSignals2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cyclone_signals);
		String arr[] = getResources().getStringArray(R.array.things_ten);

		Typeface tf = Typeface.createFromAsset(getAssets(),
				"font/siyamrupali.ttf");
		TextView tv=(TextView)findViewById(R.id.header);
		tv.setTypeface(tf);
		tv.setText("বিপদ সংকেত সমূহ");
		for (int i = 0; i < 10; i++) {
			String buttonID = "textView" + (i);
			int resID = getResources().getIdentifier(buttonID, "id",
					"com.example.cyclonesignals");
			TextView temp = ((TextView) findViewById(resID));
			temp.setTypeface(tf);
			// temp.setText(arr[i]);
			temp.setText(arr[i]);
			// Toast.makeText(this," "+arr[i],Toast.LENGTH_SHORT).show();

			// System.out.println(arr[i]);
			Log.d("tag", "" + arr[i] + " :" + i);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.cyclone_signals, menu);
		return false;
	}

}
