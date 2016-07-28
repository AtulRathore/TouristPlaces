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
public class Kolkata extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String kl[]= {"Dakshineshwar Temple","Edan Garden","Howrah Bridge","Victoria Hall"};
    ListView listView6;
    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.kolkata);
        listView6 = (ListView) findViewById(R.id.listView6);
        ArrayAdapter<String> adk = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,kl);
        listView6.setAdapter(adk);
        listView6.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent ik1= new Intent(this,Dakshineshwar.class);
                startActivity(ik1);
                Toast.makeText(this, "Dakshineshwar", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
