package com.example.quanlysinhvien.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysinhvien.R;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;

public class SinhVienAdapter extends BaseAdapter {
    Context context;
    ArrayList<SinhVien> dsSv;

    public SinhVienAdapter(Context context, ArrayList<SinhVien> dsSv) {
        this.context = context;
        this.dsSv = dsSv;
    }

    @Override
    public int getCount() {
        return dsSv.size();
    }

    @Override
    public Object getItem(int position) {
        return dsSv.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_sinhvien, null);
            viewHolder.ivEdit = convertView.findViewById(R.id.ivEdit);
            viewHolder.ivDelete = convertView.findViewById(R.id.ivDelete);
            viewHolder.tvHoTen = convertView.findViewById(R.id.tvHoTen);
            viewHolder.tvMaSinhVien = convertView.findViewById(R.id.tvMaSinhVien);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvHoTen.setText(dsSv.get(position).getTenSv());
        viewHolder.tvMaSinhVien.setText(dsSv.get(position).getMaSv());
        return convertView;
    }

    class ViewHolder {
        TextView tvHoTen, tvMaSinhVien;
        ImageView ivEdit, ivDelete;
    }
}
