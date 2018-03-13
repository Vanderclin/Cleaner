package com.vanderclin.cleaner.activity;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.widget.*;
import android.support.v7.app.*;

import com.vanderclin.cleaner.activity.*;
import com.vanderclin.cleaner.R;

public class SplashActivity extends AppCompatActivity
{
	TextView mCopyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
		
		mCopyright = (TextView) findViewById(R.id.splashactivityTextViewDeveloper);
		mCopyright.setText(getString(R.string.copyright) + " - " + getString(R.string.yaer));
		
		Thread myThread = new Thread(){
			@Override
			public void run() {
				try {
					sleep(5*1000);
					Intent intent = new Intent(getApplicationContext(),CleanerActivity.class);
					startActivity(intent);
					finish();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
        myThread.start();
    }
}

