package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        Button back = (Button)findViewById(R.id.button13);
        Button start = (Button)findViewById(R.id.button14);
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiceActivity.this,MainActivity.class);
                startActivity(intent);
                DiceActivity.this.finish();

            }
        });
        start.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiceActivity.this,DiceResaultActivity.class);
                startActivity(intent);
                DiceActivity.this.finish();
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> lunchList = ArrayAdapter.createFromResource(DiceActivity.this,
                R.array.lunch,
                android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(lunchList);
    }


}
