package com.wilom.kankerseriviks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoServiks extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_serviks);
		final Button kembaliInfo=(Button)findViewById(R.id.kembaliInfo);
		final TextView txtNamaInfo=(TextView)findViewById(R.id.namaInfo);
		Intent i=this.getIntent();
		txtNamaInfo.setText(""+i.getStringExtra(""));
		kembaliInfo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
			
		});
	}

}
