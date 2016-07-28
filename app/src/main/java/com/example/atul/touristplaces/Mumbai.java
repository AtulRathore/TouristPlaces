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
public class Mumbai extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView7;
    String mu[]= {"Bandra Worlie Sea Line","Gateway Of India","Marine Drive","SiddhiVinayak Temple"};

    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.mumbai);
        listView7 = (ListView) findViewById(R.id.listView7);
        ArrayAdapter<String> adm = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mu);
        listView7.setAdapter(adm);
        listView7.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                Intent im1 = new Intent(this,BandraWorlie.class);
                startActivity(im1);
                Toast.makeText(this, "Worlie Sea Link", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                break;
        }
    }
}
