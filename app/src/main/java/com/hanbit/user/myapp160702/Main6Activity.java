package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main6Activity extends Activity {
    TextView textView;
    Person person1;
    ListView listView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;
    private EditText inputText;
    private Button inputButton;
    ArrayList<String> mDatas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        textView = (TextView) findViewById(R.id.textView6);
        //listView = (ListView)findViewById(R.id.listView);
        listView = (ListView) findViewById(R.id.listView);

        mDatas.add("KOREA");
        mDatas.add("CANADA");
        mDatas.add("FRANCE");
        mDatas.add("MEXICO");
        mDatas.add("POLAND");
        mDatas.add("SAUDI ARABIA");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mDatas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new ListViewItemClickListener());


        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("hello");
        textView.setText(person.toString());
        //이름 넣기

        //새로운 값 선언해서 넘기기
        person1 = new Person("신영은", "여자", "서울");
        Intent intent1 = new Intent();
        intent1.putExtra("hello1", person1);
        setResult(501, intent1);
    }

    public class ListViewItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String a = (String)parent.getAdapter().getItem(position);
            Intent myIntent = new Intent(view.getContext(), Main7Activity.class);
            myIntent.putExtra("position",a);

            Toast.makeText(
                    getApplicationContext(),
                    position + "포지션은" + id + "아이디는" + " text가 눌림",
                    Toast.LENGTH_SHORT
            ).show();
            startActivity(myIntent);
        }
    }

}
