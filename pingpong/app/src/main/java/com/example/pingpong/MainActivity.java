package com.example.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MySurfaceView view; //MySurfaceView 만든걸 불러옴

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new MySurfaceView(this); //view객체로 만듬
        setContentView(view); //화면에 보이도록 설정
    }
    @Override
    protected void onPause(){
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }
}