package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Stadium2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stadium_2);
		final TextView txtNamaStd=(TextView)findViewById(R.id.txtNamaStd);
		final CheckBox yaS21 = (CheckBox)findViewById(R.id.yaS21);
		final CheckBox yaS22 = (CheckBox)findViewById(R.id.yaS22);
		final CheckBox yaS23 = (CheckBox)findViewById(R.id.yaS23);
		final Button lanjutStd=(Button)findViewById(R.id.lanjutStd);
		
		Intent trmStd=this.getIntent();
		txtNamaStd.setText(""+trmStd.getStringExtra(""));
		
		lanjutStd.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
		int per1=0;int per2=0;int per3=0;
		int perHasil1;
		if(yaS21.isChecked()){per1=50;}else{per1=0;}
		if(yaS22.isChecked()){per2=25;}else{per2=0;}
		if(yaS23.isChecked()){per3=10;}else{per3=0;}
		perHasil1=per1+per2+per3;
		
		String nmKrmStd1 = txtNamaStd.getText().toString();
		Intent krmStd1= new Intent(Stadium2.this,Stadium21.class);
		krmStd1.putExtra("",""+nmKrmStd1);
		krmStd1.putExtra("''",""+perHasil1);
		startActivity(krmStd1);
			}		
		});
		
		
	}
}
