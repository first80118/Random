package com.first80118.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceResaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_resault);
        Button back = (Button)findViewById(R.id.button15);
        Button restart = (Button)findViewById(R.id.button16);
        final ImageView image1 = (ImageView)findViewById(R.id.imageView);
        final ImageView image2 = (ImageView)findViewById(R.id.imageView2);
        final ImageView image3 = (ImageView)findViewById(R.id.imageView3);
        final ImageView image4 = (ImageView)findViewById(R.id.imageView4);
        final ImageView image5 = (ImageView)findViewById(R.id.imageView5);
        final ImageView image6 = (ImageView)findViewById(R.id.imageView6);

        final Random rand = new Random(6);
        final int[] ImageArray = new int[]{R.drawable.aa1,R.drawable.aa2,R.drawable.aa3,R.drawable.aa4,R.drawable.aa5,R.drawable.aa6};



        restart.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                int num1,num2,num3,num4,num5,num6;
                num1= rand.nextInt(6);
                num2= rand.nextInt(6);
                num3= rand.nextInt(6);
                num4= rand.nextInt(6);
                num5= rand.nextInt(6);
                num6= rand.nextInt(6);

                image1.setImageDrawable(getResources().getDrawable(ImageArray[num1]));
                image2.setImageDrawable(getResources().getDrawable(ImageArray[num2]));
                image3.setImageDrawable(getResources().getDrawable(ImageArray[num3]));
                image4.setImageDrawable(getResources().getDrawable(ImageArray[num4]));
                image5.setImageDrawable(getResources().getDrawable(ImageArray[num5]));
                image6.setImageDrawable(getResources().getDrawable(ImageArray[num6]));



            }
        });







        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiceResaultActivity.this,DiceActivity.class);
                startActivity(intent);
                DiceResaultActivity.this.finish();

            }
        });

    }


}
