package com.example.myapplication0320_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        //익명클래스
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "리스너객체 버튼이 눌러졌습니다.", Toast.LENGTH_LONG).show();
            }
        });

        //람다식
        button.setOnClickListener((e)-> {
            Toast.makeText(getApplicationContext(), "(리스너객체이용)버튼이 눌러졌습니다.", Toast.LENGTH_SHORT).show();
        });
    }
    public void onClick(View view){
        Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.", Toast.LENGTH_LONG).show();
    }


}