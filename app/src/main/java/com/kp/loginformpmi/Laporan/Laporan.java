package com.kp.loginformpmi.Laporan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class Laporan extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        ArrayList<Map<String, String>> listlaporan = listData();
        String[] data = { "judul", "deskripsi" };

        int[] target= { android.R.id.text1, android.R.id.text2 };

        SimpleAdapter adapter = new SimpleAdapter(this, listlaporan,
                android.R.layout.simple_list_item_2, data, target);
        setListAdapter(adapter);
    }

    private ArrayList<Map<String, String>> listData() {
        ArrayList<Map<String, String>> listLaporan = new ArrayList<Map<String, String>>();
        listLaporan.add(setData("Laporan Juli 2019", "10 aktivitas 3 info"));
        listLaporan.add(setData("Laporan Juni 2019", "5 Aktivitas 10 info"));
        listLaporan.add(setData("Laporan Mei 2019", "13 aktivitas 2 info"));
        return listLaporan;
    }

    //SetData adalah fungsi untuk menyimpan negara dan ibukota dalam satu object
// menggunakan tipe data HashMap, selanjutnya fungsi ini dipanggil di ListData
    private HashMap<String, String> setData(String judul, String deskripsi) {
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("judul", judul);
        item.put("deskripsi", deskripsi);
        return item;
    }

}