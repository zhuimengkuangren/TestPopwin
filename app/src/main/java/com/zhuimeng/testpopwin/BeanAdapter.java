package com.zhuimeng.testpopwin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhuimeng on 2017/11/5.
 */

public class BeanAdapter extends BaseAdapter{
    private Context mContext;
    private List<Bean> beanList;
    private View view;

    public BeanAdapter(Context mContext, List<Bean> beanList) {
        this.mContext = mContext;
        this.beanList = beanList;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int i) {
        return beanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (mContext == null){
            mContext = viewGroup.getContext();
        }
        Bean bean = (Bean) getItem(i);
        if (holder == null){
            holder = new ViewHolder();
//            view = View.inflate(mContext, R.layout.item_listview, null);
            view = LayoutInflater.from(mContext).inflate(R.layout.item_listview, viewGroup, false);
            holder.name = view.findViewById(R.id.tv_name);
            holder.menu = view.findViewById(R.id.iv_menu);
//            holder.iconSelected = view.findViewById(R.id.cb_iconSelected);
            view.setTag(holder);
        } else {
            view = convertview;
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(beanList.get(i).getName());
        if (beanList.get(i).getName().equals("费率")){
            holder.menu.setVisibility(View.VISIBLE);
        }
//        holder.iconSelected.setSelected(beanList.get(i).isSelected());
        return view;
    }

    class ViewHolder{
        TextView name;
        ImageView menu;
    }
}
