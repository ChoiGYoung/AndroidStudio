package com.cookandroid.a201958087;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView mini,mini2,mini3;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("자기 소개 앱");

        mini = (ImageView) findViewById(R.id.mini);
        mini2 = (ImageView) findViewById(R.id.mini2);
        mini3 = (ImageView) findViewById(R.id.mini3);

        }

    public void ButtonClick(View v) {
        changeImage();
    }

    public void changeImage(){

        if(imageIndex == 0){
            mini.setVisibility(View.VISIBLE);
            mini2.setVisibility(View.INVISIBLE);
            mini3.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        }

        else if(imageIndex == 1){
            mini.setVisibility(View.INVISIBLE);
            mini2.setVisibility(View.VISIBLE);
            mini3.setVisibility(View.INVISIBLE);
            imageIndex = 2;
        }
        else if(imageIndex == 2) {
            mini.setVisibility(View.INVISIBLE);
            mini2.setVisibility(View.INVISIBLE);
            mini3.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }



    }
}