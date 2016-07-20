package com.example.android.project3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button launch = (Button)findViewById(R.id.launchActivity);
        launch.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, ingrdients.class);
// to start second activity
                startActivity(intent);
// start second activity
            }
        });
    }

}
