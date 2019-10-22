package com.example.gmail.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.gmail.R;
import com.example.gmail.model.data;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<data>

{
    private Context context;
    private int resource;
    private ArrayList<data> arrayData;

    public CustomAdapter(Context context, int resource, ArrayList<data> object)
    {
        super (context,resource,object );
        this.context = context;
        this.resource = resource;
        this.arrayData = object;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         convertView = LayoutInflater.from(this.context).inflate(R.layout.list_item_layout,parent, false);

        TextView avatar = convertView.findViewById(R.id.avatar);
        TextView sentName = convertView.findViewById(R.id.sentName);
        TextView content = convertView.findViewById(R.id.content);
        TextView time = convertView.findViewById(R.id.time);
        data dataList = arrayData.get(position);

//        avatar.setText(dataList.getImage());
//        sentName.setText(dataList.getSentName());
//        content.setText(dataList.getViewContent());
//        time.setText(dataList.getTime());

        return convertView;

    }
}
