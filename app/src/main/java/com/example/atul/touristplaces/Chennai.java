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
public class Chennai extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView5;
    String cha[] = {"Basant Nagar Beach","Kapaleshwar Temple","Parth Temple","Vadapalanimurugan Temple"};
    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.chennai);
        listView5 = (ListView) findViewById(R.id.listView5);
        ArrayAdapter<String> adC = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cha);
        listView5.setAdapter(adC);
        listView5.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent ich1= new Intent(this,BasantNagar.class);
                startActivity(ich1);
                Toast.makeText(this, "Basant Nagar", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                break;

        }
    }
}
