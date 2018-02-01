package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        Button back = (Button)findViewById(R.id.button13);
        Button start = (Button)findViewById(R.id.button14);
        sp = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> lunchList = ArrayAdapter.createFromResource(DiceActivity.this,
                R.array.lunch,
                android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(lunchList);

        final ImageView image1 = (ImageView)findViewById(R.id.imageView);
        final ImageView image2 = (ImageView)findViewById(R.id.imageView2);
        final ImageView image3 = (ImageView)findViewById(R.id.imageView3);
        final ImageView image4 = (ImageView)findViewById(R.id.imageView4);
        final ImageView image5 = (ImageView)findViewById(R.id.imageView5);
        final ImageView image6 = (ImageView)findViewById(R.id.imageView6);
        final Random rand = new Random(6);
        final int[] ImageArray = new int[]{R.drawable.aa1,R.drawable.aa2,R.drawable.aa3,R.drawable.aa4,R.drawable.aa5,R.drawable.aa6};
        final ImageView[] image = new ImageView[]{image1,image2,image3,image4,image5,image6};




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
                int s = sp.getSelectedItemPosition();
                int num = rand.nextInt(6);
                for(int i=0;i<=5;i++) {
                    num= rand.nextInt(6);
                    image[i].setImageDrawable(getResources().getDrawable(ImageArray[num]));
                }
                if (s==0)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }
                if (s==1)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }
                if (s==2)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }
                if (s==3)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }
                if (s==4)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }
                if (s==5)
                {
                    for(int i=0;i<=s;i++) {
                        image[i].setVisibility(View.VISIBLE);
                    }
                    for(int a=s+1;a<6;a++) {
                        image[a].setVisibility(View.INVISIBLE);
                    }
                }





         /*
                Intent intent = new Intent();
                intent.setClass(DiceActivity.this,DiceResaultActivity.class);
                intent.putExtra("s",sp.getSelectedItemPosition());
                startActivity(intent);
                DiceActivity.this.finish();
                */
            }
        });


    }


}
