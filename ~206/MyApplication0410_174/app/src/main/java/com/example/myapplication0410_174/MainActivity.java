package com.example.myapplication0410_174;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();

        if(on){
            imageView.setImageResource(R.drawable.cheese);
        } else{
            imageView.setImageResource(0);
        }
    }
}