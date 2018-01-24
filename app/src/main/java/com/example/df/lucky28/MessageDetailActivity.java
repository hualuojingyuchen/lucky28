package com.example.df.lucky28;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2018/01/24 0024.
 */
public class MessageDetailActivity extends AppCompatActivity{

    private ListView listview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new Myadapter());
    }
    private class Myadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                convertView = View.inflate(MessageDetailActivity.this,R.layout.list_item,null);
            }
            return convertView;
        }
    }
}
