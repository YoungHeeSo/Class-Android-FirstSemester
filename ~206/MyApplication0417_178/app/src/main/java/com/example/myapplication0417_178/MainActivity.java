package com.example.myapplication0417_178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TimePicker timepicker1;
    private TextView time;
    private Calendar calendar;
    private String format="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timepicker1=(TimePicker) findViewById(R.id.timePicker1);
        time=(TextView) findViewById(R.id.textView3);
        calendar=Calendar.getInstance();

        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int min=calendar.get(Calendar.MINUTE);
        showTime(hour, min);
    }

    public void displayTime(View view){
        int hour=timepicker1.getHour();
        int min = timepicker1.getMinute();
        showTime(hour, min);
    }

    public void showTime(int hour, int min){
        if(hour==0){ //24시,자정을 오전12시로표시
            hour+=12;
            format="AM";
        }else if (hour==12){ //오후12시
            format="PM";
        }else if (hour>12){ //12시이후 13시는 오후1시이므로 13-12=1
            hour-=12;
            format="PM";
        }else{ //오전1시에서 11시까지를 표시
            format="AM";
        }
        time.setText(new StringBuilder().append(hour).append(" : ").append(min).append(" ")
                .append(format));
    }

}