package ru.prog.school.threescreenproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainWindow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);

	Button switch_tosc_2 = (Button) findViewById(R.id.switch_tosc_2);
	switch_tosc_2.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), SecondWindow.class);
			startActivityForResult(myIntent, 0);
		}
	});
	
	
	Button switch_tosc_3 = (Button) findViewById(R.id.switch_tosc_3);
	switch_tosc_3.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), SecondWindow.class);
			startActivityForResult(myIntent, 0);
		}
	});
}
}