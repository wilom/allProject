package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import data_base.EntitasDataKaryawan;
import com.wilom.data_karyawan.R;

import java.util.ArrayList;

/**
 * Created by HP on 20/02/2015.
 */
public class KaryawanBaseAdapter extends BaseAdapter {
    private static ArrayList<EntitasDataKaryawan> searchArrayList;
    private LayoutInflater mInflater;

    public KaryawanBaseAdapter(Context context, ArrayList<EntitasDataKaryawan> results) {
        searchArrayList=results;
        mInflater=LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return searchArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return searchArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        TempatTampil tampilkan;
        if(v==null){
            v=mInflater.inflate(R.layout.nyoba_lagi_activity, null);
            tampilkan= new TempatTampil();
            tampilkan.id=(TextView)v.findViewById(R.id.outId2);
            tampilkan.nm=(TextView)v.findViewById(R.id.outNama2);
            tampilkan.tgl=(TextView)v.findViewById(R.id.outTgl2);
            tampilkan.alm=(TextView)v.findViewById(R.id.outAlm2);
            tampilkan.lmker=(TextView)v.findViewById(R.id.outLmKrj2);
            tampilkan.tlp=(TextView)v.findViewById(R.id.outTlp2);
            tampilkan.gaj=(TextView)v.findViewById(R.id.outGaj2);
            v.setTag(tampilkan);
        }else{
            tampilkan=(TempatTampil)v.getTag();
        }
        tampilkan.id.setText(searchArrayList.get(i).getIdEn());
        tampilkan.nm.setText(searchArrayList.get(i).getNmEn());
        tampilkan.tgl.setText(searchArrayList.get(i).getTglEn());
        tampilkan.alm.setText(searchArrayList.get(i).getAlmEn());
        tampilkan.lmker.setText(searchArrayList.get(i).getStsEn());
        tampilkan.tlp.setText(searchArrayList.get(i).getTlpEn());
        tampilkan.gaj.setText(searchArrayList.get(i).getGajEn());
        return v;
    }
    static class TempatTampil{
        TextView id,nm,tgl,alm,lmker,tlp,gaj;
    }
}
