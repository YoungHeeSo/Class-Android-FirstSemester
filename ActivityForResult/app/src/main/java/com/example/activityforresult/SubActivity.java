package com.example.activityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        text=(TextView) findViewById(R.id.textview4);
        edit=(EditText) findViewById(R.id.edit5);
        Button button_ok = (Button) findViewById(R.id.button2);

        Intent intent = getIntent();
        int result = intent.getIntExtra("number1", 0)+intent.getIntExtra("number2", 0);
        edit.setText(""+result);
        text.setText(" "+intent.getIntExtra("number1", 0)+"+"+intent.getIntExtra("number2",0));

        button_ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("RESULT", Integer.parseInt(edit.getText().toString()));
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button button_cancel = (Button) findViewById(R.id.button3);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}