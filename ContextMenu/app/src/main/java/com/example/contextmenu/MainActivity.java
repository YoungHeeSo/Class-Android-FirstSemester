package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.Textview01);
        registerForContextMenu(text);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 1, 0, "배경색:RED");
        menu.add(0, 2, 0, "배경색:GREEN");
        menu.add(0, 3, 0, "배경색:BLUE");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case 1:
                text.setBackgroundColor(Color.RED);
                return true;
            case 2:
                text.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                text.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onContextItemSelected(item);

        }
    }
}