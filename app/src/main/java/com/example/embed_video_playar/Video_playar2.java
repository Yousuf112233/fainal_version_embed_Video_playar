package com.example.embed_video_playar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Video_playar2 extends AppCompatActivity {

  WebView webview;
  View toast;

 public static  String Video_url="";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_playar2);

        webview=findViewById(R.id.webview);
        toast=findViewById(R.id.toast);



        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(Video_url);


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(Video_playar2.this,"Good bay",Toast.LENGTH_LONG).show();
            }
        });


    }
}