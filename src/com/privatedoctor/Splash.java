package com.privatedoctor;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity{
	
	public final int Waktu = 3000;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		TextView tv = (TextView) findViewById(R.id.mypriv);
		TextView tvs = (TextView) findViewById(R.id.doct);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontsss.ttf");
        tv.setTypeface(font);
        tvs.setTypeface(font);
		
		RunAnimations();
		
		new Handler().postDelayed(new Runnable() {
			
			public void run() {
				Animasi();
				new Handler().postDelayed(new Runnable() {
					
					public void run() {
						// TODO Auto-generated method stub
						Intent intent = new Intent(Splash.this, Menu.class);
						Splash.this.startActivity(intent);
						Splash.this.finish();				
					}
				},1900);
					
			}
		},Waktu);
	}
	
	private void RunAnimations() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.shake);
        a.reset();
        Animation b = AnimationUtils.loadAnimation(this, R.anim.shakeslow);
        b.reset();
        Animation c = AnimationUtils.loadAnimation(this, R.anim.alpha);
        c.reset();
        TextView tv = (TextView) findViewById(R.id.mypriv);
		TextView tvs = (TextView) findViewById(R.id.doct);
		ImageView iv = (ImageView) findViewById(R.id.logo);
        tv.setClickable(false);
        tv.clearAnimation();
        tv.startAnimation(a);
        tvs.setClickable(false);
        tvs.clearAnimation();
        tvs.startAnimation(b);

        iv.setClickable(false);
        iv.clearAnimation();
        iv.startAnimation(c);
        
    }
	private void Animasi() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha2);
        a.reset();
        Animation b = AnimationUtils.loadAnimation(this, R.anim.alpha2);
        b.reset();
        Animation c = AnimationUtils.loadAnimation(this, R.anim.alpha2);
        c.reset();
        TextView tv = (TextView) findViewById(R.id.mypriv);
		TextView tvs = (TextView) findViewById(R.id.doct);
		ImageView iv = (ImageView) findViewById(R.id.logo);
        tv.setClickable(false);
        tv.clearAnimation();
        tv.startAnimation(a);
        tvs.setClickable(false);
        tvs.clearAnimation();
        tvs.startAnimation(b);

        iv.setClickable(false);
        iv.clearAnimation();
        iv.startAnimation(c);
        
    }
}
