package com.hanbit.user.myapp160702.Member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hanbit.user.myapp160702.Loginactivity;
import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class JoinActivity extends Activity implements View.OnClickListener {
    EditText etID, etPW, etEmail, etNAME;
    TextView tvResult;
    Button cancel, btjoin;
    Button login;
    MemberBean bean;
    MemberSerivce memberSerivce = new MemberServiceImpl();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        init();
    }
    @Override
    public void onClick(View v) {
        String id = etID.getText().toString();
        String pw = etPW.getText().toString();
        String email = etEmail.getText().toString();
        String name = etNAME.getText().toString();

        switch (v.getId()){
            case R.id.btjoin:
                bean= new MemberBean(id, pw, email, name);
                String hi =memberSerivce.join(bean);
                if(hi.equals("hello")){
                    tvResult.setText("이미 가입된 아이디입니다.");
                }else {
                    tvResult.setText(hi + "님 가입을 축하드립니다");
                }
                    break;
            case R.id.cancel:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.button17:
            intent = new Intent(this, Loginactivity.class);
            startActivity(intent);
            default:
                Toast.makeText(this,"???",Toast.LENGTH_LONG).show();
        }
    }
    public void init(){
        etID = (EditText)findViewById(R.id.etID);
        etPW = (EditText)findViewById(R.id.etPW);
        etEmail =(EditText)findViewById(R.id.etEmail);
        etNAME =(EditText)findViewById(R.id.etNAME);
        tvResult = (TextView)findViewById(R.id.tvResult);
        cancel = (Button)findViewById(R.id.cancel);
        btjoin = (Button)findViewById(R.id.btjoin);
        cancel.setOnClickListener(this);
        btjoin.setOnClickListener(this);
        login =(Button)findViewById(R.id.button17);
        login.setOnClickListener(this);
    }
}
