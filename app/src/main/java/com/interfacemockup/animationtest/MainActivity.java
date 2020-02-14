package com.interfacemockup.animationtest;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private ImageView slika;
    private Button myButton1;
    private Button myButton2;
    private Button myButton3;
    private Button myButton4;
    private Button myButton5;
    private Button myButton6;
    private Button myButton7;
    private Button myButton8;
    private Button myButton9;
    private Button myButton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slika = (ImageView)findViewById(R.id.myImage);
        myButton1 = (Button)findViewById(R.id.moj_button1);
        myButton2 = (Button)findViewById(R.id.moj_button2);
        myButton3 = (Button)findViewById(R.id.moj_button3);
        myButton4 = (Button)findViewById(R.id.moj_button4);
        myButton5 = (Button)findViewById(R.id.moj_button5);
        myButton6 = (Button)findViewById(R.id.moj_button6);
        myButton7 = (Button)findViewById(R.id.moj_button7);
        myButton8 = (Button)findViewById(R.id.moj_button8);
        myButton9 = (Button)findViewById(R.id.moj_button9);
        myButton10 = (Button)findViewById(R.id.moj_button10);

        yoyoAnimacija1();
        yoyoAnimacija2();
        yoyoAnimacija3();
        yoyoAnimacija4();
        yoyoAnimacija5();
        yoyoAnimacija6();
        yoyoAnimacija7();
        yoyoAnimacija8();
        yoyoAnimacija9();
        yoyoAnimacija10();

    }

    public void yoyoAnimacija1(){
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.SlideInLeft)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }


    public void yoyoAnimacija2(){
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Swing)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija3(){
        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Tada)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija4(){
        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Wobble)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija5(){
        myButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Wave)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija6(){
        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.RotateOut)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija7(){
        myButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Pulse)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija8(){
        myButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.FlipOutY)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija9(){
        myButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.FlipInY)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }

    public void yoyoAnimacija10(){
        myButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.DropOut)
                        .duration(1700)
                        .repeat(0)
                        .playOn(slika);


            }
        });

    }



}
