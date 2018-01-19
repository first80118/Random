package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SequenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequence);
        Button back = (Button)findViewById(R.id.button17);
        Button start = (Button)findViewById(R.id.button18);
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SequenceActivity.this,MainActivity.class);
                startActivity(intent);
                SequenceActivity.this.finish();

            }
        });

    }


}
