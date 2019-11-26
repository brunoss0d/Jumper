package com.dossmann.jumper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_game);
        setContentView(new JumperGame(this));
        //Intent intent = getIntent();
        //intent.getBooleanExtra(MainActivity.Hard_Mode);



    }

}
