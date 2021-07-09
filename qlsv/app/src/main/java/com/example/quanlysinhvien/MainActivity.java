package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnQuanLyLop,btnQuanLySinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setId();
    }

    private void setId() {
        btnQuanLyLop=findViewById(R.id.btnQuanLyLop);
        btnQuanLySinhVien=findViewById(R.id.btnQuanLySinhVien);
        btnQuanLyLop.setOnClickListener(this);
        btnQuanLySinhVien.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnQuanLyLop:
                quanLyLop();
                break;
            case R.id.btnQuanLySinhVien:
                quanLySinhVien();
                break;
        }
    }

    private void quanLySinhVien() {
//        Intent intent=new Intent(this,)
    }

    private void quanLyLop() {
    }
}