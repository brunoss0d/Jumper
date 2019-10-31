package com.dossmann.jumper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String Hard_Mode = "jumper.hard_mode";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button exit_Button = findViewById(R.id.exit_Button);
        exit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button play_Button = findViewById(R.id.play_Button);
        play_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlayActivity();
            }
        });


    }

    private void startPlayActivity(){
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra(Hard_Mode, R.id.hardMode_Radio);
        startActivity(intent);
    }



}
