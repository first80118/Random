package com.first80118.random;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static android.R.layout.simple_list_item_1;

public class NumberActivity extends AppCompatActivity {
    Integer[] array;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        Button back = (Button)findViewById(R.id.button9);
        Button start = (Button)findViewById(R.id.button10);
        final EditText ed =(EditText)findViewById(R.id.editText);
        final EditText ed3 =(EditText)findViewById(R.id.editText3);
        final EditText ed2 =(EditText)findViewById(R.id.editText2);


        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(NumberActivity.this,MainActivity.class);
                startActivity(intent);
                NumberActivity.this.finish();

            }
        });
        start.setOnClickListener(new Button.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                int max,min,num;
                max=Integer.parseInt(ed3.getText().toString());
                min=Integer.parseInt(ed.getText().toString());
                num=Integer.parseInt(ed2.getText().toString());

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
                // ListView listview = (ListView) findViewById(R.id.listView4);
                //ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(NumberActivity.this, simple_list_item_1,array1);
                //listview.setAdapter(adapter);






                Intent intent = new Intent();
                intent.setClass(NumberActivity.this,NumberResaultActivity.class);
                intent.putExtra("max", Integer.parseInt(ed3.getText().toString()));
                intent.putExtra("min", Integer.parseInt(ed.getText().toString()));
                intent.putExtra("num", Integer.parseInt(ed2.getText().toString()));

                intent.putIntegerArrayListExtra("number", (ArrayList<Integer>) array1);
                startActivity(intent);
                NumberActivity.this.finish();

            }
        });
    }


}