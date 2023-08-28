package com.example.myapplication_0327_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton iButton;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        iButton = (ImageButton)findViewById(R.id.imageButton);
        textView =(TextView)findViewById(R.id.textview);

        textView.setText("텍스트 보이기");
        textView.setTextSize(30);


        iButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "이미지 버튼이 눌러짐", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.naver);

            }

        });

    }
}