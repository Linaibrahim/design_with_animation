package com.example.pcworld.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Animation animS, tran_up, tran_down, rotate;

    Button btn_control, btn_home, btn_help;
    boolean show_btns = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn_control = (Button) findViewById(R.id.butSet11);

    btn_home = (Button) findViewById(R.id.butSet22);
    btn_help = (Button) findViewById(R.id.butSet33);
        btn_control.bringToFront();

    tran_up = AnimationUtils.loadAnimation(this, R.anim.in_item);
    tran_down = AnimationUtils.loadAnimation(this, R.anim.out_item);
    rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
}

    public void control(View view) {
        if (show_btns) {
            btn_control.startAnimation(rotate);


            btn_home.startAnimation(tran_up);
            btn_help.startAnimation(tran_up);

            btn_home.setVisibility(View.VISIBLE);

            btn_help.setVisibility(View.VISIBLE);

            show_btns = false;
        } else {

            btn_control.startAnimation(rotate);

            btn_home.startAnimation(tran_down);
            btn_help.startAnimation(tran_down);

            btn_home.setVisibility(View.INVISIBLE);
            btn_help.setVisibility(View.INVISIBLE);

            show_btns = true;
        }
    }
}
