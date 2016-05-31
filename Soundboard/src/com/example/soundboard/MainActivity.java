package com.example.soundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends Activity {

	MediaPlayer blah;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title);
		
		blah = MediaPlayer.create(this, R.raw.psx);
		blah.start();
		
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					int logoTimer = 0;
					while(logoTimer < 15000){
						sleep(100);
						logoTimer = logoTimer + 100;
					}
					startActivity(new Intent("com.example.soundboard.CLEARSCREEN"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				finally{
					finish();
				}
			}
		};
		logoTimer.start();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		blah.release();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		blah.pause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		blah.start();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	
	
	
}

//@Override
// public boolean onCreateOptionsMenu(Menu menu) {
     // Inflate the menu; this adds items to the action bar if it is present.
  //   getMenuInflater().inflate(R.menu.main, menu);
  //   return true;
 //}