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
    }
}
