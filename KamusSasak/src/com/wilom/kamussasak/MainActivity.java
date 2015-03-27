package com.wilom.kamussasak;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	DatabaseManager dm;
	EditText edtMasuk;
	ImageButton btnCari;
	Button btnTambah;
	TextView txtHasil;
	ArrayList<EntitasKamus> isikamus = new ArrayList<EntitasKamus>();
	EntitasKamus komponenkamus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// memanggil kelas DatabaseManager, di representasikan sebagai dm
		dm = new DatabaseManager(this);

		// mencocokkan object/komponen sesuai id nya
		btnTambah = (Button) findViewById(R.id.btnTambah);
		edtMasuk = (EditText) findViewById(R.id.edtMasuk);
		txtHasil = (TextView) findViewById(R.id.txtHasil);
		btnCari = (ImageButton) findViewById(R.id.btnCari);

		// method supaya button berfungsi
		btnTambah.setOnClickListener(this);
		btnCari.setOnClickListener(this);

	}

	protected void fungsiterjemah() {
		// TODO Auto-generated method stub
		ArrayList<Object> baris;
		baris = dm.terjemahkan(edtMasuk.getText().toString());
		if (baris.size() > 0) {
			txtHasil.setText((String) baris.get(2));
			edtMasuk.setText("");

		} else {
			txtHasil.setText("tidak ditemukan");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnCari:
			fungsiterjemah();
			break;

		case R.id.btnTambah:

			Intent i = new Intent(MainActivity.this, TambahActivity.class);
			startActivity(i);
			break;
		}
	}

}
