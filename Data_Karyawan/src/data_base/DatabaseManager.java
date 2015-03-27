package data_base;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DatabaseManager {

	private static final String IdKaryawan = "ID_KARYAWAN";
	private static final String NamaKaryawan= "NAMA_RAYAWAN";
	private static final String TglLahir = "TANGGAL_LAHIR";
    private static final String Alamat = "ALAMAT";
    private static final String LamaKerja = "LAMAKERJA";
    private static final String NoTlp = "NO_TLP_HP";
    private static final String Gaji = "GAJI";
    private static final String NamaDB = "data_karyawan";// nama database
	private static final String NamaTabel = "tabel_karyawan";// nama tabel
	private static final int DB_VERSION = 1;

	private static final String CREATE_TABLE = "create table " + NamaTabel
			+ " (" + IdKaryawan + " integer PRIMARY KEY autoincrement, " + NamaKaryawan
			+ " text," + TglLahir + " text"
            + " text," + Alamat + " text"
            + " text," + LamaKerja + " text"
            + " text," + NoTlp + " text"
            + " text," + Gaji + " text)";

	private final Context context;
	private DatabaseOpenHelper dbHelper;
	private SQLiteDatabase db;

	public DatabaseManager(Context ctx) {
		this.context = ctx;
		dbHelper = new DatabaseOpenHelper(ctx);
		db = dbHelper.getWritableDatabase();
	}

	private static class DatabaseOpenHelper extends SQLiteOpenHelper {

		public DatabaseOpenHelper(Context context) {
			super(context, NamaDB, null, DB_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL(CREATE_TABLE);
			ContentValues values = new ContentValues();
			values.put(IdKaryawan, "01");
			values.put(NamaKaryawan, "Wilom");
            values.put(TglLahir, "05-01-1988");
            values.put(Alamat, "Kalasan");
            values.put(LamaKerja, "1");
            values.put(NoTlp, "081806009656");
            values.put(Gaji, "Rp. 2000000");

			db.insert(NamaTabel, null, values);
            values.put(IdKaryawan, "02");
            values.put(NamaKaryawan, "Bang Jali");
            values.put(TglLahir, "05-12-1988");
            values.put(Alamat, "Kalasan");
            values.put(LamaKerja, "2");
            values.put(NoTlp, "081806009656");
            values.put(Gaji, "Rp. 2500000");

            db.insert(NamaTabel, null, values);

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + NamaDB);
			onCreate(db);
		}
	}

	public void close() {
		dbHelper.close();
	}

	public void addDataKaryawan(String id, String nm, String tgl,
    String alm,String lmkrj,String tlp, String gaj) {           //bikin tempat lain  juga

		ContentValues values = new ContentValues();
		values.put(IdKaryawan, id);
		values.put(NamaKaryawan, nm);
        values.put(TglLahir, tgl);
        values.put(Alamat, alm);
        values.put(LamaKerja, lmkrj);
        values.put(NoTlp, tlp);
        values.put(Gaji, gaj);
		try {
			db.insert(NamaTabel, null, values);
		} catch (Exception e) {
			Log.e("DB ERROR", e.toString());
			e.printStackTrace();
		}
	}

	public ArrayList<ArrayList<Object>> ambilSemuaBaris() {

		ArrayList<ArrayList<Object>> dataArray = new ArrayList<ArrayList<Object>>();
		Cursor cur;
		try {
			cur = db.query(NamaTabel, new String[] { IdKaryawan, NamaKaryawan, TglLahir, Alamat, LamaKerja, NoTlp, Gaji },
					null, null, null, null, null);
			cur.moveToFirst();
			if (!cur.isAfterLast()) {
				do {
					ArrayList<Object> dataList = new ArrayList<Object>();

					dataList.add(cur.getString(0));
					dataList.add(cur.getString(1));
                    dataList.add(cur.getString(2));
                    dataList.add(cur.getString(3));
                    dataList.add(cur.getString(4));
                    dataList.add(cur.getString(5));
                    dataList.add(cur.getString(6));

					dataArray.add(dataList);
					Log.e("data", cur.getString(0));
					Log.e("data", cur.getString(1));
                    Log.e("data", cur.getString(2));
                    Log.e("data", cur.getString(3));
                    Log.e("data", cur.getString(4));
                    Log.e("data", cur.getString(5));
                    Log.e("data", cur.getString(6));
				} while (cur.moveToNext());

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.e("DEBE ERROR", e.toString());
			Toast.makeText(context, "gagal ambil semua baris:" + e.toString(),
					Toast.LENGTH_SHORT).show();
		}
		return dataArray;
	}

	/*public ArrayList<Object> terjemahkan(String in) {
		ArrayList<Object> arrbaris = new ArrayList<Object>();
		Cursor cursor;
		try {
			cursor = db.rawQuery("Select * from " + NamaTabel + " WHERE "
					+ IdKaryawan + " LIKE '%" + in + "%'", null);
			if (cursor != null) {
				Log.e("error","aaa");
			}else{

				Log.e("error","bbb");
			}
			cursor.moveToFirst();
			if (!cursor.isAfterLast()) {
				do {
					arrbaris.add(cursor.getLong(0));
					arrbaris.add(cursor.getString(1));
					arrbaris.add(cursor.getString(2));
				} while (cursor.moveToNext());
				String r = String.valueOf(arrbaris);
				Toast.makeText(context, "haha" + r, Toast.LENGTH_SHORT).show();
			}
			cursor.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.e("error", e.toString());
			Toast.makeText(context, "hhii" + e.toString(), Toast.LENGTH_SHORT)
					.show();
		}

		return arrbaris;
	}*/

}
