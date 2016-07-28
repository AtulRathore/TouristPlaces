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
public class Banglore extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView2;
    String ban [] = {"Lalbagh","Iskcon Temple","Wonderla","Museum"};
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.banglore);
        listView2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> adB = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ban);
        listView2.setAdapter(adB);
        listView2.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent ib1 = new Intent(this,Lalbagh.class);
                startActivity(ib1);
                Toast.makeText(this, "LalBagh", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
