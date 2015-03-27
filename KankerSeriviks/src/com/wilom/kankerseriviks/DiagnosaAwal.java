package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DiagnosaAwal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_awal);
		final TextView txtNama1=(TextView)findViewById(R.id.txtNama1);
		final CheckBox ya1=(CheckBox)findViewById(R.id.ya1);
		final CheckBox ya2=(CheckBox)findViewById(R.id.ya2);
		final CheckBox ya3=(CheckBox)findViewById(R.id.ya3);
		final CheckBox ya4=(CheckBox)findViewById(R.id.ya4);
		final EditText cfuser1=(EditText)findViewById(R.id.cfuser1);
		final EditText cfuser2=(EditText)findViewById(R.id.cfuser2);
		final EditText cfuser3=(EditText)findViewById(R.id.cfuser3);
		final EditText cfuser4=(EditText)findViewById(R.id.cfuser4);
		final Button lanjut1=(Button)findViewById(R.id.lanjut1);
		
		Intent i=this.getIntent();
		txtNama1.setText(""+i.getStringExtra(""));
		
		lanjut1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				float getCf1 = Float.parseFloat(cfuser1.getText().toString());
				float getCf2 = Float.parseFloat(cfuser2.getText().toString());
				float getCf3 = Float.parseFloat(cfuser3.getText().toString());
				float getCf4 = Float.parseFloat(cfuser4.getText().toString());
				float g1=0;float g2=0;float g3=0;float g4=0;
				float cfk1=0;float cfk2=0;float cfk3=0;
				if(ya1.isChecked()){g1=(float)0.45*getCf1;}else{g1=0;}
				if(ya2.isChecked()){g2=(float)0.35*getCf2;}else{g2=0;}
				if(ya3.isChecked()){g3=(float)0.25*getCf3;}else{g3=0;}
				if(ya4.isChecked()){g4=(float)0.3*getCf4;}else{g4=0;}
				cfk1=g1+(g2*(1-g1));
				cfk2=cfk1+(g3*(1-cfk1));
				cfk3=cfk2+(g4*(1-cfk2));
				String nmKrm1=txtNama1.getText().toString();
				Intent krm1= new Intent(DiagnosaAwal.this,DiagnosaAwal1.class);
				krm1.putExtra("",""+nmKrm1);
				krm1.putExtra("''",""+cfk3);
				startActivity(krm1);
			}
		});
		
	}
	

}
