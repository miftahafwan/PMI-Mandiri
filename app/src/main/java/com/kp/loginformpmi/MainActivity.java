package com.kp.loginformpmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kp.loginformpmi.StokDarah.StokDarahActivity;

public class MainActivity extends AppCompatActivity {
    Button btnstok,btnbencana,btnkegiatan,btnAktivitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstok=(Button)findViewById(R.id.btnStokDarah);

        btnstok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, StokDarahActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
