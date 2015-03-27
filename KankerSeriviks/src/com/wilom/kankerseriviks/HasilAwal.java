package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HasilAwal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasil_awal);
		final TextView hasilAwal=(TextView)findViewById(R.id.hasilAwal);
		final TextView txtNamaHasil=(TextView)findViewById(R.id.txtNamaHasil);
		final TextView cfhasil=(TextView)findViewById(R.id.cfHasil);
		final Button kembali = (Button)findViewById(R.id.kembali);
		final Button btnStadium = (Button)findViewById(R.id.btnStadium);
		
		Intent trmhasil=this.getIntent();
		txtNamaHasil.setText(""+trmhasil.getStringExtra(""));
		cfhasil.setText(""+trmhasil.getStringExtra("''"));
		
		String nmHasil=txtNamaHasil.getText().toString();
		float cffix=Float.parseFloat(cfhasil.getText().toString());
		if(cffix>=0.8){hasilAwal.setText("Kesimpulan : Saudari "+nmHasil+ 
		" anda beresiko mengidap 'KANKER SERVIKS' dengan CF = "+cffix);}
		else{hasilAwal.setText("Kesimpulan : Saudari "+nmHasil+ 
		" anda 'TIDAK' beresiko mengidap 'KANKER SERVIKS' dengan CF = "+cffix);}
		
		kembali.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent a = new Intent(HasilAwal.this,KankerServiks.class);
				a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(a);
			}
		});
		btnStadium.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				float sarat=Float.parseFloat(cfhasil.getText().toString());
				if(sarat>=0.8){
					String nmKrmStd = txtNamaHasil.getText().toString();
					Intent krmStd= new Intent(HasilAwal.this,Stadium2.class);
					krmStd.putExtra("",""+nmKrmStd);
					startActivity(krmStd);
					btnStadium.setClickable(true);}
				else{btnStadium.setClickable(false);}
				
			}
		});
		
	}

}
