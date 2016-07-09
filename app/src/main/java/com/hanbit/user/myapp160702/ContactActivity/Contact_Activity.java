package com.hanbit.user.myapp160702.ContactActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hanbit.user.myapp160702.R;

import java.util.ArrayList;

public class Contact_Activity extends Activity implements AdapterView.OnItemClickListener {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        lv = (ListView)findViewById(R.id.lv);
        ArrayList<ContactsBean> list = null;
        //선언
        lv.setAdapter(new ContactsAdapter(this, list));
        lv.setOnItemClickListener(this);
        //클릭했을때 여러개중에 클릭할 수 있도록,

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
