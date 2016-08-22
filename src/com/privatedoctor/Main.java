package com.privatedoctor;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class Main extends CustomWindow implements OnClickListener {

	Button tombol, back;
	String [] menu ;
	AutoCompleteTextView actv;
	Vibrator vibrator;
	TextView te;
	
    
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        TextView tv = (TextView) findViewById(R.id.tview);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontsss.ttf");
        tv.setTypeface(font);
        tv.setTextSize(15);
        te = (TextView) findViewById(R.id.load);
        te.setVisibility(8);
        menu = getResources().getStringArray(R.array.penyakit);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_array, menu);
        actv = (AutoCompleteTextView) findViewById(R.id.auto);
        actv.setThreshold(1);
        actv.setAdapter(aa);
        tombol = (Button) findViewById(R.id.tombol);
        tombol.setOnClickListener(this);
        back = (Button) findViewById(R.id.tombol_back);
        back.setOnClickListener(this);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    
    }
    
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.tombol_back:
			finish();
			break;
		
		case R.id.tombol:
			if(actv.getText().toString().equals("")){
				Toast.makeText(getBaseContext(), "Masukkan Gejala Anda!\n   Lalu Tekan Tombol!", Toast.LENGTH_SHORT).show();
			}else{
				actv.setEnabled(false);
				RunAnimations();
				vibrator.vibrate(100);
				new Handler().postDelayed(new Runnable() {
					
					public void run() {
						actv.setEnabled(true);
						te.setVisibility(8);
						tombol.setClickable(true);
						Intent intent = null;
						
						if(actv.getText().toString().equals(menu[0])){
							intent = new Intent(getBaseContext(), Penyakit1.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[1])){
							intent = new Intent(getBaseContext(), Penyakit2.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[2])){
							intent = new Intent(getBaseContext(), Penyakit3.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[3])){
							intent = new Intent(getBaseContext(), Penyakit4.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[4])){
							intent = new Intent(getBaseContext(), Penyakit5.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[5])){
							intent = new Intent(getBaseContext(), Penyakit6.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[6])){
							intent = new Intent(getBaseContext(), Penyakit7.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[7])){
							intent = new Intent(getBaseContext(), Penyakit8.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[8])){
							intent = new Intent(getBaseContext(), Penyakit9.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[9])){
							intent = new Intent(getBaseContext(), Penyakit10.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[10])){
							intent = new Intent(getBaseContext(), Penyakit11.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[11])){
							intent = new Intent(getBaseContext(), Penyakit12.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[12])){
							intent = new Intent(getBaseContext(), Penyakit13.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[13])){
							intent = new Intent(getBaseContext(), Penyakit14.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[14])){
							intent = new Intent(getBaseContext(), Penyakit15.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[15])){
							intent = new Intent(getBaseContext(), Penyakit16.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[16])){
							intent = new Intent(getBaseContext(), Penyakit17.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[17])){
							intent = new Intent(getBaseContext(), Penyakit18.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[18])){
							intent = new Intent(getBaseContext(), Penyakit19.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[19])){
							intent = new Intent(getBaseContext(), Penyakit20.class);
							startActivity(intent);
							actv.setText("");
						}else if(actv.getText().toString().equals(menu[20])){
							intent = new Intent(getBaseContext(), Penyakit21.class);
							startActivity(intent);
							actv.setText("");
						}else{
							Toast.makeText(getBaseContext(), "Gejala Tidak Ditemukan !", Toast.LENGTH_SHORT).show();
						}
						
					}
				},5000);
			}
			break;
		}
		
		
		
		
		
	}
	
	private void RunAnimations() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate);
        a.reset();
        Button tv = (Button) findViewById(R.id.tombol);
        TextView te = (TextView) findViewById(R.id.load);
        te.setVisibility(0);
        tv.setClickable(false);
        tv.clearAnimation();
        tv.startAnimation(a);

        
    }
	
	
}