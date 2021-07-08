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
    Button btnDangNhap, btnHuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etDangNhap=findViewById(R.id.etDangNhap);
        etMatKhau=findViewById(R.id.etMatKhau);
        btnDangNhap=findViewById(R.id.btnDanNhap);
        btnHuy=findViewById(R.id.btnHuy);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etDangNhap.getText().toString();
                String password=etMatKhau.getText().toString();
                Toast.makeText(LoginActivity.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}