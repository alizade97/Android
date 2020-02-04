package com.example.ff12;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6, img7, img8, img9,img10,img11,img12;
    Button start;
    ObjectAnimator o1,o2,o3,o4,o5, o6, o7,o8,o9,o10,o11,o12;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        img2 = (ImageView)findViewById(R.id.imageView12);
       img3 = (ImageView)findViewById(R.id.imageView11);
        img4 = (ImageView)findViewById(R.id.imageView10);
       img5 = (ImageView)findViewById(R.id.imageView9);
        img6 = (ImageView)findViewById(R.id.imageView4);
        img7 = (ImageView)findViewById(R.id.imageView14);
        img8 = (ImageView)findViewById(R.id.imageView15);
        img9 = (ImageView)findViewById(R.id.imageView16);
        img10 = (ImageView)findViewById(R.id.imageView17);
        img11 = (ImageView)findViewById(R.id.imageView18);
        img12 = (ImageView)findViewById(R.id.imageView19);


        start = findViewById(R.id.button2);


        o2 = ObjectAnimator.ofFloat(img2,"y",1950);
       o3 = ObjectAnimator.ofFloat(img3,"y",1950);
        o4 = ObjectAnimator.ofFloat(img4,"y",1950);
     o5 = ObjectAnimator.ofFloat(img5,"y",1950);
        o6 = ObjectAnimator.ofFloat(img6,"y",1950);
        o7 = ObjectAnimator.ofFloat(img7,"y",1900);
        o8 = ObjectAnimator.ofFloat(img8,"y",1950);
        o9 = ObjectAnimator.ofFloat(img9,"y",1950);
        o10 = ObjectAnimator.ofFloat(img10,"y",1950);
        o11= ObjectAnimator.ofFloat(img11,"y",1950);
        o12= ObjectAnimator.ofFloat(img12,"y",1950);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                o2.setDuration(9000);
                o3.setDuration(8000);
                o4.setDuration(7000);
                o5.setDuration(9000);
                o6.setDuration(8000);
                o7.setDuration(8000);
                o8.setDuration(9000);
                o9.setDuration(8000);
                o10.setDuration(7000);
                o11.setDuration(9000);
                o12.setDuration(8000);


                o2.start();
                o3.start();
                o4.start();
                o5.start();
                o6.start();
                o7.start();
                o8.start();
                o9.start();
                o10.start();
                o11.start();
                o12.start();

            }
        });





}



}
