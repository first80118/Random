package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lottery = (Button)findViewById(R.id.button);
        Button number = (Button)findViewById(R.id.button2);
        Button dice = (Button)findViewById(R.id.button3);
        Button sequence = (Button)findViewById(R.id.button4);
        lottery.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LotteryActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        number.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NumberActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        dice.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DiceActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        sequence.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SequenceActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}
