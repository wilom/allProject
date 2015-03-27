package com.wilom.data_karyawan;

import adapter.KaryawanBaseAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import data_base.DatabaseManager;
import data_base.EntitasDataKaryawan;

//import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * Created by HP on 18/02/2015.
 */
public class InputKaryawan extends Activity implements OnClickListener {
    EditText inId,inNama,inTglLahir,inAlamat,inLmKrj,inTlp,inGaji;
    Button tombolSimpan,tombolHtgGaji;
    ListView lv;
    DatabaseManager dm;
    EntitasDataKaryawan komponendata;
    ArrayList<EntitasDataKaryawan> isiDataKaryawan = new ArrayList<EntitasDataKaryawan>();
    Context context;
    //DecimalFormat decimalFormat;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_karyawan1);
        dm = new DatabaseManager(this);
        inId = (EditText)findViewById(R.id.inId1);
        inNama = (EditText)findViewById(R.id.inNama1);
        inTglLahir = (EditText)findViewById(R.id.inTglLahir1);
        inAlamat = (EditText)findViewById(R.id.inAlamat1);
        inLmKrj = (EditText)findViewById(R.id.inLmKrj1);
        inTlp = (EditText)findViewById(R.id.inTlp1);
        inGaji = (EditText)findViewById(R.id.inGaji1);
        tombolHtgGaji = (Button)findViewById(R.id.btnHitungG1);
        tombolSimpan = (Button)findViewById(R.id.btnSimpan);
        tombolHtgGaji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               hitungGaji();
            }
        });
        lv=(ListView)findViewById(R.id.listKaryawan2);
        tombolSimpan.setOnClickListener(this);
        inGaji.setOnClickListener(this);
        tampilDataKaryawan();
    }

    @Override
    public void onClick(View view) {
        String getId = inId.getText().toString();
        String getNama = inNama.getText().toString();
        String getTglLahir = inTglLahir.getText().toString();
        String getAlamat = inAlamat.getText().toString();
        String getLmKrj = inLmKrj.getText().toString();
        String getTlp = inTlp.getText().toString();
        String getGaji = inGaji.getText().toString();
        dm.addDataKaryawan(getId,getNama,getTglLahir,getAlamat,getLmKrj,getTlp,getGaji);
        tampilDataKaryawan();
        inId.setText("");
        inNama.setText("");
        inTglLahir.setText("");
        inAlamat.setText("");
        inLmKrj.setText("");
        inTlp.setText("");
        inGaji.setText("");
        konKosong();
    }
    public void tampilDataKaryawan(){
    isiDataKaryawan.clear();
        ArrayList<ArrayList<Object>> data = dm.ambilSemuaBaris();
        for(int p=0;p<data.size();p++){
            komponendata = new EntitasDataKaryawan();
            ArrayList<Object> baris = data.get(p);
            Log.e("baris",baris.get(0).toString());
            Log.e("baris",baris.get(1).toString());
            Log.e("baris",baris.get(2).toString());
            Log.e("baris",baris.get(3).toString());
            Log.e("baris",baris.get(4).toString());
            Log.e("baris",baris.get(5).toString());
            Log.e("baris",baris.get(6).toString());
            komponendata.setIdEn(baris.get(0).toString());
            komponendata.setNmEn(baris.get(1).toString());
            komponendata.setTglEn(baris.get(2).toString());
            komponendata.setAlmEn(baris.get(3).toString());
            komponendata.setLamaker(baris.get(4).toString());
            komponendata.setTlpEn(baris.get(5).toString());
            komponendata.setGajEn(baris.get(6).toString());
            isiDataKaryawan.add(komponendata);
        }
        KaryawanBaseAdapter dataKaryawan = new KaryawanBaseAdapter(InputKaryawan.this,isiDataKaryawan);
        lv.setAdapter(dataKaryawan);
    }

    public void hitungGaji() {
        String ambilLama = inLmKrj.getText().toString();
        int intLama = Integer.parseInt(ambilLama);
        int gapok=2000000;
        int tun=250000;
        int gatot=0;
        if(intLama<2){
            gatot=gapok;
        }
        else if(intLama>=2 && intLama<5){
            gatot=gapok+tun;
        }else if(intLama>=5 && intLama<10){
            gatot=gapok+(tun*2);
        }else if(intLama>=10 && intLama<15){
            gatot=gapok+(tun*3);
        }else if(intLama>=15 && intLama<20){
            gatot=gapok+(tun*4);
        }else{
            gatot=50000000;
        }
        //Locale idLocale= new Locale("id");
        //DecimalFormatSymbols dfs= new DecimalFormatSymbols(idLocale);
        //dfs.setCurrencySymbol("Rp. ");
        //decimalFormat = new DecimalFormat("\u00A4##,###.##");
        String hsl = Integer.toString(gatot);
        inGaji.setText("Rp. " + hsl);
    }
public void konKosong(){
    String id1 = inId.getText().toString();


    Toast.makeText(context, "Ada yang kosong", Toast.LENGTH_SHORT).show();}



}
