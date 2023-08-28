package com.example.myphotoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    float scaleX=1.0f, scaleY=1.0f, rotateAngle;
    MyView displayView;
    private MyView display;

    public class MyView extends View {
        public MyView(MainActivity context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint paint = new Paint();

            int centerX = getWidth()/2;
            int centerY = getHeight()/2;

            canvas.scale(scaleX, scaleY, centerX, centerY);
            canvas.rotate(rotateAngle, centerX, centerY);

            Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.cut);

            int rcX = centerX - picture.getWidth()/2;
            int rcY = centerY - picture.getHeight()/2;

            canvas.drawBitmap(picture, rcX, rcY, paint);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.imageDisplay);
        displayView = new MyView(this);
        layout.addView(displayView);
    }

    public void expand(View view){
        scaleX +=0.3;
        scaleY +=0.3;
        displayView.invalidate();
    }

    public void shrink(View view){
        scaleX -=0.3;
        scaleY -=0.3;
        displayView.invalidate();
    }

    public void rotateLeft(View view){
        rotateAngle -=30;
        displayView.invalidate();
    }

    public void rotateRight(View view){
        rotateAngle +=30;
        displayView.invalidate();
    }
}