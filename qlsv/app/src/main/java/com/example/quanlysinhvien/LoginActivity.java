package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etDangNhap, etMatKhau;
    Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setId();
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangNhap();
            }
        });
    }

    private void setId() {
        etDangNhap = findViewById(R.id.etDangNhap);
        etMatKhau = findViewById(R.id.etMatKhau);
        btnDangNhap = findViewById(R.id.btnDanNhap);

    }

    private void dangNhap() {
        Intent intent = new Intent();
        if (etDangNhap.getText().toString().equals("admin") && etMatKhau.getText().toString().equals("admin")) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Sai ten dang nhap hoac mak khau, moi thu lai", Toast.LENGTH_SHORT).show();
        }
    }

}