package com.hanbit.user.myapp160702.ContactActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanbit.user.myapp160702.R;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-09.
 */
public class ContactsAdapter extends BaseAdapter {
    private static ArrayList<ContactsBean> list ;
    private LayoutInflater inflater ;
    //풍선같은 기능 ㅇㅇ 레이아웃을 만들어버림 풍선처럼
    private Integer[] imgs ={
            R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecream, R.drawable.jellybean,
            R.drawable.kitkat, R.drawable.lollipop };
    //풍선같은 기능 ㅇㅇ 그림을 만들어버림 풍선처럼

    public ContactsAdapter(Context context, ArrayList<ContactsBean> list) {
        this.list =list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView ==null ){
            convertView =inflater.inflate(null,null);
            vh = new ViewHolder();
            vh.tvname =(TextView) convertView.findViewById(R.id.name);
            vh.tvphone = (TextView) convertView.findViewById(R.id.phone);
            vh.photo = (ImageView) convertView.findViewById(R.id.photo);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        vh.tvname.setText(list.get(position).getName());
        vh.tvphone.setText(list.get(position).getNumber());
        vh.photo.setImageResource(0);
        return null;
    }
    static class ViewHolder{
        TextView tvname;
        TextView tvphone;
        ImageView photo;
    }
}
