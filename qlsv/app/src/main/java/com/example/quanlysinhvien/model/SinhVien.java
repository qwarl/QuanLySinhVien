package com.example.quanlysinhvien.model;

public class SinhVien {
    private String tenSv;
    private String maLop;
    private String ngaySinh;
    private String maSv;

    public SinhVien() {
    }

    public SinhVien(String tenSv, String maLop, String ngaySinh, String maSv) {
        this.tenSv = tenSv;
        this.maLop = maLop;
        this.ngaySinh = ngaySinh;
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
}
