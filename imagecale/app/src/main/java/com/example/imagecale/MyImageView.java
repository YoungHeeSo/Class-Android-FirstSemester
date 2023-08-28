package com.example.imagecale;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

public class MyImageView extends View {
    private Drawable image;
    private ScaleGestureDetector gestureDetector;
    private float scale=1.0f;

    public MyImageView(Context context) {
        super(context);
        image=context.getResources().getDrawable(R.drawable.cut); //사진 불러오기
        setFocusable(true); //화면에 포커스를 가지게 해줌
        image.setBounds(0,0,image.getIntrinsicWidth(),image.getIntrinsicHeight());
        gestureDetector = new ScaleGestureDetector(context, new ScaleListener());
    }

    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.save();
        canvas.scale(scale, scale);
        image.draw(canvas); //확대된, 축소된 그림으로 보이게 해줌
        canvas.restore(); //그림을 그려놓고 그림을 복원(표시)해줌
    }

    public boolean onTouchEvent(MotionEvent event){
        gestureDetector.onTouchEvent(event);
        invalidate();

        return true;
    }//터치이벤트에 의해서 사진이 확대축소됨

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            scale *= detector.getScaleFactor();

            if(scale < 0.1f) //스케일이 0.1가장 작은 크기면 이 크기에 맞춰 갱신한다다
               scale=0.1f;
            if(scale > 10.f)
                scale=10.f;

            invalidate();
            return true;
        }
    }//확대축소 이벤트 일어났는지 확인한다
}
