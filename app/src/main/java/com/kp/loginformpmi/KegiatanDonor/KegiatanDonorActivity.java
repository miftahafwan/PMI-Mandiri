package com.kp.loginformpmi.KegiatanDonor;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class KegiatanDonorActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ArraylistNegara didapat dari fungsi listData()


        ArrayList<Map<String, String>> listNegara = listData();
        String[] data = { "judul", "deskripsi" };

        int[] target= { android.R.id.text1, android.R.id.text2 };

        SimpleAdapter adapter = new SimpleAdapter(this, listNegara,
                android.R.layout.simple_list_item_2, data, target);
        setListAdapter(adapter);
    }
// fungsi listData dipakai untuk menambahkan data negara kedalam ArrayList
//fungsi ini memanfaatkan fungsi setData.

    private ArrayList<Map<String, String>> listData() {
        ArrayList<Map<String, String>> listAktivitas = new ArrayList<Map<String, String>>();
        listAktivitas.add(setData("Galeri PMI Mall Metropolitan", "Senin-Rabu pukul 10.00-14.00"));
        listAktivitas.add(setData("UTD PMI Kota Bekasi", "Setiap hari pukul 9.00-16.30"));

        return listAktivitas;
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