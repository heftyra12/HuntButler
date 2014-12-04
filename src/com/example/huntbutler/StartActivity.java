package com.example.huntbutler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends Activity {
protected boolean _active = true;
protected int _splashTime = 2000;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);

    Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        public void run() {
            finish();
            Intent i3 = new Intent(StartActivity.this, MainActivity.class);
                startActivity(i3);
        }
    }, _splashTime);
}
}
