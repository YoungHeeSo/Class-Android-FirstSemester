package com.example.mydraw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    private  SingleTouchView drawView;
    private ImageButton currpaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView=(SingleTouchView) findViewById(R.id.drawing);
        LinearLayout paintLayout =(LinearLayout) findViewById(R.id.paint_colors);
        currpaint=(ImageButton) paintLayout.getChildAt(0);//
    }
    public void clicked(View view){
        if(view!= currpaint){//현재 선택한 버튼이 ..? 현재와 같지 않다면?
            String color=view.getTag().toString();//태그 색상을 불러와서 저장
            drawView.setColor(color);//컬러 재설정
            currpaint=(ImageButton) view;
        }
    }
}