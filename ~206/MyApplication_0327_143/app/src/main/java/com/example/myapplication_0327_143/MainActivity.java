package com.example.myapplication_0327_143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.View1);
        tv2 = (TextView) findViewById(R.id.View2);
        tv3 = (TextView) findViewById(R.id.View3);
    }
        public void onClick(View view){
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.INVISIBLE);
            tv3.setVisibility(View.INVISIBLE);
            switch (view.getId()){
                case R.id.Button1:
                    tv1.setVisibility(View.VISIBLE);
                    break;
                case R.id.Button2:
                    tv2.setVisibility(View.VISIBLE);
                    break;
                case R.id.Button3:
                    tv3.setVisibility(View.VISIBLE);
                    break;

        }

    }
}