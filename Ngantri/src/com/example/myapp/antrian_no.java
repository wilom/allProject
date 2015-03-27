package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class antrian_no extends Activity  {
    static int antriangwe[]=new int[6];
    static int antrinoku=1;
    static int antriankeku=-1;
    final TextView no = (TextView)findViewById(R.id.noAntri);
    //String j = no.getText().toString();
    //TextToSpeech TTS;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button pglAntri = (Button)findViewById(R.id.btnNo);
        pglAntri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               no.setText("" + antrinoku);
               antriankeku = antriankeku + 1;
               antriangwe[antriankeku] = antrinoku;
               antrinoku = antrinoku + 1;
               no.setText(""+antrinoku);

            }
        });

    }

}
