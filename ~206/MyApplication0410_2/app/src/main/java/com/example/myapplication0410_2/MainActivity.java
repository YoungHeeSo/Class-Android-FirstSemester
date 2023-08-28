package com.example.myapplication0410_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onCheckboxClicked(View view){
        boolean Checked = ((CheckBox) view).isChecked(); //checkBox를 여러개 쓸때

        switch(view.getId()){
            case R.id.checkBox1:
                if(Checked) imageView1.setImageResource(R.drawable.meat);
                else imageView1.setImageResource(0);
                break;

            case R.id.checkBox2:
                if(Checked) imageView2.setImageResource(R.drawable.cheese);
                else imageView2.setImageResource(0);
                break;

        }
    }
}