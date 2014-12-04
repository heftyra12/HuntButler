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

public class MainActivity extends Activity
implements OnEditorActionListener, OnClickListener{
	
	private static final int REQUEST_CODE_FUNCTONE = 100;
	private Button   uploadButton;
	private Button   profileButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		uploadButton 	= (Button) 		findViewById(R.id.button2);
		profileButton 	= (Button) 		findViewById(R.id.button3);
		uploadButton	.setOnClickListener(this);
		profileButton	.setOnClickListener(this);
	}

	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_DONE ||
    		actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {
        	
        }        
        return false;
    }
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button2: 
        	Intent intent1 = new Intent(getApplicationContext(),UploadActivity.class);

        	
        	//startActivity(intent);
			startActivityForResult(intent1, REQUEST_CODE_FUNCTONE);
            break;
		case R.id.button3: 
        	Intent intent2 = new Intent(getApplicationContext(),MyProfile.class);

        	
        	//startActivity(intent);
			startActivityForResult(intent2, REQUEST_CODE_FUNCTONE);
            break;
        }
		
	}

}
