package com.maxi.android.curso.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.maxi.android.curso.Adapter.CustomListViewAdapter;
import com.maxi.android.curso.Entity.Icono;
import com.maxi.android.curso.R;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new CustomListViewAdapter(this,
                R.layout.adapter_custom_listview_row, Icono.getList());

        listView.setAdapter(adapter);
    }
}
