package com.example.lap4_hieunm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class manHinhNhan extends AppCompatActivity {
Button btnBaoGia;
EditText edtGiaNhap;
TextView txtNhanVe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_nhan);
        btnBaoGia = findViewById(R.id.btnBaoGia);
        edtGiaNhap = findViewById(R.id.edtGiaNhap);
        txtNhanVe = findViewById(R.id.txtNhanVe);

        Intent intent = getIntent();
        String price = intent.getStringExtra("guidulieu");
        txtNhanVe.setText(price);

        btnBaoGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String priceQuote = edtGiaNhap.getText().toString();
                Intent i = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("guiGia", priceQuote);
                i.putExtras(bundle);
                setResult(1, i);
                finish();

            }
        });
    }
}