package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class DiagnosaAwal1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_awal_1);
		final TextView txtNama2=(TextView)findViewById(R.id.txtNama2);
		final TextView cf1=(TextView)findViewById(R.id.cf1);
		
		final CheckBox ya5=(CheckBox)findViewById(R.id.ya5);
		final CheckBox ya6=(CheckBox)findViewById(R.id.ya6);
		final CheckBox ya7=(CheckBox)findViewById(R.id.ya7);
		final CheckBox ya8=(CheckBox)findViewById(R.id.ya8);
		final CheckBox ya9=(CheckBox)findViewById(R.id.ya9);
		final EditText cfuser5=(EditText)findViewById(R.id.cfuser5);
		final EditText cfuser6=(EditText)findViewById(R.id.cfuser6);
		final EditText cfuser7=(EditText)findViewById(R.id.cfuser7);
		final EditText cfuser8=(EditText)findViewById(R.id.cfuser8);
		final EditText cfuser9=(EditText)findViewById(R.id.cfuser9);
		final Button lanjut2=(Button)findViewById(R.id.lanjut2);
		
		Intent trm1=this.getIntent();
		txtNama2.setText(""+trm1.getStringExtra(""));
		cf1.setText(""+trm1.getStringExtra("''"));
		
		lanjut2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				float trmcf = Float.parseFloat(cf1.getText().toString());
				float getCf5 = Float.parseFloat(cfuser5.getText().toString());
				float getCf6 = Float.parseFloat(cfuser6.getText().toString());
				float getCf7 = Float.parseFloat(cfuser7.getText().toString());
				float getCf8 = Float.parseFloat(cfuser8.getText().toString());
				float getCf9 = Float.parseFloat(cfuser9.getText().toString());
				
				float g5=0;float g6=0;float g7=0;float g8=0;float g9=0;
				float cfk4=0;float cfk5=0;float cfk6=0;float cfk7=0;float cfk8=0;
				
				if(ya5.isChecked()){g5=(float)0.5*getCf5;}else{g5=0;}
				if(ya6.isChecked()){g6=(float)0.2*getCf6;}else{g6=0;}
				if(ya7.isChecked()){g7=(float)0.2*getCf7;}else{g7=0;}
				if(ya8.isChecked()){g8=(float)0.4*getCf8;}else{g8=0;}
				if(ya9.isChecked()){g9=(float)0.15*getCf9;}else{g9=0;}
				
				cfk4=trmcf+(g5*(1-trmcf));
				cfk5=cfk4+(g6*(1-cfk4));
				cfk6=cfk5+(g7*(1-cfk5));
				cfk7=cfk6+(g8*(1-cfk6));
				cfk8=cfk7+(g9*(1-cfk7));
				
				String nmKrm2=txtNama2.getText().toString();
				Intent krm2= new Intent(DiagnosaAwal1.this,DiagnosaAwal2.class);
				krm2.putExtra("",""+nmKrm2);
				krm2.putExtra("''",""+cfk8);
				startActivity(krm2);
			}
		});
	}
	
	

}