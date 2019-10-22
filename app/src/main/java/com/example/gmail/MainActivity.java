package com.example.gmail;
import com.example.gmail.model.data;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import com.example.gmail.adapter.CustomAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private class getAPITask extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... voids) {
           try{
               URL url = new URL("https://jsonplaceholder.typicode.com/users?fbclid=IwAR3Pu2RkKKQKIE2KBclYcHld_6gTqBpElPzWToMR2StBfX7LE5xm6r5tWzw");
               HttpURLConnection con = (HttpURLConnection) url.openConnection();
               con.setRequestMethod("GET");

               BufferedReader reader = new BufferedReader(
                       new InputStreamReader(con.getInputStream()));
               String line;
               StringBuilder builder = new StringBuilder();
               while ((line = reader.readLine()) != null)
                   builder.append(reader.readLine());
               reader.close();

               Gson gson = new Gson();

               Type dataType = new TypeToken<ArrayList<data>>(){}.getType();

               List<data> arrData = gson.fromJson(builder.toString(), dataType);

               Log.v("test", "đây là sdt");
               Log.v("test", arrData.get(2).phone);





           }catch (Exception e)
           {


           }

            return null;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("lol", "thử xem có chạy ko");
        super.onCreate(savedInstanceState);
        new getAPITask().execute();
        setContentView(R.layout.activity_main);
        ArrayList<data> arrayData = new ArrayList<>();


        listView = findViewById(R.id.listView);


//        data data1 = new data("Phạm Minh Thùy", "this is an demo email as my email", "12:40 PM");
//        data data2 = new data("Super Mario", "this is an bug", "5:30 PM");
//        data data3 = new data("Bill Gate", "no tittle", "0:20 AM");
//        data data4 = new data("Marron 5", "my name","0:20 AM");
//        data data5 = new data("My name", "this is an demo email as my email","5:30 PM");
//        data data6 = new data("null null", "this is an demo email as my email","5:30 PM");
//        data data7 = new data("Quang Le", "this is an demo email as my email","5:30 PM");
//        arrayData.add(data1);
//        arrayData.add(data2);
//        arrayData.add(data3);
//        arrayData.add(data4);
//        arrayData.add(data5);
//        arrayData.add(data6);
//        arrayData.add(data7);

//        CustomAdapter customAdapter =new CustomAdapter(this, R.layout.list_item_layout, arrayData);
//        this.listView.setAdapter(customAdapter);
    }
}
