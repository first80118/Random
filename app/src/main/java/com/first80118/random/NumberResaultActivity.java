package com.first80118.random;

import android.animation.IntArrayEvaluator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class NumberResaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_resault);
        Button back = (Button)findViewById(R.id.button11);
        Button restart = (Button)findViewById(R.id.button12);
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(NumberResaultActivity.this,NumberActivity.class);
                startActivity(intent);
                NumberResaultActivity.this.finish();

            }
        });


        ArrayList<Integer> array1 = (ArrayList<Integer>) getIntent().getIntegerArrayListExtra("number");


        ListView listview = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(NumberResaultActivity.this, simple_list_item_1,array1);
        listview.setAdapter(adapter);

    }


}