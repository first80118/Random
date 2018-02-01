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
        Bundle bundle = this.getIntent().getExtras();
        final int s =bundle.getInt("s");
        final Random rand = new Random(6);
        final int[] ImageArray = new int[]{R.drawable.aa1,R.drawable.aa2,R.drawable.aa3,R.drawable.aa4,R.drawable.aa5,R.drawable.aa6};
        final ImageView[] image = new ImageView[]{image1,image2,image3,image4,image5,image6};

        if (s==0)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }
        if (s==1)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }
        if (s==2)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }
        if (s==3)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }
        if (s==4)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }
        if (s==5)
        {
            for(int i=0;i<=s;i++) {
                image[i].setVisibility(View.VISIBLE);
            }
        }

        restart.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                int num = rand.nextInt(6);
                for(int i=0;i<=5;i++) {
                    num= rand.nextInt(6);
                    image[i].setImageDrawable(getResources().getDrawable(ImageArray[num]));
                }


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
