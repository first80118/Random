package com.first80118.random;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class LotteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery);
        Button back = (Button)findViewById(R.id.button5);
        Button start = (Button)findViewById(R.id.button6);
        final EditText ed=(EditText)findViewById(R.id.editText5);
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(LotteryActivity.this,MainActivity.class);
                startActivity(intent);
                LotteryActivity.this.finish();

            }
        });
        start.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent = new Intent();
                //intent.setClass(LotteryActivity.this,LotteryResaultActivity.class);
                //startActivity(intent);
                //LotteryActivity.this.finish();
                String input = ed.getText().toString();
                String[] item = input.split("\n");

                int a =item.length;
                int i = (int)(Math.random()*(a+1));
                new AlertDialog.Builder(LotteryActivity.this)
                        .setTitle("抽中")
                        .setMessage(item[i])
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();






            }
        });
    }


}
