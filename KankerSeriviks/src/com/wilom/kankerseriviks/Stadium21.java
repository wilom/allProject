package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Stadium21 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stadium_21);
		final TextView persenStd2= (TextView)findViewById(R.id.persenStd2);
		final TextView txtStdNama1= (TextView)findViewById(R.id.txtStdNama1);
		final TextView hasilDiag2= (TextView)findViewById(R.id.hasilDiag2);
		final Button diagStd2=(Button)findViewById(R.id.diagStd2);
		final Button kembali1=(Button)findViewById(R.id.kembali1);
		final Button btnStadium3=(Button)findViewById(R.id.btnStadium3);
		final CheckBox yaS24= (CheckBox)findViewById(R.id.yaS24);
		final CheckBox yaS25= (CheckBox)findViewById(R.id.yaS25);
		
		Intent trmhasil=this.getIntent();
		persenStd2.setText(""+trmhasil.getStringExtra("''"));
		txtStdNama1.setText(""+trmhasil.getStringExtra(""));
		//-------------
		diagStd2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
		int ambPer=Integer.parseInt(persenStd2.getText().toString());
		String nmaAmb= txtStdNama1.getText().toString();
		int per4=0;int per5=0;
		int perHasil2;
		if(yaS24.isChecked()){per4=10;}else{per4=0;}
		if(yaS25.isChecked()){per5=5;}else{per5=0;}
		perHasil2=ambPer+per4+per5;
		if(perHasil2<100){
		hasilDiag2.setText("Kesimpulan : Saudari "+nmaAmb+
		" Kanker Serviks anda di 'STADIUM 2' dengan persentase = "+perHasil2+"%");
		btnStadium3.setClickable(false);
		}else{
		hasilDiag2.setText("Kesimpulan : Saudari "+nmaAmb+
		" Kanker Serviks anda di 'STADIUM 2' dengan persentase = "+perHasil2+"%");
		btnStadium3.setClickable(true);}}
		});
		//--------------------------
		btnStadium3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			String krmNm = txtStdNama1.getText().toString();
			Intent krmStd= new Intent(Stadium21.this,Stadium3d4.class);
			krmStd.putExtra("",""+krmNm);
			startActivity(krmStd);
			}
		});
		//--
		kembali1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent a = new Intent(Stadium21.this,KankerServiks.class);
				a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(a);
			}
		});
	}

}
