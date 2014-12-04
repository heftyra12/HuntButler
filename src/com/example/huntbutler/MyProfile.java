package com.example.huntbutler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class MyProfile extends Activity
implements OnEditorActionListener, OnClickListener{
	
	private static final int REQUEST_CODE_FUNCTONE = 100;
	private Button   homeButton;
	private Button   cancelButton;
	private Button   uploadButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_profile);
		
		homeButton 		= (Button) 		findViewById(R.id.button1);
		cancelButton 	= (Button) 		findViewById(R.id.button2);
		uploadButton 	= (Button) 		findViewById(R.id.button3);
		
		homeButton		.setOnClickListener(this);
		cancelButton	.setOnClickListener(this);
		uploadButton	.setOnClickListener(this);
	}

	@Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_DONE ||
    		actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {
        	
        }        
        return false;
    }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1: 
        	Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);

        	
        	//startActivity(intent);
			startActivityForResult(intent1, REQUEST_CODE_FUNCTONE);
            break;
		case R.id.button2: 
        	Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);

        	
        	//startActivity(intent);
			startActivityForResult(intent2, REQUEST_CODE_FUNCTONE);
            break;
		case R.id.button3: 
        	Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);

        	
        	//startActivity(intent);
			startActivityForResult(intent3, REQUEST_CODE_FUNCTONE);
            break;
        }
		
	}

}
