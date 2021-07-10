package com.example.quanlysinhvien.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysinhvien.database.DbHelper;
import com.example.quanlysinhvien.model.Lop;

import java.util.ArrayList;

public class LopDAO {
    DbHelper dbHelper;

    public LopDAO(Context context) {
        dbHelper = new DbHelper(context);
    }

    public ArrayList<Lop> readAll() {
        ArrayList<Lop> dsLop = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM LOP", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String maLop = cursor.getString(0);
            String tenLop = cursor.getString(1);
            dsLop.add(new Lop(maLop, tenLop));
            cursor.moveToNext();
        }
        cursor.close();
        return dsLop;
    }
}
