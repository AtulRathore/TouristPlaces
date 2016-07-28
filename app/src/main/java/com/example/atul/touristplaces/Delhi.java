package com.example.atul.touristplaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Atul on 02-07-2016.
 */
public class Delhi extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView3;
    String del[]={"Akshardham Temple","Bangla Sahib","Lodhi Graden","Raj Path"};
    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.delhi);
        listView3 = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> add = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,del);
        listView3.setAdapter(add);
        listView3.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent id1= new Intent(this,Akshardham.class);
                startActivity(id1);
                Toast.makeText(this, "Akshardham", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
