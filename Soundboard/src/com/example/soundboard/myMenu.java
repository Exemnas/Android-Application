package com.example.soundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myMenu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//BUTTON SOUND setup
		final MediaPlayer buttonclicksound = MediaPlayer.create(this, R.raw.gun);
		
		Button bStart = (Button) findViewById(R.id.PushButton);
		
		bStart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.example.soundboard.SOUNDBOARDBUTT"));
				buttonclicksound.start();
			}
		});
		
		
		Button bQuit = (Button) findViewById(R.id.quitButton);
		
		bQuit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();			
			}
		});
		
		
		
		
	}	
}
