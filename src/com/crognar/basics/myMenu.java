package com.crognar.basics;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class myMenu extends Activity{
	
	MediaPlayer mpButtonClick;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//button-click sound
		mpButtonClick = MediaPlayer.create(this,R.raw.button_click);
		//or final MediaPlayer mpButtonClick = ... to make it local
		
		Button bTutorial1 = (Button) findViewById(R.id.Button1);
		bTutorial1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mpButtonClick.start();
				startActivity(new Intent("com.crognar.basics.TUTORIALONE"));
			}
		});
		
		Button bTutorial2 = (Button) findViewById(R.id.Button2);
		bTutorial2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mpButtonClick.start();
				startActivity(new Intent("com.crognar.basics.TUTORIALTWO"));
			}
		});
		
		Button bTutorial3 = (Button) findViewById(R.id.Button3);
		bTutorial3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mpButtonClick.start();
				startActivity(new Intent("com.crognar.basics.WALLPAPER"));
			}
		});
		
		Button bTutorial4 = (Button) findViewById(R.id.Button4);
		bTutorial4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mpButtonClick.start();
				startActivity(new Intent("com.crognar.basics.ANIMATE"));
			}
		});
				
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.menuSweet:
			startActivity(new Intent("com.crognar.SWEET"));
			return true;
		case R.id.menuToast:
			Toast display = Toast.makeText(this, "<3<3", Toast.LENGTH_SHORT);
			display.show();
			return true;
		}
		
		return false;
	}	
}
