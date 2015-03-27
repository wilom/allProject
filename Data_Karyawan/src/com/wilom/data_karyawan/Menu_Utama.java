package com.wilom.data_karyawan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class Menu_Utama extends Activity{

    //TextView txtKeInputData;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button keInput = (Button)findViewById(R.id.btnKe1);
        keInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               Intent i = new Intent(Menu_Utama.this, InputKaryawan.class);
                startActivity(i);
           }});

    }

}
