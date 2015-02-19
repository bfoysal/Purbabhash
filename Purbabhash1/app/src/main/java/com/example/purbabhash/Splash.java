package com.example.purbabhash;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends Activity {
	private MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		mp = MediaPlayer.create(Splash.this , R.raw.purbabhash);
		mp.start();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread splashThread = new Thread() {

			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
				} finally {
					Intent i = new Intent(Splash.this,Options.class);
					startActivity(i);
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
					finish();
				}
			}

		};

		splashThread.start();
	}



}
