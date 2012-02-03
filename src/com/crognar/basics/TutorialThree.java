package com.crognar.basics;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TutorialThree extends Activity implements OnClickListener {

	ImageView display;
	int toPhone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.wallpaper);
		
		toPhone = R.drawable.android_abstract;
		
		display = (ImageView) findViewById(R.id.IVdisplay);
		ImageView image1 = (ImageView) findViewById(R.id.IVimage1);
		ImageView image2 = (ImageView) findViewById(R.id.IVimage2);
		Button setWall = (Button) findViewById(R.id.BsetWallpaper);
		
		image1.setOnClickListener(this);
		image2.setOnClickListener(this);
		setWall.setOnClickListener(this);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		finish();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	Toast toast;
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
			case R.id.IVimage1:
				display.setImageResource(R.drawable.android_abstract);
				toPhone = R.drawable.android_abstract;
				break;
			case R.id.IVimage2:
				display.setImageResource(R.drawable.teenage_mutant_ninja_androids);
				toPhone = R.drawable.teenage_mutant_ninja_androids;
				//toast.makeText(this, "TOAST", Toast.LENGTH_SHORT).show(); sorry just to test a toast here ;)
				break;
			case R.id.BsetWallpaper:
				InputStream wall = getResources().openRawResource(toPhone);
				Bitmap back = BitmapFactory.decodeStream(wall);
				try {
					getApplicationContext().setWallpaper(back);
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				break;
		}
	}	

}
