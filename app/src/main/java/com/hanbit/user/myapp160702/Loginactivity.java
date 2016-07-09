package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hanbit.user.myapp160702.Member.MemberBean;
import com.hanbit.user.myapp160702.Member.MemberSerivce;
import com.hanbit.user.myapp160702.Member.MemberServiceImpl;

public class Loginactivity extends Activity implements View.OnClickListener {
    Button btlogin, cancel;
    EditText etPW, etID;
    MemberBean bean = new MemberBean();
    TextView textView;
    MemberSerivce memberSerivce = new MemberServiceImpl();
    //이녀석은 이 액티비티가 사라지면 날라감

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init() {
        textView = (TextView) findViewById(R.id.textView8);
        etID = (EditText) findViewById(R.id.etID);
        etPW = (EditText) findViewById(R.id.etPW);
        cancel = (Button) findViewById(R.id.cancel);
        btlogin = (Button) findViewById(R.id.btlogin);
        cancel.setOnClickListener(this);
        btlogin.setOnClickListener(this);
    }

    public void onClick(View v) {
        String id = etID.getText().toString();
        String pw = etPW.getText().toString();
        boolean result = false;
        bean.setId(id);
        bean.setPw(pw);
        switch (v.getId()) {
            case R.id.btlogin:
                result = memberSerivce.login(bean);
                if (result == true) {
                    Toast.makeText(this, "로그인을 환영합니다.", Toast.LENGTH_LONG).show();
                    textView.setText(result + " 님 환영합니다");
                } else {
                    Toast.makeText(this, "다시 로그인하세용", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cancel:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "???", Toast.LENGTH_LONG).show();
        }
    }
}
