package com.first80118.random;

import android.animation.IntArrayEvaluator;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static android.R.layout.simple_list_item_1;

public class NumberResaultActivity extends AppCompatActivity {
    Integer[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_resault);
        Button back = (Button)findViewById(R.id.button11);
        Button restart = (Button)findViewById(R.id.button12);
        Bundle bundle = this.getIntent().getExtras();
        final int max =bundle.getInt("max");
        final int min =bundle.getInt("min");
        final int num =bundle.getInt("num");




        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(NumberResaultActivity.this,NumberActivity.class);
                startActivity(intent);
                NumberResaultActivity.this.finish();

            }
        });
        restart.setOnClickListener(new Button.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {



                Random random = new Random();

                array = new Integer[num];
                for (int a = 0; a < num; ++a) {
                    int i = 0;
                    pick:
                    while (i == 0) {
                        i = random.ints(min, (max + 1)).findFirst().getAsInt();

                        for (int b = 0; b < a; ++b) {
                            if (array[b] == i) {
                                i = 0;
                                continue pick;
                            }
                        }
                        array[a] = i;


                    }
                }
                List<Integer> array1 = new ArrayList(Arrays.asList(array));
                ListView listview = (ListView) findViewById(R.id.listView2);
                ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(NumberResaultActivity.this, simple_list_item_1,array1);
                listview.setAdapter(adapter);



            }
        });


        ArrayList<Integer> array1 = (ArrayList<Integer>) getIntent().getIntegerArrayListExtra("number");
        ListView listview = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(NumberResaultActivity.this, simple_list_item_1,array1);
        listview.setAdapter(adapter);

    }


}