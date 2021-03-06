package com.example.customviewweek5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class CustomView extends View implements OnTouchListener{

	int x,y;
	
	public CustomView(Context context) {
		super(context);
		this.setOnTouchListener(this);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setOnTouchListener(this);
		
	}

	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.setOnTouchListener(this);
		
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		
		Paint p = new Paint();
		p.setColor(Color.BLUE);
		int myColor = Color.argb(255, 0, 255, 0);
		p.setColor(myColor);
		
		canvas.drawLine(x, y, canvas.getWidth(), canvas.getHeight(), p);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Log.v("CUSTOMVIEW","onTouch");
		int action = event.getAction();
		if (action == MotionEvent.ACTION_DOWN){
			Log.v("CUSTOMVIEW","onTouch ACTION DOWN");
			x= (int) event.getX();
			y = (int) event.getY();
		}
		else 
			Log.v("CUSTOMVIEW","onTouch ACTION DOWN");
		invalidate();
		return false;
	}

}
