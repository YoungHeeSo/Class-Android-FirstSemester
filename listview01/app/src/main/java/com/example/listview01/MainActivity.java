package com.example.listview01;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = {"Apple", "Apricot", "Avocado", "Banana", "Blackberry",
                "Apple", "Apricot", "Avocado", "Banana", "Blackberry",
                "Apple", "Apricot", "Avocado", "Banana", "Blackberry"};

        //ArrayAdapter 구성하는게 중요!
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(
                this, android.R.layout.simple_expandable_list_item_1, values);
        setListAdapter(adapter); // == setContentView(R.layout.activity_main);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(getApplicationContext(), item+" Selected.", Toast.LENGTH_SHORT).show();
    }
}