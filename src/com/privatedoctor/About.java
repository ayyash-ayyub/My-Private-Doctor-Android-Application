package com.privatedoctor;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class About extends CustomWindow implements OnClickListener{
	Button back;
	
	TextView tev;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		TextView tv = (TextView) findViewById(R.id.about_teks);
		TextView pri = (TextView) findViewById(R.id.prisca);
		TextView mal = (TextView) findViewById(R.id.malachi);
		TextView rya = (TextView) findViewById(R.id.ryan);
		pri.setVisibility(8);
		mal.setVisibility(8);
		rya.setVisibility(8);
		Typeface font = Typeface.createFromAsset(getAssets(), "fontsss.ttf");
        tv.setTypeface(font);
        back = (Button) findViewById(R.id.tombol_kembali_about);
        back.setOnClickListener(this);

        tev = (TextView) findViewById(R.id.load);
        tev.setVisibility(8);
        AnimasiPrisca();
        new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				AnimasiMalachi();
				new Handler().postDelayed(new Runnable() {
					
					@Override
					public void run() {
						AnimasiRyan();
						
					}
				}, 2000);
				
			}
		}, 2000);
        
        
	}
	
	private void AnimasiPrisca() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a.reset();
        TextView te = (TextView) findViewById(R.id.prisca);
        te.setVisibility(0);
        te.clearAnimation();
        te.startAnimation(a);

        
    }
	
	private void AnimasiMalachi() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a.reset();
        TextView te = (TextView) findViewById(R.id.malachi);
        te.setVisibility(0);
        te.clearAnimation();
        te.startAnimation(a);

        
    }
	private void AnimasiRyan() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a.reset();
        TextView te = (TextView) findViewById(R.id.ryan);
        te.setVisibility(0);
        te.clearAnimation();
        te.startAnimation(a);

        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
	}

}
