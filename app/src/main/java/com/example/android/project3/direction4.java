package com.example.android.project3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class direction4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction4);
        Button terminate = (Button)findViewById(R.id.finishActivity);
        terminate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub
                finish();
// end activity.
            }

        });

    }
}
