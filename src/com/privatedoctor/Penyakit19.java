package com.privatedoctor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Window;

public class Penyakit19 extends Activity{
	

	String [] penyakit1 ;
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
		
		penyakit1 = getResources().getStringArray(R.array.gejala74);
		solusi = getResources().getStringArray(R.array.solusi74);
		tanyadokter = getResources().getStringArray(R.array.tanyadokter);
				
		pen.setMessage("Adakah sebuah bintil merah yang sakit?")
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
	
	
	//Fungsi tampil penyakit
	
	public void penyakit1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(" Adakah benjolan di sekitar kelamin yang hilang bila ditekan?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(1);
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit2();
			}
		}).show();
	}
	
	public void penyakit2(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Adakah benjolan atau bintil di antara telinga dengan ujung rahang?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(2);
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit3();
			}
		}).show();
	}
	
	public void penyakit3(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Adakah benjolan atau bintil di leher?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit4();
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				tanya();
			}
		}).show();
	}
	
	public void penyakit4(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Apakah juga ada benjolan atau bintil di ketiak dan/atau sekitar kelamin?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit5();
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit6();
			}
		}).show();
	}
	
	public void penyakit5(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Apakah anda baru terserang ruam kulit?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(3);
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(4);
			}
		}).show();
	}
	
	public void penyakit6(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Apakah tenggorokan terasa serak?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(5);
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				tanya();
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

	

