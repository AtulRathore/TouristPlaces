package com.example.atul.touristplaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by Atul on 02-07-2016.
 */
public class MetroCitiies extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    String cities[] = {"Banglore","Chandigarh","Chennai","Delhi","Kolkata","Mumbai"};
    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.metrocities);
        ArrayAdapter<String> cit = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cities);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(cit);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch(i){

            case 0:
                Intent ib= new Intent(this,Banglore.class);
                startActivity(ib);
                Toast.makeText(this, "Banglore", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Intent i2= new Intent(this,Chandigarh.class);
                startActivity(i2);
                Toast.makeText(this, "Chandigarh", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Intent i3= new Intent(this,Chennai.class);
                startActivity(i3);
                Toast.makeText(this, "Chennai", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Intent i4= new Intent(this,Delhi.class);
                startActivity(i4);
                Toast.makeText(this, "Delhi", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Intent i5= new Intent(this,Kolkata.class);
                startActivity(i5);
                Toast.makeText(this, "Kolkata", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Intent i7= new Intent(this,Mumbai.class);
                startActivity(i7);
                Toast.makeText(this, "Mumbai", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
