package com.ramesh.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button roll;
    ImageView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll=findViewById(R.id.roll);
        result=findViewById(R.id.num);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
                int i=r.nextInt(6)+1;
                if (i==1){
                    result.setImageResource(R.drawable.one);
                }else if (i==2){
                    result.setImageResource(R.drawable.two);
                }else if (i==3){
                    result.setImageResource(R.drawable.three);
                }else if (i==4){
                    result.setImageResource(R.drawable.four);
                }else if (i==5){
                    result.setImageResource(R.drawable.five);
                }else if (i==6){
                    result.setImageResource(R.drawable.six);
                }
            }
        });


    }

    public void goToTwo(View view) {
        Intent intent=new Intent(this, Birthday.class);
        startActivity(intent);
    }
}