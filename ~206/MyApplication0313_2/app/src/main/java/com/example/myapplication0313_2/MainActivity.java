package com.example.myapplication0313_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Toast.makeText(getApplicationContext(), "세단을 선택했습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onClick1(View view){
        Toast.makeText(getApplicationContext(), "SUV을 선택했습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View view){
        Toast.makeText(getApplicationContext(), "제출되었습니다.", Toast.LENGTH_SHORT).show();
    }
}