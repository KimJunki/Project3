package com.example.android.project3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ingrdients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingrdients);
        Button terminate = (Button)findViewById(R.id.terminateActivity);
        terminate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

// TODO Auto-generated method stub
                finish();
// end activity.
            }

        });

    }
}
