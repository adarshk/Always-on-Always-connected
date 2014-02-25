package com.adarshk.galleryview;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
	
	Button myButton;
	ImageView myImageView;
	int position = 0;
	
	private Integer[] nImages = {
			
			R.drawable.ic_launcher,
			R.drawable.duty_calls,
			R.drawable.xkcd2,
			R.drawable.nerd
			
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myImageView = (ImageView) findViewById(R.id.imageView1);
        myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(this);
    }

//    	public void setImage(View v){
//    		
//    		myImageView.setImageResource(nImages[position]);
//    		
//    	}
    

   @Override
   public void onClick(View v){
	   Random r = new Random();
	   position = (r.nextInt(3)) + 1;
	   myImageView.setImageResource(nImages[position]);
	   
   }
    
}
