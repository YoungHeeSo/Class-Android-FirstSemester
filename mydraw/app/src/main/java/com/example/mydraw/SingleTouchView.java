package com.example.mydraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;

import android.view.MotionEvent;
import android.view.View;

public class SingleTouchView extends View {
    private Paint paint =new Paint();
    private Path path= new Path();
    private int paintColor=0xff000000;
    private Paint canvaspaint;
    private Canvas drawCanvas;
    private Bitmap canvasBitmap;
    public SingleTouchView(Context context, AttributeSet attrs){
        super(context, attrs);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10f);
        paint.setColor(paintColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);//선과선이 연결되는 부분을 라운드로 처리
    }
    @Override
    protected void onSizeChanged(int w,int h,int oldw,int oldh){//윈도우 크기가 바뀌었을때
        super.onSizeChanged(w,h,oldw,oldw);
        canvasBitmap=Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888);//다시 색상조정.
        drawCanvas=new Canvas(canvasBitmap);
        canvaspaint=new Paint(Paint.DITHER_FLAG);
    }
    @Override
    public void onDraw(Canvas canvas){
        canvas.drawBitmap(canvasBitmap,0,0,canvaspaint);
        canvas.drawPath(path,paint);//path를 paint로 칠하는메소드

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        float touchX=event.getX();//x좌표를 가져옴
        float touchY=event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN://눌린 동작이 감지되면
                path.moveTo(touchX,touchY);//path를 그 좌표로 이동
                break;
            case MotionEvent.ACTION_MOVE://움직이고 있으면
                path.lineTo(touchX,touchY);//그 좌표까지 선을 그림
                break;
            case MotionEvent.ACTION_UP:
                drawCanvas.drawPath(path,paint);//캔버스에 그려주고
                path.reset();//path위치 리셋
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }
    public  void setColor(String newColor){
        invalidate();
        paintColor= Color.parseColor(newColor);
        paint.setColor(paintColor);
    }

}
