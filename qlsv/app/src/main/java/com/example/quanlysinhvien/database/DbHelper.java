package com.example.quanlysinhvien.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, "QLSV", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tao bang
        String sql = "CREATE TABLE LOP (MaLop text primary key, TenLop text)";
        db.execSQL(sql);
        //inser du lieu mau
        sql = "INSERT INTO LOP VALUES ('LT15306','Lớp Mobile LT15306')";
        db.execSQL(sql);
        sql = "INSERT INTO LOP VALUES ('LT15302','Lớp Mobile LT15302')";
        db.execSQL(sql);
        sql = "INSERT INTO LOP VALUES ('LT15304','Lớp Mobile LT15304')";
        db.execSQL(sql);
        sql = "CREATE TABLE SINHVIEN (MaSv text primary key,TenSv text,NgaySinh date, MaLop text references Lop(MaLop))";
        db.execSQL(sql);
        sql = "INSERT INTO SINHVIEN (MaSv,TenSv, NgaySinh,MaLop) VALUES ('PS10962','Nguyễn Ngọc Quân', '20/12/1998','LT15304')";
        db.execSQL(sql);
        sql = "INSERT INTO SINHVIEN (MaSv,TenSv, NgaySinh,MaLop) VALUES ('PS10501','Bùi Trương Mạnh Thông', '11/05/1999','LT15306')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS LOP");
        db.execSQL("DROP TABLE IF EXISTS SINHVIEN");
        onCreate(db);
    }
}
