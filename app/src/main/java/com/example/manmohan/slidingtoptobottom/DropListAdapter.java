package com.example.manmohan.slidingtoptobottom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Manmohan on 4/4/2016.
 */
public class DropListAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    Activity activity;
    List<Object> drawerItemArrayList;
    static class ViewHolder {
        protected TextView drawerItem_TV;
        protected CheckBox checkBox1;
    }

    public DropListAdapter(Context context, List<Object> drawerItemArrayList) {
        super();
        this.context = context;
        this.drawerItemArrayList = drawerItemArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.drawer_item_list,
                    parent, false);

            viewHolder.drawerItem_TV = (TextView) convertView
                    .findViewById(R.id.code);
            viewHolder.checkBox1 = (CheckBox) convertView.findViewById(R.id.checkBox1);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Mode tempDrawerItem = (Mode) drawerItemArrayList.get(position);

        viewHolder.drawerItem_TV.setText(tempDrawerItem.getTitle());
        viewHolder.checkBox1.setChecked(tempDrawerItem.isSelected());
        return convertView;

    }

    @Override
    public int getCount() {
        return drawerItemArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}