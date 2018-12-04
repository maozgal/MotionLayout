package com99.example.gal.motionlayout;

import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

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
        mMotionLayout = findViewById(R.id.motionLayout_container);
        findViewById(R.id.button_end).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMotionLayout.transitionToEnd();
            }
        });
        findViewById(R.id.button_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMotionLayout.transitionToStart();
            }
        });
    }
}
