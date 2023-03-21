package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btnBomb, btnGay, btnSquid, btnG, btnQueen, btnGiant, btnDing, btnP, btnBOINK;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBomb = findViewById(R.id.pipe);
        btnBomb.setOnClickListener(playMusic);

        btnGay = findViewById(R.id.im);
        btnGay.setOnClickListener(playMusic);

        btnSquid = findViewById(R.id.house);
        btnSquid.setOnClickListener(playMusic);

        btnG = findViewById(R.id.yacut);
        btnG.setOnClickListener(playMusic);

        btnQueen = findViewById(R.id.missisipi);
        btnQueen.setOnClickListener(playMusic);

        btnGiant = findViewById(R.id.giant);
        btnGiant.setOnClickListener(playMusic);

        btnDing = findViewById(R.id.taco);
        btnDing.setOnClickListener(playMusic);

        btnP = findViewById(R.id.titan);
        btnP.setOnClickListener(playMusic);

        btnBOINK = findViewById(R.id.bonk);
        btnBOINK.setOnClickListener(playMusic);

    }


    View.OnClickListener playMusic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.pipe:
                    mediaPlayer.release();
                    mediaPlayer.reset();
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mailbox);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.im:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gay);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.house:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.squidward);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.yacut:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.missisipi:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.queen);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.giant:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.green);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.taco:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ding);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.titan:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pmusic);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.bonk:
                    if(mediaPlayer == null)
                    {
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.boink);
                    }
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}
