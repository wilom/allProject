package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class DiagnosaAwal3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_awal_3);
		final TextView txtNama4=(TextView)findViewById(R.id.txtNama4);
		final TextView cf3=(TextView)findViewById(R.id.cf3);
		
		final CheckBox ya14=(CheckBox)findViewById(R.id.ya14);
		final CheckBox ya15=(CheckBox)findViewById(R.id.ya15);
		final CheckBox ya16=(CheckBox)findViewById(R.id.ya16);
		final EditText cfuser14=(EditText)findViewById(R.id.cfuser14);
		final EditText cfuser15=(EditText)findViewById(R.id.cfuser15);
		final EditText cfuser16=(EditText)findViewById(R.id.cfuser16);
		
		final Button diagAwal=(Button)findViewById(R.id.diagAwal);
		
		Intent trm3=this.getIntent();
		txtNama4.setText(""+trm3.getStringExtra(""));
		cf3.setText(""+trm3.getStringExtra("''"));
		
		diagAwal.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				float trmcf2 = Float.parseFloat(cf3.getText().toString());
				float getCf14 = Float.parseFloat(cfuser14.getText().toString());
				float getCf15 = Float.parseFloat(cfuser15.getText().toString());
				float getCf16 = Float.parseFloat(cfuser16.getText().toString());
				
				float g14=0;float g15=0;float g16=0;
				float cfk13=0;float cfk14=0;float cfk15=0;
				
				if(ya14.isChecked()){g14=(float)0.7*getCf14;}else{g14=0;}
				if(ya15.isChecked()){g15=(float)0.6*getCf15;}else{g15=0;}
				if(ya16.isChecked()){g16=(float)0.7*getCf16;}else{g16=0;}
				
				cfk13=trmcf2+(g14*(1-trmcf2));
				cfk14=cfk13+(g15*(1-cfk13));
				cfk15=cfk14+(g16*(1-cfk14));
				String nmKrm4=txtNama4.getText().toString();
				Intent krm4= new Intent(DiagnosaAwal3.this,HasilAwal.class);
				krm4.putExtra("",""+nmKrm4);
				krm4.putExtra("''",""+cfk15);
				startActivity(krm4);
			}
		});
	}
	

}