package com.privatedoctor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Window;

public class Penyakit20 extends Activity{
	

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
		
		penyakit1 = getResources().getStringArray(R.array.gejala75);
		solusi = getResources().getStringArray(R.array.solusi75);
		tanyadokter = getResources().getStringArray(R.array.tanyadokter);
				
		pen.setMessage("Apakah gatalnya hanya di daerah kelamin?")
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
		pen.setMessage("Apakah gatalnya hanya di bagian kulit yang tampak tidak wajar?")
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
		pen.setMessage("Apakah anda sedang minum obat resep atau pun obat bebas?")
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
		pen.setMessage("Apakah kulit dan/atau putih mata anda tampak kekuningan?")
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
				penyakit4();
			}
		}).show();
	}
	
	public void penyakit4(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Apakah anda baru saja berganti merk untuk produk sabun atau deterjen?")
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(4);
				
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit5();
			}
		}).show();
	}
	
	public void penyakit5(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage("Apakah kulit anda umumnya menjadi sangat kering?")
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

	

