package com.example.android.project3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class direction1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction1);
        Button back = (Button) findViewById(R.id.backActivity);
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(direction1.this, MainActivity.class);
// to start main activity
                startActivity(intent);
// start main activity
            }
        });

        Button next = (Button) findViewById(R.id.nextActivity);
        next.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(direction1.this, direction2.class);
// to start next activity
                startActivity(intent);
// start next activity
            }
        });
    }

}
