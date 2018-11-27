package com99.example.gal.motionlayout;

import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MotionLayout mMotionLayout;
    Button animateToStartButton;
    Button animateToEndButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleViews();
    }

    private void handleViews() {
        animateToEndButton = findViewById(R.id.animate_to_End_bt);
        animateToStartButton = findViewById(R.id.animate_to_start_bt);
        mMotionLayout = findViewById(R.id.motionLayout_container);


        animateToEndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        animateToStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMotionLayout.transitionToStart();
            }
        });
    }
}
