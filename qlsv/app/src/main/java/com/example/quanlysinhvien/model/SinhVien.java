package com.example.quanlysinhvien.model;

public class SinhVien {
    private String tenSv;
    private String maSv;

    public SinhVien() {
    }

    public SinhVien(String tenSv, String maSv) {
        this.tenSv = tenSv;
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
}
