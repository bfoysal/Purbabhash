package com.example.purbabhash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class News extends Activity {

//   private EditText field;
   private WebView browser;

   @Override		
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.news);
//      field = (EditText)findViewById(R.id.urlField);
      browser = (WebView)findViewById(R.id.webView1);
      browser.setWebViewClient(new MyBrowser());
      RelativeLayout rl=(RelativeLayout) findViewById(R.id.rl1);
      rl.setBackgroundColor(Color.BLACK);
   }


   public void open(View view){
      //String url = field.getText().toString();// get url from user
      String url="http://www.ddm.gov.bd/cyclone.php";
      browser.getSettings().setLoadsImagesAutomatically(true);
      browser.getSettings().setJavaScriptEnabled(true);
      browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
      browser.loadUrl(url);

   }
   private class MyBrowser extends WebViewClient {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
         view.loadUrl(url);
         return true;
      }
   }

  /* @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
*/
//   public void onBackPressed() {
//		// TODO Auto-generated method stub
//		super.onBackPressed();
//		//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//		
//		
//		
////		finish();
//	}
   
   public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		//News.this.finish();
		startActivity(new Intent(News.this,Options.class));
		
		
	}
}