package com.example.ksriram.annimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Button buttonAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* buttonAddItem = (Button) findViewById(R.id.btn_add_item);
   iv = findViewById(R.id.imageView);
   iv.setImageResource(R.drawable.animate);
    AnimationDrawable animate = (AnimationDrawable)iv.getDrawable();
    animate.start();*/
    }



/* buttonAddItem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(view==buttonAddItem){

            Intent intent = new Intent(getApplicationContext(),AddItem.class);
            startActivity(intent);
        }
    }
    });
    }*/
}