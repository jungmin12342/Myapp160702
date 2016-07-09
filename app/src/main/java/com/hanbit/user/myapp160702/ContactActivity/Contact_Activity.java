package com.hanbit.user.myapp160702.ContactActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.hanbit.user.myapp160702.R;

public class Contact_Activity extends AppCompatActivity {
    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        gv = (GridView)findViewById(R.id.gv);
    }
}
