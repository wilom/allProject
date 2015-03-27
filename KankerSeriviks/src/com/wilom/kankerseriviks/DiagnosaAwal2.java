package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class DiagnosaAwal2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_awal_2);
		final TextView txtNama3=(TextView)findViewById(R.id.txtNama3);
		final TextView cf2=(TextView)findViewById(R.id.cf2);
		
		final CheckBox ya10=(CheckBox)findViewById(R.id.ya10);
		final CheckBox ya11=(CheckBox)findViewById(R.id.ya11);
		final CheckBox ya12=(CheckBox)findViewById(R.id.ya12);
		final CheckBox ya13=(CheckBox)findViewById(R.id.ya13);
		final EditText cfuser10=(EditText)findViewById(R.id.cfuser10);
		final EditText cfuser11=(EditText)findViewById(R.id.cfuser11);
		final EditText cfuser12=(EditText)findViewById(R.id.cfuser12);
		final EditText cfuser13=(EditText)findViewById(R.id.cfuser13);
		final Button lanjut3=(Button)findViewById(R.id.lanjut3);
		
		Intent trm2=this.getIntent();
		txtNama3.setText(""+trm2.getStringExtra(""));
		cf2.setText(""+trm2.getStringExtra("''"));
		
		lanjut3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				float trmcf1 = Float.parseFloat(cf2.getText().toString());
				float getCf10 = Float.parseFloat(cfuser10.getText().toString());
				float getCf11 = Float.parseFloat(cfuser11.getText().toString());
				float getCf12 = Float.parseFloat(cfuser12.getText().toString());
				float getCf13 = Float.parseFloat(cfuser13.getText().toString());
				
				float g10=0;float g11=0;float g12=0;float g13=0;
				float cfk9=0;float cfk10=0;float cfk11=0;float cfk12=0;
				
				if(ya10.isChecked()){g10=(float)0.5*getCf10;}else{g10=0;}
				if(ya11.isChecked()){g11=(float)0.4*getCf11;}else{g11=0;}
				if(ya12.isChecked()){g12=(float)0.15*getCf12;}else{g12=0;}
				if(ya13.isChecked()){g13=(float)0.8*getCf13;}else{g13=0;}
				
				cfk9=trmcf1+(g10*(1-trmcf1));
				cfk10=cfk9+(g11*(1-cfk9));
				cfk11=cfk10+(g12*(1-cfk10));
				cfk12=cfk11+(g13*(1-cfk11));
				
				String nmKrm3=txtNama3.getText().toString();
				Intent krm3= new Intent(DiagnosaAwal2.this,DiagnosaAwal3.class);
				krm3.putExtra("",""+nmKrm3);
				krm3.putExtra("''",""+cfk12);
				startActivity(krm3);
			}
		});
	}
	

}