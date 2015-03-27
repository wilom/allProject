package com.wilom.CloudCoba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class CloudActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final String isilist[]={"Aqua","Coca-cola","Sprite","Susu","Kopi"};
        final Button Ambil =(Button)findViewById(R.id.Ambil);
        final TextView Hasil = (TextView)findViewById(R.id.Hasil);
        final ListView menu = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adpGejala = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_multiple_choice, isilist);
        menu.setAdapter(adpGejala);
        menu.setSelected(true);

        Ambil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menu.isItemChecked(0)){Hasil.setText("Anda memilih minuman SEHAT");}
                if(menu.isItemChecked(1)){Hasil.setText("Anda memilih Soda");}
                if(menu.isItemChecked(2)){Hasil.setText("Anda memilih Soda");}
                if(menu.isItemChecked(3)){Hasil.setText("Anda memilih minuman SEHAT");}
                if(menu.isItemChecked(4)){Hasil.setText("Anda memilih minuman KAFEIN");}
                }
        });
    }
}
