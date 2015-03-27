package data_base;

/**
 * Created by HP on 18/02/2015.
 */
public class EntitasDataKaryawan {
    String IdEn = ""; String lmkerEn = "";
    String NmEn = "";
    String TglEn = ""; String TlpEn = "";
    String AlmEn = ""; String GajEn = "";

    public void setIdEn(String id){
        this.IdEn = id;
    }
    public String getIdEn(){
        return IdEn;
    }//---------------ID---------
    public void setNmEn(String nm){
        this.NmEn = nm;
    }
    public String getNmEn(){
        return NmEn;
    }//----------------Nama-------
    public void setTglEn(String tgl){
        this.TglEn = tgl;
    }
    public String getTglEn(){
        return TglEn;
    }//----------------Tanggal-------
    public void setAlmEn(String alm){
        this.AlmEn = alm;
    }
    public String getAlmEn(){
        return AlmEn;
    }//----------------Alamat-------
    public void setLamaker(String lmker){
        this.lmkerEn = lmker;
    }
    public String getStsEn(){
        return lmkerEn;
    }//--------------Lamakerja-------
    public void setTlpEn(String tlp){
        this.TlpEn = tlp;
    }
    public String getTlpEn(){
        return TlpEn;
    }//----------------Telpon-------
    public void setGajEn(String gaj){
        this.GajEn = gaj;
    }
    public String getGajEn(){
        return GajEn;
    }//----------------Gaji-------



}
