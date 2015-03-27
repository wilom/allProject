package com.wilom.Jualan;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ToggleButton;

/**
 * Created by HP on 16/02/2015.
 */
public class Foto extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foto);
        final ToggleButton tb = (ToggleButton)findViewById(R.id.onof);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tb.equals("Lanjutkan")){}
                else if(tb.equals("Hentikan")){finish();}
            }
        });
        if(tb.isClickable()){
            TextToSpeech.ACTION_TTS_QUEUE_PROCESSING_COMPLETED.equals("meneng wae");}
    }
}
