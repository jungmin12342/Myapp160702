package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends Activity implements View.OnClickListener {

    Button btn, btn1;
    TextView textView;
    ImageView imageView, imageView1;
    String[] a = {"R.drawable.penguins", "R.drawable.tulips", "R.drawable.koala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        imageView1.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
        imageView.setTag(R.drawable.tulips);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button11:
                Log.d("dsa", imageView1.toString());
                if (((int) imageView.getTag()) == R.drawable.tulips) {
                    imageView.setImageResource(R.drawable.koala);
                    imageView.setTag(R.drawable.koala);
                } else {
                    imageView.setImageResource(R.drawable.penguins);
                    imageView.setTag(R.drawable.penguins);
                }
                imageView.setVisibility(View.VISIBLE);
                //.setVisibility(View.INVISIBLE);
                break;
            case R.id.button12:
                if (((int) imageView.getTag()) == R.drawable.tulips) {
                    imageView.setImageResource(R.drawable.penguins);
                    imageView.setTag(R.drawable.penguins);
                }else {
                    imageView.setImageResource(R.drawable.tulips);
                    imageView.setTag(R.drawable.tulips);
                }
                //imageView1.setImageResource(R.drawable.penguins);
                //imageView1.setVisibility(View.VISIBLE);
                //imageView.setVisibility(View.INVISIBLE);
                break;

        }
    }

    public void init() {
        btn = (Button) findViewById(R.id.button11);
        btn1 = (Button) findViewById(R.id.button12);
        textView = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }
}
