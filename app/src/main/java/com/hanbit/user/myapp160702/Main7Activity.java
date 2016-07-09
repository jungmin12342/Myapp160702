package com.hanbit.user.myapp160702;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textView = (TextView)findViewById(R.id.textView7);
        Intent intent = getIntent();
        String data = intent.getStringExtra("position");
        textView.setText(data);

    }
}
