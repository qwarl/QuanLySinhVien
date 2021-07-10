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
import com.example.quanlysinhvien.model.Lop;

import java.util.ArrayList;

public class LopAdapter extends BaseAdapter {
    Context context;
    ArrayList<Lop> dsLop;

    public LopAdapter(Context context, ArrayList<Lop> dsLop) {
        this.context = context;
        this.dsLop = dsLop;
    }

    @Override
    public int getCount() {
        return dsLop.size();
    }

    @Override
    public Object getItem(int position) {
        return dsLop.get(position);
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
            convertView = inflater.inflate(R.layout.item_lop, null);
            viewHolder.ivEdit = convertView.findViewById(R.id.ivEdit);
            viewHolder.ivDelete = convertView.findViewById(R.id.ivDelete);
            viewHolder.tvMalop = convertView.findViewById(R.id.tvMalop);
            viewHolder.tvTenLop = convertView.findViewById(R.id.tvTenLop);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvTenLop.setText(dsLop.get(position).getTenLop());
        viewHolder.tvMalop.setText(dsLop.get(position).getMaLop());
        return convertView;
    }

    class ViewHolder {
        ImageView ivEdit, ivDelete;
        TextView tvMalop, tvTenLop;
    }
}
