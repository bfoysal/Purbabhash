package com.example.purbabhash;

import android.os.Bundle;
import android.app.Activity;
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

public class OpenClose extends Activity {

//   private EditText field;
   private WebView browser;

   @Override		
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.open_close);
//      field = (EditText)findViewById(R.id.urlField);
      browser = (WebView)findViewById(R.id.webView1);
      browser.setWebViewClient(new MyBrowser());
      RelativeLayout rl=(RelativeLayout) findViewById(R.id.rl1);
      rl.setBackgroundColor(Color.BLACK);
//      String url="http://www.ddm.gov.bd/cyclone.php";
      browser.getSettings().setLoadsImagesAutomatically(true);
      browser.getSettings().setJavaScriptEnabled(true);
      browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//      browser.loadUrl(url); edited for weather
      browser.loadUrl("file:///android_asset/weather/index.html");
   }


//   public void open(View view){
//      //String url = field.getText().toString();// get url from user
//      String url="http://www.ddm.gov.bd/cyclone.php";
//      browser.getSettings().setLoadsImagesAutomatically(true);
//      browser.getSettings().setJavaScriptEnabled(true);
//      browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//      browser.loadUrl(url);
//
//   }
   private class MyBrowser extends WebViewClient {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
         view.loadUrl(url);
         return true;
      }
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      
      return true;
   }

}