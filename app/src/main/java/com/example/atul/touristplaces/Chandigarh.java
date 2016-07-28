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
public class Chandigarh extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView4;
    String ch[] = {"Rock Garden","Rose Garden","Sukhma Lake","Timber Trail"};
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.chandigarh);
        listView4 = (ListView) findViewById(R.id.listView4);
        ArrayAdapter<String> adch = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ch);
        listView4.setAdapter(adch);
        listView4.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent ic1= new Intent(this,RockGarden.class);
                startActivity(ic1);
                Toast.makeText(this, "Rock Garden", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Intent ic2= new Intent(this,RoseGarden.class);
                startActivity(ic2);
                Toast.makeText(this, "Rose Garden", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
