package com.example.simpleactivity;

import android.app.Activity;
/*import android.content.Context;*/
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	static String SendData;
	Button mainActivityButton;
	EditText sendDataEditText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUI();
		 addListenerOnButton();
	}
	private void initUI() {
		// TODO Auto-generated method stub
		mainActivityButton=(Button)findViewById(R.id.mainActivityButtonID);
		sendDataEditText=(EditText)findViewById(R.id.sendDataEditTextID);
	}
	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		
		/*final Context context = this;*/
		mainActivityButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				SendData=sendDataEditText.getText().toString().trim();
				
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
				
			}
		});
		
		
	}
	
	
	
	/*private void onClick(View view){
		final Context context = this;
		SendData=sendDataEditText.getText().toString().trim();
		
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
		
	}*/
}
