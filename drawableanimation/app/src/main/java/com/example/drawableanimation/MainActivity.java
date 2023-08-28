package com.example.drawableanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rocketImage=(ImageView) findViewById(R.id.rocket_image);
        rocketImage.setBackgroundResource(R.drawable.rocket);
        rocketAnimation=(AnimationDrawable) rocketImage.getBackground();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){ //imageview를 터치하면
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            rocketAnimation.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}