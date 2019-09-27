package com.raden.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTelpon = findViewById(R.id.btnTelpon);

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                telponNomor(v);
            }
        });
    }

    public void buttonSimulasinilai(View view){
        Intent intent = new Intent(MainActivity.this, SimulasinilaiActivity.class);
        startActivity(intent);
    }

    public void buttonCuaca(View view){
        Intent intent = new Intent(MainActivity.this, CuacaActivity.class);
        startActivity(intent);
    }

    public void buttonNilai(View view){
        Intent intent = new Intent(MainActivity.this, NilaiActivity.class);
        startActivity(intent);
    }

    public void buttonProfil(View view){
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void telponNomor(View view){
        Uri uri = Uri.parse("tel:085245894354");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void buttonIkon2(View view){
        Intent intent = new Intent(MainActivity.this, Ikon2Activity.class);
        startActivity(intent);
    }

    public void buttonSaran(View view){
        Intent intent = new Intent(MainActivity.this, SaranActivity.class);
        startActivity(intent);
    }

    public void buttonTentang(View view){
        Intent intent = new Intent(MainActivity.this, TentangActivity.class);
        startActivity(intent);
    }

}
