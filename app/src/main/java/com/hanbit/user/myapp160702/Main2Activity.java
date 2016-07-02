package com.hanbit.user.myapp160702;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener  {
    TextView textView, textView1;
    Button button;
    EditText editText1, editText2;
    MainActivity.Data data;
    Button btn1, btn2, btn3, btn4;
    Button bcbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        data = getIntent().getParcelableExtra("Data");
        textView.setText("이름" + data.name + "나이 " + data.num);
    }
    public void onClick(View v){
       // int arg1 = Integer.parseInt(editText1.getText().toString());
        //int arg2 = Integer.parseInt(editText2.getText().toString());
        switch (v.getId()){
            case R.id.button:
                //textView1.setText(plus(arg1,arg2));
            //    plus(arg1, arg2);
                Log.d("???","???");
                //덧샘하는 거
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                //빼기하기
                break;
            case R.id.button4:
                //나누기
                break;
            case R.id.button5:
                //곱하기
                break;
            case R.id.button9:
                this.startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
    public void init(){
        btn1 = (Button)findViewById(R.id.button);
        button = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView2);
        textView1 = (TextView)findViewById(R.id.textView3);
        btn2 = (Button)findViewById(R.id.button3);
        btn3 = (Button)findViewById(R.id.button4);
        btn4 = (Button)findViewById(R.id.button5);
        editText1 = (EditText)findViewById(R.id.EditText1);
        editText2 = (EditText)findViewById(R.id.EditText2);
        bcbtn = (Button)findViewById(R.id.button9);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        bcbtn.setOnClickListener(this);
    }
    public int plus(int arg1, int arg2){
        int a = arg1+arg2;
        Log.d("???","comeon\t" + a);
        return a;
    }
}
