package com.example.quanlysinhvien.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysinhvien.database.DbHelper;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;

public class SinhVienDAO {
    DbHelper dbHelper;

    public SinhVienDAO(Context context) {
        dbHelper = new DbHelper(context);
    }
    public ArrayList<SinhVien> readAll() {
        ArrayList<SinhVien> dsSv = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SINHVIEN", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String maSv = cursor.getString(0);
            String tenSv = cursor.getString(1);
            String maLop=cursor.getString(2);
            String ngaySinh= cursor.getString(3);
            dsSv.add(new SinhVien(maSv, tenSv, maLop,ngaySinh));
            cursor.moveToNext();
        }
        cursor.close();
        return dsSv;
    }

}
