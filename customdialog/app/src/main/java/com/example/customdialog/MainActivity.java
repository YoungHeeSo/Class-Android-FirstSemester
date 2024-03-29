package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
    public void onClick(View v){
        final Dialog loginDialog = new Dialog(this);
        loginDialog.setContentView(R.layout.custom_dialog);
        loginDialog.setTitle("로그인 화면");

        Button login = (Button) loginDialog.findViewById(R.id.login);
        Button cancel = (Button) loginDialog.findViewById(R.id.cancel);
        final EditText username=(EditText) loginDialog.findViewById(R.id.username);
        final EditText password=(EditText) loginDialog.findViewById(R.id.pasword);
        //final 현재 메소드에서 안에 리스너를 호출할때

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().trim().length()>0
                && password.getText().toString().trim().length()>0){
                    Toast.makeText(getApplicationContext(),"로그인 성공",
                            Toast.LENGTH_LONG).show();
                    loginDialog.dismiss();
                }else {
                    Toast.makeText(getApplicationContext(),"다시 입력하시오",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginDialog.dismiss();
            }
        });
        loginDialog.show();
    }

}