package com.example.myarc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

class MyView extends View {
    private Paint mPaints, mFramePaint, paint;
    private RectF mBigOval;
    private float mStart, mSweep;

    private static final float SWEEP_INC=2;
    private static final float START_INC=15;

    public MyView(Context context) {
        super(context);

        mPaints=new Paint();
        mPaints.setAntiAlias(true);
        mPaints.setStyle(Paint.Style.FILL);
        mPaints.setColor(0x88ff0000);

        mFramePaint=new Paint();
        mFramePaint.setAntiAlias(true);
        mFramePaint.setStyle(Paint.Style.STROKE);
        mFramePaint.setStrokeWidth(3);
        mFramePaint.setColor(0x8800ff00);
        mBigOval=new RectF(40, 10, 900, 1000);
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.YELLOW);
        canvas.drawRect(mBigOval, mFramePaint);
        canvas.drawArc(mBigOval, mStart, mSweep, false, mPaints);
        mSweep += SWEEP_INC;
        if(mSweep>360){
            mSweep-=360;
            mSweep+=START_INC;
            if(mStart>=360){
                mStart-=360;
            }
        }



        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(100);

        Typeface t;
        t = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("DEFAULT 폰트", 10, 1020, paint);

        t = Typeface.create(Typeface.SERIF, Typeface.ITALIC);
        paint.setTypeface(t);
        canvas.drawText("SERIF 폰트", 10, 1320, paint);

        t = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        paint.setTypeface(t);
        canvas.drawText("SANS_SERIF 폰트", 10, 1620, paint);

        Path path = new Path();
        path.moveTo(20, 400);
        path.lineTo(300, 800);
        path.cubicTo(450, 120, 600, 1200, 900, 800);

        paint.setColor(Color.BLUE);
        paint.setTextSize(200);
        canvas.drawTextOnPath("This is a test!!!", path, 0, 0, paint);

        invalidate();
    }
}
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
}