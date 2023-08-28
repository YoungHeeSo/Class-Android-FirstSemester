package com.example.imagedisp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

class  MyView extends View {
    public MyView(Context context){
        super(context);
        setBackgroundColor(Color.YELLOW);

    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.cut);
        canvas.drawBitmap(b, 0, 0, null);

        //축소,확대
        Bitmap sb = Bitmap.createScaledBitmap(b, 300, 300, false); //사진크기
        canvas.drawBitmap(sb, 1100, 0, null); //사진 위치

        //상하 반전
        Matrix m = new Matrix();
        m.preScale(1, -1);
        Bitmap mb = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), m, false);
        canvas.drawBitmap(mb, 0, 700, null);

    }
}
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w);
    }
}