package com.example.glazminka;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Activity_2 extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    private MainActivity mainActivity;
    boolean isImageVisible = false;
    boolean isImageChanged = false;
    private MediaPlayer Krestie;
    private MediaPlayer Cross;
    private MediaPlayer Square;
    private MediaPlayer Knot;
    private MediaPlayer Clock;
    private boolean musicSquare;
    private boolean musicKresting;
    private boolean musicCross;
    private boolean musicKnot;
    private  boolean musicClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

       /* imageView.setBackgroundResource(R.drawable.animation_1);
        //imageView.setBackgroundResource(R.drawable.animation_2);
        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();*/
        ImageView sound = findViewById(R.id.sound_1);

        Krestie = MediaPlayer.create(this, R.raw.krestie);
        Cross = MediaPlayer.create(this, R.raw.cross3);
        Square = MediaPlayer.create(this, R.raw.square);
        Clock = MediaPlayer.create(this, R.raw.sandclock2);
        Knot =  MediaPlayer.create(this, R.raw.knot2);


        Button btnGoToActivity = (Button) findViewById(R.id.btnGoToActivity);
        Button number_1 = (Button) findViewById(R.id.number1);
        Button number_2 = (Button) findViewById(R.id.number2);
        Button number_3 = (Button) findViewById(R.id.number3);
        Button number_4 = (Button) findViewById(R.id.number4);
        TextView textView = findViewById(R.id.exercise_text);
        ImageButton text = (ImageButton) findViewById(R.id.text);

        musicKresting = false;
        musicCross = false;
        musicSquare = false;
        musicKnot = false;
        musicClock = false;



        View.OnClickListener oclBtnGoToActivity = new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity_2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        btnGoToActivity.setOnClickListener(oclBtnGoToActivity);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageVisible) {
                    sound.setImageResource(R.drawable.sound_1);
                    Krestie.setVolume(1, 1);
                    Cross.setVolume(1, 1);
                    Square.setVolume(1, 1);
                    Knot.setVolume(1, 1);
                    Clock.setVolume(1, 1);

                } else {
                    sound.setImageResource(R.drawable.sound_2);
                    Krestie.setVolume(0, 0);
                    Cross.setVolume(0, 0);
                    Square.setVolume(0, 0);
                    Knot.setVolume(0, 0);
                    Clock.setVolume(0, 0);
                    }
                isImageVisible = !isImageVisible;

            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageChanged) {
                    text.setImageResource(R.drawable.text1);
                    textView.setVisibility(View.INVISIBLE);

                } else {
                    text.setImageResource(R.drawable.text);
                    textView.setVisibility(View.VISIBLE);
                }
                isImageChanged = !isImageChanged;

            }
        });


        TranslateAnimation upDownAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f);
        upDownAnimation.setDuration(3000);
        upDownAnimation.setRepeatCount(Animation.INFINITE);
        upDownAnimation.setRepeatMode(Animation.REVERSE);

        TranslateAnimation diagonalAnimation1 = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f);
        diagonalAnimation1.setDuration(2000);
        diagonalAnimation1.setRepeatCount(Animation.INFINITE);
        diagonalAnimation1.setRepeatMode(Animation.REVERSE);

        TranslateAnimation diagonalAnimation2 = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f);
        diagonalAnimation2.setDuration(2000);
        diagonalAnimation2.setRepeatCount(Animation.INFINITE);
        diagonalAnimation2.setRepeatMode(Animation.REVERSE);

        TranslateAnimation upAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f
        );
        upAnimation.setDuration(2000);
        upAnimation.setFillAfter(true);

        TranslateAnimation rightAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f
        );
        rightAnimation.setDuration(2000);
        rightAnimation.setFillAfter(true);

        TranslateAnimation downAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f
        );
        downAnimation.setDuration(2000);
        downAnimation.setFillAfter(true);

        TranslateAnimation leftAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f
        );
        leftAnimation.setDuration(2000);
        leftAnimation.setFillAfter(true);

        TranslateAnimation diagonalAnimationLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f);
        diagonalAnimationLeft.setDuration(2000);
        diagonalAnimationLeft.setFillAfter(true);

        TranslateAnimation diagonalAnimationRigh = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f);
        diagonalAnimationRigh.setDuration(2000);
        diagonalAnimationRigh.setFillAfter(true);

        TranslateAnimation diagonalAnimationUpRigh = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 3.7f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -3.7f);
        diagonalAnimationRigh.setDuration(2000);
        diagonalAnimationRigh.setFillAfter(true);







        number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();
                int i = rand.nextInt(2) + 1;

                switch (i) {
                    case (1):
                        textView.setText("Чертим ровную линию глазами. " +
                                "Поднимем взгляд вверх, затем вниз и так несколько раз. Теперь встороны Вправо, влево, вправо,влево.");
                        if (!musicKresting) {
                            playKresting();
                        } else {
                            stopKresting();
                        }
                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.CENTER, upDownAnimation), 4000);
                        new Handler().postDelayed(() -> imageView.clearAnimation(), 10000);


                        break;

                    case (2):
                        if (!musicCross) {
                            playCross();
                        } else {
                            stopCross();
                        }


                        textView.setText("Рисуем глазами диагонали. " +
                                "Взгляд поднимем в верхний праву угол, перемещаем в нижний левый угол, поднимем вверх и спускаемся в правый нижний угол");

                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.LEFT, diagonalAnimation1), 5000);
                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.RIGHT, diagonalAnimation2), 5000);
                        new Handler().postDelayed(() -> imageView.clearAnimation(), 10000);

                        break;

                    default:
                        break;

                }

            }
        });
        number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int i = rand.nextInt(2) + 1;
                switch (i) {
                    case (1):
                        if (!musicSquare) {
                            playSquare();
                        } else {
                            stopSquare();
                        }
                        textView.setText("Нарисуем глазами квадрат.  " +
                                "Смотрим вниз в правый угол, поднимаем глаза, затем переносим взгляд в левый верхний угол," +
                                " вниз, возвращаемся в исходную точку. Повторим. вниз вправо, наверх, влево, вниз, вправо. и в другую сторону");

                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.RIGHT, upAnimation), 1000);
                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.RIGHT, leftAnimation), 6000);
                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.LEFT, downAnimation), 11000);
                        new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.LEFT, rightAnimation), 16000);
                        new Handler().postDelayed(() -> imageView.clearAnimation(), 21000);

                break;

                case (2):
                        //TODO
                        break;
                default:
                        break;
                }
            }
        });
        number_3.setOnClickListener(new View.OnClickListener(){

            @Override
        public void onClick (View view){

        Random rand = new Random();
        int i = rand.nextInt(2) + 1;
        switch (i) {
            case (1):
                if (!musicKnot) {
                    playKnot();
                } else {
                    stopKnot();
                }
                textView.setText("Рисуем глазами бантики. \n" +
                        "Начиная от правого верхнего угла опускаем глаза вниз, по диагонали поднимем взгляд в верхний левый угол, опускаем и возвращаемся на исходную точку.\n");
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();

                new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.RIGHT, upAnimation), 1000);
                new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.RIGHT, diagonalAnimationRigh), 6000);
                new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.LEFT, upAnimation), 11000);
                new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.LEFT, diagonalAnimationLeft), 16000);
                new Handler().postDelayed(() -> imageView.clearAnimation(), 21000);




            break;
            case (2):
                break;
            default:
                break;

        }
    }
    });

        number_4.setOnClickListener(new View.OnClickListener(){

@Override
public void onClick(View view) {
    Random rand = new Random();
    int i = rand.nextInt(2) + 1;
    switch (i) {
        case (1):
            if (!musicClock) {
                playClock();
            } else {
                stopClock();
            }
            textView.setText("Часы. \n" +
                    "Посмотрите в верхний левый угол, проведите диагональ в правый нижний, " +
                    "затем посмотрите в левый нижний. Из конечной точки, проведите диагональ в правый " +
                    "верхний угол. Повторим: верхний левый угол, нижний правый," +
                    " нижний левый и затем верхний правый угол. В обратную сторону. Верхний левый угол, " +
                    "затем правый верхний, потом левый нижний, а затем правый нижний и верхний левый угол");
            new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.RIGHT, diagonalAnimationUpRigh), 1000);
            new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.LEFT, rightAnimation), 6000);
            new Handler().postDelayed(() -> animateImageView(imageView, Gravity.TOP | Gravity.RIGHT, diagonalAnimationRigh), 11000);
            new Handler().postDelayed(() -> animateImageView(imageView, Gravity.BOTTOM | Gravity.LEFT, rightAnimation), 16000);
            new Handler().postDelayed(() -> imageView.clearAnimation(), 21000);

            break;
        case (2):
            //TODO
            break;
        default:
            break;

    }
}
        });
    }


    private void playKresting() {
        musicKresting = true;
        Krestie.start();

    }

    private void stopKresting() {
        musicKresting = false;
        Krestie.pause();
        Krestie.seekTo(0);
    }

    private void playCross() {
        musicCross = true;
        Cross.start();
    }

    private void stopCross() {
        musicCross = false;
        Cross.pause();
        Cross.seekTo(0);
    }
    private void playSquare() {
        musicSquare = true;
        Square.start();
    }

    private void stopSquare() {
        musicSquare = false;
        Square.pause();
        Square.seekTo(0);
    }
    private void playKnot(){
        musicKnot = true;
        Knot.start();
    }
    private void stopKnot(){
        musicKnot = false;
        Knot.pause();
        Knot.seekTo(0);
    }
    private void playClock(){
        musicClock = true;
        Clock.start();
    }
    private void stopClock(){
        musicClock = false;
        Clock.pause();
        Clock.seekTo(0);
    }

    private void animateImageView(ImageView imageView, int gravity, Animation animation) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.gravity = gravity;
        imageView.setLayoutParams(layoutParams);
        imageView.startAnimation(animation);
    }
}