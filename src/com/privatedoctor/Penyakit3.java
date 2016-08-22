package com.privatedoctor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class Penyakit3 extends Activity{
	

	String [] penyakit1 ;
	String [] penyakit_cabang1;
	String [] penyakit_cabang2;
	String [] solusi_cabang1;
	String [] solusi_cabang2;
	String [] solusi;
	String [] tanyadokter;
	
	AlertDialog.Builder pen;
	
	Dialog dialog;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        
      

        pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		
		penyakit1 = getResources().getStringArray(R.array.gejala58);
		solusi = getResources().getStringArray(R.array.solusi58);
		penyakit_cabang1 = getResources().getStringArray(R.array.gejala58_cabang1);
		solusi_cabang1 = getResources().getStringArray(R.array.solusi58_cabang1);
		penyakit_cabang2 = getResources().getStringArray(R.array.gejala58_cabang2);
		solusi_cabang2 = getResources().getStringArray(R.array.solusi58_cabang2);
		tanyadokter = getResources().getStringArray(R.array.tanyadokter);
		
		
		
		pen.setMessage(penyakit1[0])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(0);
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				penyakit1();
			}
		}).show();
		
		
	        

	        
	}
	
	//Fungsi tampil solusi
	public void solus(int is){
		AlertDialog.Builder sol = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		sol.setMessage(solusi[is])
		.setTitle("Kemungkinan Penyebab")
		.setCancelable(false)
		.setPositiveButton("Tutup", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		}).show();
	}
	
	public void soluscabang1(int is){
		AlertDialog.Builder sol = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		sol.setMessage(solusi_cabang1[is])
		.setTitle("Kemungkinan Penyebab")
		.setCancelable(false)
		.setPositiveButton("Tutup", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		}).show();
	}
	
	public void soluscabang2(int is){
		AlertDialog.Builder sol = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		sol.setMessage(solusi_cabang2[is])
		.setTitle("Kemungkinan Penyebab")
		.setCancelable(false)
		.setPositiveButton("Tutup", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		}).show();
	}
	
	
	//Fungsi tampil penyakit
	public void penyakit1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[1])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit1_cabang1();
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit1_cabang2();
			}
		}).show();
	}
	
	
	public void penyakit1_cabang1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang1[0])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
					
				soluscabang1(0);
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit2_cabang1();
			}
		}).show();
	}
	
	public void penyakit2_cabang1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang1[1])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				soluscabang1(1);			
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				penyakit3_cabang1();
			}
		}).show();
	}
	
	public void penyakit3_cabang1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang1[2])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				soluscabang1(2);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				tanya();
			}
		}).show();
	}
	
	public void penyakit1_cabang2(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang2[0])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				soluscabang2(0);			
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				penyakit2_cabang2();
			}
		}).show();
	}
	
	public void penyakit2_cabang2(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang2[1])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				soluscabang2(1);			
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				penyakit3_cabang2();
			}
		}).show();
	}
	
	public void penyakit3_cabang2(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit_cabang2[2])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				soluscabang2(2);			
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				tanya();
			}
		}).show();
	}
	
	//Tanya Dokter
	public void tanya(){
		AlertDialog.Builder sol = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		sol.setMessage(tanyadokter[0])
		.setTitle("Tanya Dokter!")
		.setCancelable(false)
		.setPositiveButton("Tutup", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		}).show();
	}
}

	


