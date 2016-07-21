package com.example.android.project3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class direction3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction3);
        Button back = (Button) findViewById(R.id.backActivity);
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(direction3.this, direction2.class);
// to start second activity
                startActivity(intent);
// start second activity
            }
        });

        Button next = (Button) findViewById(R.id.nextActivity);
        next.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(direction3.this, direction4.class);
// to start next activity
                startActivity(intent);
// start next activity
            }
        });
    }
}