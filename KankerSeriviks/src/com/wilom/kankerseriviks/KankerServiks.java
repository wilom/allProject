package com.wilom.kankerseriviks;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KankerServiks extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kanker_serviks);
		final EditText txtNama= (EditText)findViewById(R.id.txtNama);
		final Button btnKanker = (Button)findViewById(R.id.btnKanker);
		final Button btnInfo = (Button)findViewById(R.id.btnInfo);
		final Button btnTentang = (Button)findViewById(R.id.btnTentang);
		final Button btnOff = (Button)findViewById(R.id.btnOff);
		//tombol "Diagnosa Kanker Serviks"
		btnKanker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nm=txtNama.getText().toString();
				Intent i = new Intent(KankerServiks.this,DiagnosaAwal.class);
				i.putExtra("",""+nm);
				startActivity(i);
			}});
		//tombol "Diagnosa Info"
		btnInfo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nm=txtNama.getText().toString();
				Intent i = new Intent(KankerServiks.this,InfoServiks.class);
				i.putExtra("",""+nm);
				startActivity(i);
			}});
		//tombol "Diagnosa Tentang"
		btnTentang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
				Intent i = new Intent(KankerServiks.this,Tentang.class);
				startActivity(i);
			}});
		btnOff.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
				close();
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_kanker_serviks, menu);
		return true;
	}
//close
	public void close(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Anda Yakin Keluar?")
		.setCancelable(false).setPositiveButton
		("Ya", new DialogInterface.OnClickListener() {
		
			@Override
			public void onClick(DialogInterface dialog, int id) {
				// TODO Auto-generated method stub
				KankerServiks.this.finish();
			}
		}).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		}).show();
	}
	public boolean onKeyDown(int keyCode, KeyEvent event){
		if(keyCode==KeyEvent.KEYCODE_BACK){
	close();
	Intent a = new Intent(this,KankerServiks.class);
	a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	startActivity(a);
	return true;
	}
		return super.onKeyDown(keyCode, event);
		}
	//----
}
