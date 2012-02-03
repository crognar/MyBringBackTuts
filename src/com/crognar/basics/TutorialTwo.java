package com.crognar.basics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TutorialTwo extends ListActivity{
	
	String classNames[] = {
			"TheBasicsActivity", "myMenu", "sweet", "tutorialOne"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, classNames));
	}
	
	protected void onListItemClick(ListView lv, View v, int pos, long id){
		super.onListItemClick(lv, v, pos, id);
		String openClass = classNames[pos];
		try {
			@SuppressWarnings("rawtypes")
			Class selected = Class.forName("com.crognar.basics." + openClass);
			Intent selectedIntent = new Intent(this, selected);
			startActivity(selectedIntent);
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
