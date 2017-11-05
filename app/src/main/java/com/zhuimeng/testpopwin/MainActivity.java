package com.zhuimeng.testpopwin;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    private Bean[] beanData = {new Bean("推介排序", true), new Bean("费率", false),
            new Bean("随机", false)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        final List<Bean> beanList = new ArrayList<>();
        for (int i = 0; i < beanData.length; i++) {
            beanList.add(beanData[i]);
        }

        BeanAdapter beanAdapter = new BeanAdapter(mContext, beanList);
        listView.setAdapter(beanAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("Main", "click");
                Bean bean = beanList.get(i);
//                view.findViewById(R.id.tv_name).setSelected(true);
//                Toast.makeText(mContext, beanList.get(i).getName(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, bean.getName(), Toast.LENGTH_SHORT).show();
//                view.setBackgroundColor(Color.parseColor("#00f"));
            }
        });
    }

}
