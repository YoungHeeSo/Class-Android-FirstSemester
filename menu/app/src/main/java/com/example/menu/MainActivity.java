package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import org.jetbrains.annotations.NonNls;

public class MainActivity extends AppCompatActivity {
    LinearLayout view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        view1=(LinearLayout) findViewById(R.id.view1);

        switch(item.getItemId()) {
            case R.id.blue:
                view1.setBackgroundColor(Color.BLUE); break;
            case R.id.green:
                view1.setBackgroundColor(Color.GREEN); break;
            case R.id.red:
                view1.setBackgroundColor(Color.RED); break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}