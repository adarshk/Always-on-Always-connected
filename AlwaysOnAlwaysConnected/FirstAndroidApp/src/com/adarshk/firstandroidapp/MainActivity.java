package com.adarshk.firstandroidapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	TextView myTextView;
    Button myButton;
    
    
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_layout);
        
     //  ImageView myImageView = findViewById(R.id.)
        
        myTextView = (TextView)findViewById(R.id.my_textview);
        myButton = (Button)findViewById(R.id.my_button);
        myButton.setOnClickListener(this);
    }



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		myTextView.setText("Hello World");
		
	}

    
    
    
}
