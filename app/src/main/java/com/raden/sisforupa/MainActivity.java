package com.raden.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void buttonIkon1(View view){
        Intent intent = new Intent(MainActivity.this, Ikon1Activity.class);
        startActivity(intent);
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
