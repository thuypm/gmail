package com.example.gmail;
import com.example.gmail.model.data;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import com.example.gmail.adapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<data> arrayData = new ArrayList<>();

        listView = findViewById(R.id.listView);

        data data1 = new data("Phạm Minh Thùy", "this is an demo email as my email", "12:40 PM");
        data data2 = new data("Super Mario", "this is an bug", "5:30 PM");
        data data3 = new data("Bill Gate", "no tittle", "0:20 AM");
        data data4 = new data("Marron 5", "my name","0:20 AM");
        data data5 = new data("My name", "this is an demo email as my email","5:30 PM");
        data data6 = new data("null null", "this is an demo email as my email","5:30 PM");
        data data7 = new data("Quang Le", "this is an demo email as my email","5:30 PM");


        arrayData.add(data1);
        arrayData.add(data2);
        arrayData.add(data3);
        arrayData.add(data4);
        arrayData.add(data5);
        arrayData.add(data6);
        arrayData.add(data7);

        CustomAdapter customAdapter =new CustomAdapter(this, R.layout.list_item_layout, arrayData);

        this.listView.setAdapter(customAdapter);
    }
}
