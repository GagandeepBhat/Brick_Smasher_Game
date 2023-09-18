package com.example.brickbreaker_game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class LevelSelect extends AppCompatActivity {
    Button level1Btn,level2Btn,level3Btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_select);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        level1Btn=findViewById(R.id.level1Btn);
        level2Btn=findViewById(R.id.level2Btn);
        level3Btn=findViewById(R.id.level3Btn);
    }
    public void startGame(View view) {
        Animation btn = AnimationUtils.loadAnimation(LevelSelect.this, R.anim.animation6);
        level1Btn.startAnimation(btn);
        GameView gameView = new GameView(this);
        setContentView(gameView);
    }

    public void startLevel2(View view)
    {
        Animation btn=AnimationUtils.loadAnimation(LevelSelect.this,R.anim.animation6);
        level2Btn.startAnimation(btn);
        GameView2 gameView=new GameView2(this);
        setContentView(gameView);
    }

    public void startLevel3(View view)
    {
        Animation btn=AnimationUtils.loadAnimation(LevelSelect.this,R.anim.animation6);
        level3Btn.startAnimation(btn);
        GameView3 gameView=new GameView3(this);
        setContentView(gameView);
    }
}