package com.example.ff_task6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
MediaPlayer mp;
TextView a;
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        a= findViewById(R.id.textView5);
        if(getIntent().getStringExtra("musiqi").equals("bach")){
        a.setText("Sebastiyan Bax - Tokkata");}
        if(getIntent().getStringExtra("musiqi").equals("brahms")){
            a.setText("Brahms - Macar Rəqsi");}
        if(getIntent().getStringExtra("musiqi").equals("katyusha")){
            a.setText("Katyuşa");}
        if(getIntent().getStringExtra("musiqi").equals("dvorak")){
            a.setText("Dvorak - Yeni Dünya Simfoniyası");}
        if(getIntent().getStringExtra("musiqi").equals("mosart")){
            a.setText("Mozart-Türk Marşı");}
        if(getIntent().getStringExtra("musiqi").equals("offenbach")){
            a.setText("Offenbax - Can Can");}
        if(getIntent().getStringExtra("musiqi").equals("prokofiev")){
            a.setText("Prokofyev - Romeo və Culyetta");}
        if(getIntent().getStringExtra("musiqi").equals("rimskikorsakov")){
            a.setText("Rimski Korsakov - Şəhrizad");}
        if(getIntent().getStringExtra("musiqi").equals("tchaikovsky1")){
            a.setText("Çaykovski - Quların Rəqsi");}
        if(getIntent().getStringExtra("musiqi").equals("tchaikovsky2")){
            a.setText("Çaykovski - Şelkunçik");}
        if(getIntent().getStringExtra("musiqi").equals("tchaikovsky3")){
            a.setText("Çaykovski - Trepak (rus rəqsi)");}
        if(getIntent().getStringExtra("musiqi").equals("tguliyev")){
            a.setText("Tofiq Quliyev - Qaytağı");}

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);




        if(mp!=null) {

            mp.release();
        }


        int t = getResources().getIdentifier(getIntent().getStringExtra("musiqi"), "raw",getPackageName());
        mp = MediaPlayer.create(Main3Activity.this, t);
        mp.start();




    }

    public void play(View view) {
        mp.start();
    }

    public void pause(View view) {
        mp.pause();
    }

    public void returnback(View view) {

        if(mp!=null) {

            mp.release();
        }

        Intent i = new Intent(Main3Activity.this, Main2Activity.class);


        startActivity(i);
        finish();



    }
}
