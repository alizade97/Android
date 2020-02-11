package com.example.ff_task6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView l;
    ArrayList<String> a;
    ArrayAdapter ad;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    l = findViewById(R.id.listView);
    a= new ArrayList<String>();
        Field[] f = R.raw.class.getFields();
        for(int i=0;i<f.length;i++) {

            a.add(f[i].getName());

        }
        ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, a);
        l.setAdapter(ad);


        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(mp!=null) {

                    mp.release();
                }


                Intent i = new Intent(Main2Activity.this, Main3Activity.class);


                String ssss = (String) parent.getItemAtPosition(position);
                i.putExtra("musiqi", ssss);
                startActivity(i);
                finish();




            }
        });

        }




    }

