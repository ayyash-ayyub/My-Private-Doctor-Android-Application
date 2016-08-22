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

public class Penyakit6 extends Activity{
	

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
		
		penyakit1 = getResources().getStringArray(R.array.gejala61);
		solusi = getResources().getStringArray(R.array.solusi61);
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
	
	
	//Fungsi tampil penyakit
	public void penyakit1(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[1])
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
		pen.setMessage(penyakit1[2])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit9();
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
		pen.setMessage(penyakit1[3])
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
				penyakit4();
			}
		}).show();
	}
	
	public void penyakit4(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[4])
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
				penyakit5();
			}
		}).show();
	}
	
	public void penyakit5(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[5])
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
				penyakit6();
			}
		}).show();
	}
	public void penyakit6(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[6])
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
				penyakit7();
			}
		}).show();
	}
	public void penyakit7(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[7])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(6);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit8();
			}
		}).show();
	}
	
	public void penyakit8(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[8])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(7);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				tanya();
			}
		}).show();
	}
	public void penyakit9(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[9])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(8);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit10();
			}
		}).show();
	}
	public void penyakit10(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[10])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(9);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit11();
			}
		}).show();
	}
	public void penyakit11(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[11])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(10);		
			}
		})
		.setNegativeButton("Tidak",	new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				penyakit12();
			}
		}).show();
	}
	public void penyakit12(){
		pen = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
		pen.setMessage(penyakit1[12])
		.setCancelable(false)
		.setPositiveButton("Iya", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				solus(11);		
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
		sol.setMessage("Bawa ke dokter dalam 24 jam bila demamnya belum turun setelah 2 hari dan penyebabnya belum bisa terdiagnosa dari diagram ini.")
		.setTitle("Tanya Dokter!")
		.setCancelable(false)
		.setPositiveButton("Tutup", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		}).show();
	}
}

	

