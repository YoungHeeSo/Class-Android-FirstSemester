package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);

        tv1 = (TextView) findViewById(R.id.textview1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1 = tv1.getText().toString();
                int num = Integer.parseInt(st1) + 1;
                tv1.setText("" + num);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1 = tv1.getText().toString();
                int num = Integer.parseInt(st1) - 1;
                tv1.setText("" + num);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1 = tv1.getText().toString();
                int num = Integer.parseInt(st1);
                int result = Integer.parseInt(st1) - num;
                tv1.setText("" + result);
            }
        });

    }
}
