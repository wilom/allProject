package com.wilom.Jualan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Jualan extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button ft=(Button)findViewById(R.id.foto);
        final Button ms=(Button)findViewById(R.id.musik);
        final Button br=(Button)findViewById(R.id.broser);
        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Jualan.this, Foto.class);
                startActivity(i);
            }
        });
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jualan.this, Foto.class);//blm
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jualan.this, Foto.class);
            }
        });
    }
}
