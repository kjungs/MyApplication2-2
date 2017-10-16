package com.example.b10706.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.sample_0, "냉면", "6000"));
        data.add(new MyItem(R.drawable.sample_1, "라면", "4000"));
        data.add(new MyItem(R.drawable.sample_2, "김밥", "2000"));
        data.add(new MyItem(R.drawable.sample_3, "돈가스", "5000"));

        adapter = new MyAdapter(this, R.layout.item, data);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                String name = ((MyItem)adapter.getItem(position)).nName();
                Toast.makeText(MainActivity.this, name + " selected",
                        Toast.LENGTH_SHORT).show();

            }
        }

    }
}
