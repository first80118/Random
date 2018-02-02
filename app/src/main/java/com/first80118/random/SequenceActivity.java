package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class SequenceActivity extends AppCompatActivity {
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequence);
        Button back = (Button)findViewById(R.id.button17);
        Button start = (Button)findViewById(R.id.button18);
        final TextView tv =(TextView)findViewById(R.id.textView7);

        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SequenceActivity.this,MainActivity.class);
                startActivity(intent);
                SequenceActivity.this.finish();
            }
        });
        start.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ed6 =(EditText)findViewById(R.id.editText6);
                String input = ed6.getText().toString();
                tv.setVisibility(View.VISIBLE);
                String[] strArray = input.split("\n");
                list = Arrays.asList(strArray);
                Collections.shuffle(list);
                ListView listview = (ListView) findViewById(R.id.listview1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SequenceActivity.this, simple_list_item_1,list);
                listview.setAdapter(adapter);
            }
        });
    }

}
