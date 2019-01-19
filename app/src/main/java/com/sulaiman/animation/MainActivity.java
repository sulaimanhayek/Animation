package com.sulaiman.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

LinearLayout upper, lower;
Animation upToDown, downTOUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        upper = (LinearLayout) findViewById(R.id.upper);
        lower = (LinearLayout) findViewById(R.id.lower);
        upToDown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downTOUp = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        upper.setAnimation(upToDown);
        lower.setAnimation(downTOUp);


    }
}
