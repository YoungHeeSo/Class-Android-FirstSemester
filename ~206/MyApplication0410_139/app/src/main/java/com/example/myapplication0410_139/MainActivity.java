package com.example.myapplication0410_139;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container =(LinearLayout) findViewById(R.id.LayoutManager);
        container.setOrientation(LinearLayout.HORIZONTAL);

        /*
        container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(this);
        b1.setText("첫번째버튼");
        container.addView(b1);

        Button b2 = new Button(this);
        b1.setText("두번째버튼");
        container.addView(b2);

        setContentView(container);
        */


    }
}