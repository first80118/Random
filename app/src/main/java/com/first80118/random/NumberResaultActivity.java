package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    }


}