package com.example.embed_video_playar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


LinearLayout video1,video2,video3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video1=findViewById(R.id.video1);
        video2=findViewById(R.id.video2);
        video3=findViewById(R.id.video3);




        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Video_playar2.Video_url="https://www.youtube.com/embed/FqunFInNtfg";
            Intent myIntent=new Intent(MainActivity.this,Video_playar2.class);
            startActivity(myIntent);

            }
        });



        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Video_playar2.Video_url="https://www.youtube.com/embed/gB-Fltsap0c";
                Intent myIntent=new Intent(MainActivity.this,Video_playar2.class);
                startActivity(myIntent);

            }
        });



        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Video_playar2.Video_url="https://www.youtube.com/embed/RGIgwcTNCuY";
                Intent myIntent=new Intent(MainActivity.this,Video_playar2.class);
                startActivity(myIntent);

            }
        });


    }
}