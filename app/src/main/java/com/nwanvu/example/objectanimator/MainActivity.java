package com.nwanvu.example.objectanimator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity implements View.OnTouchListener{

    private static final float MIN_VELOCITY = 200;
    int currentPage = 1;
    private boolean touchAllow = true;
    VelocityTracker velocityTracker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();

		/*
		 * tutorial page 1
		 */
        w1_img1_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img1_in);
        w1_img1_in.setTarget(findViewById(R.id.phone1));
        w1_img1_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img1_out);
        w1_img1_out.setTarget(findViewById(R.id.phone1));
        // w1_img1_in.addListener(new MyAnimatorListener("w1_img1_in"));
        // w1_img1_out.addListener(new MyAnimatorListener("w1_img1_out"));

        w1_img2_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img2_in);
        w1_img2_in.setTarget(findViewById(R.id.phone2));
        w1_img2_out = AnimatorInflater.loadAnimator(this, R.animator.w1_img2_out);
        w1_img2_out.setTarget(findViewById(R.id.phone2));
        // w1_img2_in.addListener(new MyAnimatorListener("w1_img2_in"));
        // w1_img2_out.addListener(new MyAnimatorListener("w1_img2_out"));

        w1_img3_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img3_in);
        w1_img3_in.setTarget(findViewById(R.id.img1));
        w1_img3_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img3_out);
        w1_img3_out.setTarget(findViewById(R.id.img1));
        // w1_img3_in.addListener(new MyAnimatorListener("w1_img3_in"));
        // w1_img3_out.addListener(new MyAnimatorListener("w1_img3_out"));

        w1_img4_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img4_in);
        w1_img4_in.setTarget(findViewById(R.id.img2));
        w1_img4_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img4_out);
        w1_img4_out.setTarget(findViewById(R.id.img2));
        // w1_img4_in.addListener(new MyAnimatorListener("w1_img4_in"));
        // w1_img4_out.addListener(new MyAnimatorListener("w1_img4_out"));

        w1_img5_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img5_in);
        w1_img5_in.setTarget(findViewById(R.id.img3));
        w1_img5_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img5_out);
        w1_img5_out.setTarget(findViewById(R.id.img3));
        // w1_img5_in.addListener(new MyAnimatorListener("w1_img5_in"));
        // w1_img5_out.addListener(new MyAnimatorListener("w1_img5_out"));

        w1_img6_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img6_in);
        w1_img6_in.setTarget(findViewById(R.id.img4));
        w1_img6_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img6_out);
        w1_img6_out.setTarget(findViewById(R.id.img4));
        // w1_img6_in.addListener(new MyAnimatorListener("w1_img6_in"));
        // w1_img6_out.addListener(new MyAnimatorListener("w1_img6_out"));

        w1_img7_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img7_in);
        w1_img7_in.setTarget(findViewById(R.id.imgPopup));
        w1_img7_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_img7_out);
        w1_img7_out.setTarget(findViewById(R.id.imgPopup));

        // w1_img7_out.addListener(new MyAnimatorListener("w1_img7_out"));

        w1_ttl01_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_ttl01_in);
        w1_ttl01_in.setTarget(findViewById(R.id.text1));
        w1_ttl01_out = AnimatorInflater.loadAnimator(this, R.animator.w1_ttl01_out);
        w1_ttl01_out.setTarget(findViewById(R.id.text1));
        // w1_ttl01_in.addListener(new MyAnimatorListener("w1_ttl01_in"));
        // w1_ttl01_out.addListener(new MyAnimatorListener("w1_ttl01_out"));

        w1_ttl02_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_ttl02_in);
        w1_ttl02_in.setTarget(findViewById(R.id.text2));
        w1_ttl02_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_ttl02_out);
        w1_ttl02_out.setTarget(findViewById(R.id.text2));
        // w1_ttl02_in.addListener(new MyAnimatorListener("w1_ttl02_in"));
        // w1_ttl02_out.addListener(new MyAnimatorListener("w1_ttl02_out"));

        w1_ttl_container_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w1_ttl_container_in);
        w1_ttl_container_in.setTarget(findViewById(R.id.w1_ttlContainer));
        w1_ttl_container_out = AnimatorInflater.loadAnimator(this, R.animator.w1_ttl_container_out);
        w1_ttl_container_out.setTarget(findViewById(R.id.w1_ttlContainer));
        // w1_ttl_container_in.addListener(new MyAnimatorListener("w1_ttl_container_in"));
        // w1_ttl_container_out.addListener(new MyAnimatorListener("w1_ttl_container_out"));

		/*
		 * tutorial page 2
		 */
        w2_img1_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img1_in);
        w2_img1_in.setTarget(findViewById(R.id.w2_img1));
        w2_img1_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img1_out);
        w2_img1_out.setTarget(findViewById(R.id.w2_img1));
        // w2_img1_in.addListener(new MyAnimatorListener("w2_img1_in"));
        // w2_img1_out.addListener(new MyAnimatorListener("w2_img1_out"));

        w2_img2_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img2_in);
        w2_img2_in.setTarget(findViewById(R.id.w2_img2));
        w2_img2_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img2_out);
        w2_img2_out.setTarget(findViewById(R.id.w2_img2));
        // w2_img2_in.addListener(new MyAnimatorListener("w2_img2_in"));
        // w2_img2_out.addListener(new MyAnimatorListener("w2_img2_out"));

        w2_img3_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img3_in);
        w2_img3_in.setTarget(findViewById(R.id.w2_img3));
        w2_img3_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_img3_out);
        w2_img3_out.setTarget(findViewById(R.id.w2_img3));

        // w2_img3_out.addListener(new MyAnimatorListener("w2_img3_out"));

        w2_img4_in = w2_img1_in.clone();
        w2_img4_in.setTarget(findViewById(R.id.w2_img4));
        w2_img4_out = w2_img1_out.clone();
        w2_img4_out.setTarget(findViewById(R.id.w2_img4));
        // w2_img4_in.addListener(new MyAnimatorListener("w2_img4_in"));
        // w2_img4_out.addListener(new MyAnimatorListener("w2_img4_out"));

        w2_ttl01_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_ttl01_in);
        w2_ttl01_in.setTarget(findViewById(R.id.w2_ttl01));
        w2_ttl01_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_ttl01_out);
        w2_ttl01_out.setTarget(findViewById(R.id.w2_ttl01));
        // w2_ttl01_in.addListener(new MyAnimatorListener("w2_ttl01_in"));
        // w2_ttl01_out.addListener(new MyAnimatorListener("w2_ttl01_out"));

        w2_ttl02_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_ttl02_in);
        w2_ttl02_in.setTarget(findViewById(R.id.w2_ttl02));
        w2_ttl02_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_ttl02_out);
        w2_ttl02_out.setTarget(findViewById(R.id.w2_ttl02));
        // w2_ttl02_in.addListener(new MyAnimatorListener("w2_ttl02_in"));
        // w2_ttl02_out.addListener(new MyAnimatorListener("w2_ttl02_out"));

        w2_ttl_container_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.m2_ttl_container_in);
        w2_ttl_container_in.setTarget(findViewById(R.id.w2_ttlContainer));
        w2_ttl_container_out = AnimatorInflater.loadAnimator(this, R.animator.m2_ttl_container_out);
        w2_ttl_container_out.setTarget(findViewById(R.id.w2_ttlContainer));
        // w2_ttl_container_in.addListener(new MyAnimatorListener("w2_ttl_container_in"));
        // w2_ttl_container_out.addListener(new MyAnimatorListener("w2_ttl_container_out"));

		/*
		 * tutorial page 3
		 */
        w3_img1_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img1_in);
        w3_img1_in.setTarget(findViewById(R.id.t3_img01));
        w3_img1_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img1_out);
        w3_img1_out.setTarget(findViewById(R.id.t3_img01));
        // w3_img1_in.addListener(new MyAnimatorListener("w3_img1_in"));
        // w3_img1_out.addListener(new MyAnimatorListener("w3_img1_out"));

        w3_img2_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img2_in);
        w3_img2_in.setTarget(findViewById(R.id.t3_img02));
        w3_img2_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img2_out);
        w3_img2_out.setTarget(findViewById(R.id.t3_img02));
        // w3_img2_in.addListener(new MyAnimatorListener("w3_img2_in"));
        // w3_img2_out.addListener(new MyAnimatorListener("w3_img2_out"));

        w3_img3_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img3_in);
        w3_img3_in.setTarget(findViewById(R.id.t3_img03));
        w3_img3_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img3_out);
        w3_img3_out.setTarget(findViewById(R.id.t3_img03));
        // w3_img3_in.addListener(new MyAnimatorListener("w3_img3_in"));
        // w3_img3_out.addListener(new MyAnimatorListener("w3_img3_out"));

        w3_img4_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img4_in);
        w3_img4_in.setTarget(findViewById(R.id.t3_img04));
        w3_img4_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img4_out);
        w3_img4_out.setTarget(findViewById(R.id.t3_img04));
        // w3_img4_in.addListener(new MyAnimatorListener("w3_img4_in"));
        // w3_img4_out.addListener(new MyAnimatorListener("w3_img4_out"));

        w3_img5_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img5_in);
        w3_img5_in.setTarget(findViewById(R.id.t3_img05));
        w3_img5_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img5_out);
        w3_img5_out.setTarget(findViewById(R.id.t3_img05));
        // w3_img5_in.addListener(new MyAnimatorListener("w3_img5_in"));
        // w3_img5_out.addListener(new MyAnimatorListener("w3_img5_out"));

        w3_img6_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img6_in);
        w3_img6_in.setTarget(findViewById(R.id.t3_img06));
        w3_img6_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img6_out);
        w3_img6_out.setTarget(findViewById(R.id.t3_img06));
        // w3_img6_in.addListener(new MyAnimatorListener("w3_img6_in"));
        // w3_img6_out.addListener(new MyAnimatorListener("w3_img6_out"));

        w3_img7_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img7_in);
        w3_img7_in.setTarget(findViewById(R.id.t3_img07));
        w3_img7_out = AnimatorInflater.loadAnimator(this, R.animator.w3_img7_out);
        w3_img7_out.setTarget(findViewById(R.id.t3_img07));
        // w3_img7_in.addListener(new MyAnimatorListener("w3_img7_in"));
        // w3_img7_out.addListener(new MyAnimatorListener("w3_img7_out"));

        w3_img8_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img8_in);
        w3_img8_in.setTarget(findViewById(R.id.t3_img08));
        w3_img8_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_img8_out);
        w3_img8_out.setTarget(findViewById(R.id.t3_img08));

        // w3_img8_out.addListener(new MyAnimatorListener("w3_img8_out"));

        w3_ttl01_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_ttl01_in);
        w3_ttl01_in.setTarget(findViewById(R.id.t3_ttl01));
        w3_ttl01_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_ttl01_out);
        w3_ttl01_out.setTarget(findViewById(R.id.t3_ttl01));
        // w3_ttl01_in.addListener(new MyAnimatorListener("w3_ttl01_in"));
        // w3_ttl01_out.addListener(new MyAnimatorListener("w3_ttl01_out"));

        w3_ttl02_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_ttl02_in);
        w3_ttl02_in.setTarget(findViewById(R.id.t3_ttl02));
        w3_ttl02_out = AnimatorInflater.loadAnimator(this, R.animator.w3_ttl02_out);
        w3_ttl02_out.setTarget(findViewById(R.id.t3_ttl02));
        // w3_ttl02_in.addListener(new MyAnimatorListener("w3_ttl02_in"));
        // w3_ttl02_out.addListener(new MyAnimatorListener("w3_ttl02_out"));

        w3_ttl_container_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_ttl_container_in);
        w3_ttl_container_in.setTarget(findViewById(R.id.t3_ttlContainer));
        w3_ttl_container_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w3_ttl_container_out);
        w3_ttl_container_out.setTarget(findViewById(R.id.t3_ttlContainer));
        // w3_ttl_container_in.addListener(new MyAnimatorListener("w3_ttl_container_in"));
        // w3_ttl_container_out.addListener(new MyAnimatorListener("w3_ttl_container_out"));

		/*
		 * tutorial page 4
		 */
        w4_img1_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img1_in);
        w4_img1_in.setTarget(findViewById(R.id.m4_img1));
        w4_img1_out = AnimatorInflater.loadAnimator(this, R.animator.w4_img1_out);
        w4_img1_out.setTarget(findViewById(R.id.m4_img1));
        // w4_img1_in.addListener(new MyAnimatorListener("w4_img1_in"));
        // w4_img1_out.addListener(new MyAnimatorListener("w4_img1_out"));

        w4_img2_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img2_in);
        w4_img2_in.setTarget(findViewById(R.id.m4_img2));
        w4_img2_out = AnimatorInflater.loadAnimator(this, R.animator.w4_img2_out);
        w4_img2_out.setTarget(findViewById(R.id.m4_img2));
        // w4_img2_in.addListener(new MyAnimatorListener("w4_img2_in"));
        // w4_img2_out.addListener(new MyAnimatorListener("w4_img2_out"));

        w4_img3_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img3_in);
        w4_img3_in.setTarget(findViewById(R.id.m4_img3));
        w4_img3_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img3_out);
        w4_img3_out.setTarget(findViewById(R.id.m4_img3));
        // w4_img3_in.addListener(new MyAnimatorListener("w4_img3_in"));
        // w4_img3_out.addListener(new MyAnimatorListener("w4_img3_out"));

        w4_img4_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img4_in);
        w4_img4_in.setTarget(findViewById(R.id.m4_img4));
        w4_img4_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img4_out);
        w4_img4_out.setTarget(findViewById(R.id.m4_img4));
        // w4_img4_in.addListener(new MyAnimatorListener("w4_img4_in"));
        // w4_img4_out.addListener(new MyAnimatorListener("w4_img4_out"));

        w4_img5_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img5_in);
        w4_img5_in.setTarget(findViewById(R.id.m4_img5));
        w4_img5_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_img5_out);
        w4_img5_out.setTarget(findViewById(R.id.m4_img5));
        // w4_img5_in.addListener(new MyAnimatorListener("w4_img5_in"));
        // w4_img5_out.addListener(new MyAnimatorListener("w4_img5_out"));

        w4_ttl01_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_ttl01_in);
        w4_ttl01_in.setTarget(findViewById(R.id.woman_ani_4_text1));
        w4_ttl01_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_ttl01_out);
        w4_ttl01_out.setTarget(findViewById(R.id.woman_ani_4_text1));
        // w4_ttl01_in.addListener(new MyAnimatorListener("w4_ttl01_in"));
        // w4_ttl01_out.addListener(new MyAnimatorListener("w4_ttl01_out"));

        w4_ttl02_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_ttl02_in);
        w4_ttl02_in.setTarget(findViewById(R.id.woman_ani_4_text2));
        w4_ttl02_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_ttl02_out);
        w4_ttl02_out.setTarget(findViewById(R.id.woman_ani_4_text2));

        // w4_ttl02_out.addListener(new MyAnimatorListener("w4_ttl02_out"));

        w4_tip1_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_tip1_in);
        w4_tip1_in.setTarget(findViewById(R.id.woman_ani_4_tip_1));
        w4_tip1_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_tip1_out);
        w4_tip1_out.setTarget(findViewById(R.id.woman_ani_4_tip_1));
        // w4_tip1_in.addListener(new MyAnimatorListener("w4_tip1_in"));
        // w4_tip1_out.addListener(new MyAnimatorListener("w4_tip1_out"));

        w4_tip2_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_tip2_in);
        w4_tip2_in.setTarget(findViewById(R.id.woman_ani_4_tip_2));
        w4_tip2_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_tip2_out);
        w4_tip2_out.setTarget(findViewById(R.id.woman_ani_4_tip_2));
        // w4_tip2_in.addListener(new MyAnimatorListener("w4_tip2_in"));
        // w4_tip2_out.addListener(new MyAnimatorListener("w4_tip2_out"));

        w4_fade_in_indicator = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_fade_in_indicator);
        w4_fade_in_indicator.setTarget(findViewById(R.id.cbIndicator));
        w4_fade_out_indicator = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_fade_out_indicator);
        w4_fade_out_indicator.setTarget(findViewById(R.id.cbIndicator));
        // w4_fade_in_indicator.addListener(new MyAnimatorListener("w4_fade_in_indicator"));
        // w4_fade_out_indicator.addListener(new MyAnimatorListener("w4_fade_out_indicator"));

        w4_btn_in = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_btn_in);
        w4_btn_in.setTarget(findViewById(R.id.woman_ani_4_button));
        w4_btn_out = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.w4_btn_out);
        w4_btn_out.setTarget(findViewById(R.id.woman_ani_4_button));
        // w4_btn_in.addListener(new MyAnimatorListener("w4_btn_in"));
        // w4_btn_out.addListener(new MyAnimatorListener("w4_btn_out"));

        /***
         * Start animation
         */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                w1_img1_in.start();
                w1_img2_in.start();
                w1_img3_in.start();
                w1_img4_in.start();
                w1_img5_in.start();
                w1_img6_in.start();
                w1_img7_in.start();
                w1_ttl01_in.start();
                w1_ttl02_in.start();
                cbIndicator.check(R.id.cb_w1);
            }
        }, 100);
    }

    private void selectedPage(int page) {
        resetListener(page);

        if (page >= 1 && page <= 4) {
            RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) findViewById(R.id.touchView)
                    .getLayoutParams();
            if (page == 4) {
                layoutParams.setMargins(0, 0, 0, (int) getResources().getDimension(R.dimen.touch_view_margin_bottom));
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            findViewById(R.id.touchView).setLayoutParams(layoutParams);
            switch (page) {
                case 1:
                    if (currentPage > page) {
                        animationOut(2);
                        w1_ttl_container_in.start();
                    }
                    cbIndicator.check(R.id.cb_w1);
                    break;
                case 2:
                    if (currentPage < page) {
                        animationOut(1);
                        w1_ttl_container_out.start();
                    } else {
                        animationOut(3);
                        w2_ttl_container_in.start();
                    }
                    cbIndicator.check(R.id.cb_w2);
                    break;
                case 3:
                    if (currentPage < page) {
                        animationOut(2);
                        w2_ttl_container_out.start();
                    } else {
                        animationOut(4);
                        w3_ttl_container_in.start();
                    }
                    cbIndicator.check(R.id.cb_w3);
                    break;
                case 4:
                    animationOut(3);
                    w3_ttl_container_out.start();
                    cbIndicator.check(R.id.cb_w4);
                    break;
            }
            animationIn(page);
            currentPage = page;
        } else {
            touchAllow = true;
        }
    }

    private void resetListener(int page) {
        if (currentPage < page) {
            // next
            // 02-12 21:01:22.869: E/duy(15795): onAnimationEnd: w1_img7_in
            w1_img7_in.addListener(new MyAnimatorListener("w1_img7_in"));
            // 02-12 21:01:43.817: E/duy(15795): onAnimationEnd: w2_img3_in
            w2_img3_in.addListener(new MyAnimatorListener("w2_img3_in"));
            // 02-12 21:01:51.769: E/duy(15795): onAnimationEnd: w3_img8_in
            w3_img8_in.addListener(new MyAnimatorListener("w3_img8_in"));
            // 02-12 21:02:04.649: E/duy(15795): onAnimationEnd: w4_ttl02_in
            w4_btn_in.addListener(new MyAnimatorListener("w4_btn_in"));
        } else {
            // back
            // 02-12 21:02:25.217: E/duy(15795): onAnimationEnd: w3_img8_in
            w3_img8_in.addListener(new MyAnimatorListener("w3_img8_in"));
            // 02-12 21:02:39.653: E/duy(15795): onAnimationEnd: w2_img3_in
            w2_img3_in.addListener(new MyAnimatorListener("w2_img3_in"));
            // 02-12 21:02:47.749: E/duy(15795): onAnimationEnd: w1_img7_in
            w1_img7_in.addListener(new MyAnimatorListener("w1_img7_in"));
            w4_btn_in.removeAllListeners();
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (touchAllow && event != null && event.getPointerCount() == 1) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    velocityTracker.addMovement(event);
                    break;

                case MotionEvent.ACTION_MOVE:
                    velocityTracker.addMovement(event);
                    break;

                case MotionEvent.ACTION_UP:
                    velocityTracker.addMovement(event);
                    velocityTracker.computeCurrentVelocity(1000);
                    // 1000 provides pixels per second

                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) >= MIN_VELOCITY) {
                        touchAllow = false;
                        if (xVelocity > 0) {
                            selectedPage(currentPage - 1);
                        } else {
                            selectedPage(currentPage + 1);
                        }
                    } else {
                        touchAllow = true;
                    }
                    velocityTracker.recycle();
                    velocityTracker = null;
                    break;
                case MotionEvent.ACTION_CANCEL:
                    velocityTracker.recycle();
                    velocityTracker = null;
                    break;
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    class MyAnimatorListener implements Animator.AnimatorListener {

        private String pos;

        public MyAnimatorListener(String pos) {
            this.pos = pos;
        }

        @Override
        public void onAnimationStart(Animator animation) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            touchAllow = true;
        }

        @Override
        public void onAnimationCancel(Animator animation) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onAnimationRepeat(Animator animation) {
            // TODO Auto-generated method stub

        }

    }

    private void animationIn(int page) {
        switch (page) {
            case 1:
                w1_img1_in.start();
                w1_img2_in.start();
                w1_img3_in.start();
                w1_img4_in.start();
                w1_img5_in.start();
                w1_img6_in.start();
                w1_img7_in.start();
                w1_ttl01_in.start();
                w1_ttl02_in.start();
                break;
            case 2:
                w2_img1_in.start();
                w2_img2_in.start();
                w2_img3_in.start();
                w2_img4_in.start();
                w2_ttl01_in.start();
                w2_ttl02_in.start();
                break;
            case 3:
                w3_img1_in.start();
                w3_img2_in.start();
                w3_img3_in.start();
                w3_img4_in.start();
                w3_img5_in.start();
                w3_img6_in.start();
                w3_img7_in.start();
                w3_img8_in.start();
                w3_ttl01_in.start();
                w3_ttl02_in.start();
                w4_fade_in_indicator.start();
                break;
            case 4:
                w4_img1_in.start();
                w4_img2_in.start();
                w4_img3_in.start();
                w4_img4_in.start();
                w4_img5_in.start();
                w4_ttl01_in.start();
                w4_ttl02_in.start();
                w4_tip1_in.start();
                w4_tip2_in.start();
                w4_btn_in.start();
                w4_fade_out_indicator.start();
                break;
        }
    }

    private void animationOut(int page) {
        switch (page) {
            case 1:
                w1_img1_out.start();
                w1_img2_out.start();
                w1_img3_out.start();
                w1_img4_out.start();
                w1_img5_out.start();
                w1_img6_out.start();
                w1_img7_out.start();
                w1_ttl01_out.start();
                w1_ttl02_out.start();
                // w1_ttl_container_out.start();
                break;
            case 2:
                w2_img1_out.start();
                w2_img2_out.start();
                w2_img3_out.start();
                w2_img4_out.start();
                w2_ttl01_out.start();
                w2_ttl02_out.start();
                // w2_ttl_container_out.start();
                break;
            case 3:
                w3_img1_out.start();
                w3_img2_out.start();
                w3_img3_out.start();
                w3_img4_out.start();
                w3_img5_out.start();
                w3_img6_out.start();
                w3_img7_out.start();
                w3_img8_out.start();
                w3_ttl01_out.start();
                w3_ttl02_out.start();
                // w3_ttl_container_out.start();
                break;
            case 4:
                w4_img1_out.start();
                w4_img2_out.start();
                w4_img3_out.start();
                w4_img4_out.start();
                w4_img5_out.start();
                w4_ttl01_out.start();
                w4_ttl02_out.start();
                w4_tip1_out.start();
                w4_tip2_out.start();
                w4_btn_out.start();
                w4_fade_in_indicator.start();
                break;
        }
    }

    private void findView() {
        cbIndicator = (RadioGroup) findViewById(R.id.cbIndicator);
        findViewById(R.id.touchView).setOnTouchListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private AnimatorSet w1_img3_in;
    private AnimatorSet w1_img4_in;
    private AnimatorSet w1_img5_in;
    private AnimatorSet w1_img6_in;
    private AnimatorSet w1_img7_in;
    private AnimatorSet w1_ttl01_in;
    private AnimatorSet w1_ttl02_in;
    private AnimatorSet w1_img1_in;
    private AnimatorSet w1_img1_out;
    private AnimatorSet w1_img2_in;
    private AnimatorSet w1_ttl_container_in;

    private AnimatorSet w2_img1_in;
    private AnimatorSet w2_img2_in;
    private AnimatorSet w2_img3_in;
    private AnimatorSet w2_ttl01_in;
    private AnimatorSet w2_ttl02_in;
    private AnimatorSet w2_ttl_container_in;

    private AnimatorSet w3_img1_in;
    private AnimatorSet w3_img2_in;
    private AnimatorSet w3_img3_in;
    private AnimatorSet w3_img4_in;
    private AnimatorSet w3_img5_in;
    private AnimatorSet w3_img6_in;
    private AnimatorSet w3_img7_in;
    private AnimatorSet w3_img8_in;
    private AnimatorSet w3_ttl01_in;
    private AnimatorSet w3_ttl02_in;
    private AnimatorSet w3_ttl_container_in;

    private AnimatorSet w4_ttl01_in;
    private AnimatorSet w4_ttl02_in;
    private AnimatorSet w4_img1_in;
    private AnimatorSet w4_img2_in;
    private AnimatorSet w4_img3_in;
    private AnimatorSet w4_img4_in;
    private AnimatorSet w4_img5_in;
    private AnimatorSet w4_tip1_in;
    private AnimatorSet w4_tip2_in;
    private RadioGroup cbIndicator;
    private AnimatorSet w4_fade_out_indicator;
    private AnimatorSet w4_btn_in;

    private Animator w1_img2_out;
    private AnimatorSet w1_img3_out;
    private AnimatorSet w1_img4_out;
    private AnimatorSet w1_img5_out;
    private AnimatorSet w1_img6_out;
    private AnimatorSet w1_img7_out;
    private Animator w1_ttl01_out;
    private AnimatorSet w1_ttl02_out;
    private Animator w1_ttl_container_out;

    private AnimatorSet w2_img1_out;
    private AnimatorSet w2_img2_out;
    private AnimatorSet w2_img3_out;
    private AnimatorSet w2_ttl01_out;
    private AnimatorSet w2_ttl02_out;
    private AnimatorSet w2_img4_in;
    private AnimatorSet w2_img4_out;
    private Animator w2_ttl_container_out;

    private Animator w3_img1_out;
    private Animator w3_img2_out;
    private Animator w3_img3_out;
    private Animator w3_img4_out;
    private Animator w3_img5_out;
    private Animator w3_img6_out;
    private Animator w3_img7_out;
    private AnimatorSet w3_img8_out;
    private AnimatorSet w3_ttl01_out;
    private Animator w3_ttl02_out;

    private AnimatorSet w3_ttl_container_out;
    private Animator w4_img1_out;
    private Animator w4_img2_out;
    private AnimatorSet w4_img3_out;
    private AnimatorSet w4_img4_out;
    private AnimatorSet w4_img5_out;
    private AnimatorSet w4_ttl01_out;
    private AnimatorSet w4_ttl02_out;
    private AnimatorSet w4_tip1_out;
    private AnimatorSet w4_tip2_out;
    private AnimatorSet w4_fade_in_indicator;
    private AnimatorSet w4_btn_out;
}
