package com.adarshk.phoneappname;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button myButton;
	TextView myTextView;
	
	WebView webview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		
		
		//webview = (WebView) findViewById(R.id.webview);
//		
//		//myTextView = (TextView) findViewById(R.id.textView1);
//		myButton = (Button) findViewById(R.id.startButton);
//		myButton.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Log.v("MainActivity","Button Clicked");
//				
//				//myTextView.setText(R.string.hello_world);
//				
//				Intent i = new Intent(MainActivity.this,SelectView.class);
//				startActivity(i);
//			}
//		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
