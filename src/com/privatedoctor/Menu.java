package com.privatedoctor;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Menu extends CustomWindow implements OnClickListener{
	Button diagnosa, tentang, keluar;
    
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        TextView tv = (TextView) findViewById(R.id.tviewx);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontsss.ttf");
        tv.setTypeface(font);
        TextView te = (TextView) findViewById(R.id.load);
        te.setVisibility(8);
        
        diagnosa = (Button) findViewById(R.id.tombol_diagnosa);
        tentang = (Button) findViewById(R.id.tombol_about);
        keluar = (Button) findViewById(R.id.tombol_exit);
        
        diagnosa.setOnClickListener(this);
        tentang.setOnClickListener(this);
        keluar.setOnClickListener(this);
    
    }

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch(v.getId()){
		case R.id.tombol_diagnosa:
			intent = new Intent(this, Main.class);
			startActivity(intent);
			break;
		case R.id.tombol_about:
			intent = new Intent(this, About.class);
			startActivity(intent);
			break;
		case R.id.tombol_exit:
			AlertDialog.Builder ab = new AlertDialog.Builder(this);
			ab.setMessage("Keluar dari aplikasi?")
			.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					finish();
					
				}
			})
			.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			}).show();
			break;
		
		}
	}
  
	
	
}
