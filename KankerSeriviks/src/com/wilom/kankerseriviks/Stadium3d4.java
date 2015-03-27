package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Stadium3d4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stadium_3d4);
		final CheckBox yaS31 = (CheckBox)findViewById(R.id.yaS31);
		final CheckBox yaS32 = (CheckBox)findViewById(R.id.yaS32);
		final CheckBox yaS33 = (CheckBox)findViewById(R.id.yaS33);
		final CheckBox yaS4 = (CheckBox)findViewById(R.id.yaS4);
		final Button diagStadium34 = (Button)findViewById(R.id.diagStadium34);
		final Button kembali2 = (Button)findViewById(R.id.kembali2);
		final TextView txtNamaStd34= (TextView)findViewById(R.id.txtNamaStd34);
		final TextView hasil34 = (TextView)findViewById(R.id.hasilS34);
		
		Intent trmStd2=this.getIntent();
		txtNamaStd34.setText(""+trmStd2.getStringExtra(""));
		
		diagStadium34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String getNm = txtNamaStd34.getText().toString();
				int perS31;int perS32;int perS33;int perS4;
				int hasil3;int hasil4;int hasil31;int hasil32;int hasil33;
				int hasil312;int hasil322;int hasil332;
				if(yaS31.isChecked()){perS31=75;}else{perS31=0;}
				if(yaS32.isChecked()){perS32=10;}else{perS32=0;}
				if(yaS33.isChecked()){perS33=15;}else{perS33=0;}
				if(yaS4.isChecked()){perS4=100;}else{perS4=0;}
				
				hasil31=perS31;hasil32=perS32;hasil33=perS33;
				hasil312=perS31+perS32;
				hasil322=perS31+perS33;
				hasil332=perS32+perS33;
				hasil3=perS31+perS32+perS33;
				
				hasil4=perS4;
				
				if(yaS31.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil31+"%");
					}
				if(yaS32.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil32+"%");
					}
				if(yaS33.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil33+"%");
					}
				//----
				if(yaS31.isChecked()&&yaS32.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil312+"%");
					}
				if(yaS31.isChecked()&&yaS33.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil322+"%");
					}
				if(yaS32.isChecked()&&yaS33.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil332+"%");
					}
				//-----
				if(yaS31.isChecked()&&yaS32.isChecked()&&yaS33.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil3+"%");
				}
				//----
				if(yaS31.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil31+"%");
						}
				if(yaS32.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil32+"%");
						}
				if(yaS33.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil33+"%");
						}
				//--
				if(yaS31.isChecked()&&yaS32.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil312+"%");
						}
				if(yaS31.isChecked()&&yaS33.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil322+"%");
						}
				if(yaS32.isChecked()&&yaS33.isChecked()&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 3' dengan persentase = "+hasil332+"%");
						}
				if(yaS31.isChecked()&&yaS32.isChecked()&&yaS33.isChecked()
				&&yaS4.isChecked()){
					hasil34.setText("Kasimpulan : Saudari "+getNm+
					" Kanker Serviks anda berada pada 'STADIUM 4' dengan persentase = "+hasil4+"%");
				}
			}});
		kembali2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent a = new Intent(Stadium3d4.this,KankerServiks.class);
				a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(a);
			}
		});
	}
}
