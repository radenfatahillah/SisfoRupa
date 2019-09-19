package com.raden.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimulasinilaiActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editabsen;
    private EditText edittugas;
    private EditText edituts;
    private EditText edituas;
    private Button btnCalculate;
    private TextView tvResult;
    private String huruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasinilai);

        editabsen = findViewById(R.id.edit_absen);
        edittugas = findViewById(R.id.edit_tugas);
        edituts = findViewById(R.id.edit_uts);
        edituas = findViewById(R.id.edit_uas);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculate) {
            String inputAbsen = editabsen.getText().toString().trim();
            String inputTugas =edittugas.getText().toString().trim();
            String inputUTS = edituts.getText().toString().trim();
            String inputUAS = edituas.getText().toString().trim();
            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;
            if (TextUtils.isEmpty(inputAbsen)) {
                isEmptyFields = true;
                editabsen.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputTugas)) {
                isEmptyFields = true;
                edittugas.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputUTS)) {
                isEmptyFields = true;
                edituts.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputUAS)) {
                isEmptyFields = true;
                edituas.setError("Field ini tidak boleh kosong");
            }
            Double absen = toDouble(inputAbsen);
            Double tugas = toDouble(inputTugas);
            Double uts = toDouble(inputUTS);
            Double uas = toDouble(inputUAS);
            if (absen == null) {
                isInvalidDouble = true;
                editabsen.setError("Field ini harus berupa nomer yang valid");
            }
            if (tugas == null) {
                isInvalidDouble = true;
                edittugas.setError("Field ini harus berupa nomer yang valid");
            }
            if (uts == null) {
                isInvalidDouble = true;
                edituts.setError("Field ini harus berupa nomer yang valid");
            }
            if (uas == null) {
                isInvalidDouble = true;
                edituas.setError("Field ini harus berupa nomer yang valid");
            }
            if (!isEmptyFields && !isInvalidDouble) {
                double hasil = (((16*100)/16)/10) + ((20*tugas)/100) + ((30*uts)/100) + ((40*uas)/100);
                if(hasil>= 80 && hasil <=100) huruf = "A";
                else if(hasil>= 76 && hasil <=79) huruf = "B+";
                else if(hasil>= 70 && hasil <=75) huruf = "B";
                else if(hasil>= 65 && hasil <=69) huruf = "C+";
                else if(hasil>= 60 && hasil <=64) huruf = "C";
                else if(hasil>= 56 && hasil <=59) huruf = "D+";
                else if(hasil>= 50 && hasil <=55) huruf = "D";
                else if(hasil>= 0 && hasil <=49) huruf = "E";
                tvResult.setText(String.valueOf(huruf));
            }
        }
    }

    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
