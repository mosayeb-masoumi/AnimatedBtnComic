package com.example.animationbuttoncomic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5;
    boolean show;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);

        btn = findViewById(R.id.btn);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

                img5.animate().translationX(-img5.getRight()).setInterpolator(new AccelerateInterpolator()).start();
                img4.animate().translationX(+img4.getLeft()).setInterpolator(new AccelerateInterpolator()).start();

                img1.animate().translationY(-img1.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();
                img2.animate().translationY(-img2.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();
                img3.animate().translationY(-img3.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();

                show = false;

            }
        }, 2000);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(show){
                    img5.animate().translationX(-img5.getRight()).setInterpolator(new AccelerateInterpolator()).start();
                    img4.animate().translationX(+img4.getLeft()).setInterpolator(new AccelerateInterpolator()).start();

                    img1.animate().translationY(-img1.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();
                    img2.animate().translationY(-img2.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();
                    img3.animate().translationY(-img3.getTop() - 100).setInterpolator(new AccelerateInterpolator()).start();

                    show = false;
                }else {
                    img5.animate().translationX(0).setInterpolator(new DecelerateInterpolator()).start();
                    img4.animate().translationX(0).setInterpolator(new DecelerateInterpolator()).start();

//                    img1.animate().translationY(+img1.getTop()).setInterpolator(new AccelerateInterpolator()).start();
                    img1.animate().translationY(0).setInterpolator(new AccelerateInterpolator()).start();
                    img2.animate().translationY(0).setInterpolator(new AccelerateInterpolator()).start();
                    img3.animate().translationY(0).setInterpolator(new AccelerateInterpolator()).start();
                    show = true;

                }

            }
        });
    }
}