package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn;
    Button btn1, btn2, btn3;
    TextView textview;
    int year, month, day, hour, minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button1);
        btn1 = (Button)findViewById(R.id.button7);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.button8);
        textview = (TextView)findViewById(R.id.textView3);
        //btn3 =(Button)findViewById(R.id.button9);
        //btn3.setOnClickListener(this);
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day= calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button7:
                Intent intent1 = new Intent(MainActivity.this,CalendarActivity.class);
                //this.startActivity(new Intent(this, CalendarActivity.class));
                startActivity(intent1);
                break;
            case R.id.button1:
                Data data = new Data("신중민",24);
                Toast.makeText(MainActivity.this, "why?"+data.num, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //intent.putExtra("Data",data.name);
                intent.putExtra("Data",data);
                startActivity(intent);
                break;
            case R.id.button8:
                new DatePickerDialog(MainActivity.this, dateSetListener, year, month, day).show();
                break;
        }

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
             switch(keyCode) {
                case KeyEvent.KEYCODE_BACK:
                         new AlertDialog.Builder(this)
                                 .setTitle("종료")
                                 .setMessage("종료 하시겠어요?")
                                 .setPositiveButton("예", new DialogInterface.OnClickListener() {
                                     public void onClick(DialogInterface dialog, int whichButton) {
                                                    finish();
                                          }
                                     })
                                 .setNegativeButton("아니오", null).show();
                                return false;
                  default:
                          return false;
                }
       }

    private DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            String msg = String.format("%d / %d / %d", year,monthOfYear+1, dayOfMonth);
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            textview.setText("현재년도" + year + "월은 " + (monthOfYear+1) + "날짜는 " + dayOfMonth);

        }
    };
    public static class Data implements Parcelable {
        //private static final long serialVersionUID = -7060210544600464481L;
        public int num;
        public String name;

        private Data(Parcel in) {
            num = in.readInt();
            name = in.readString();
        }
        public static final Creator<Data> CREATOR = new Creator<Data>() {
            @Override
            public Data createFromParcel(Parcel in) {
                return new Data(in);
            }

            @Override
            public Data[] newArray(int size) {
                return new Data[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.num);
            dest.writeString(this.name);
        }

        public Data(String name, int num){
            this.name = name;
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
