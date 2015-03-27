package com.wilom.kankerseriviks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tentang extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tentang);
		final Button kembalitentang=(Button)findViewById(R.id.kembaliTentang);
		
		kembalitentang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
			
		});
	}
}
