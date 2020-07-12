package com.h.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool s;
   private int s1,s2,s3,s4,s5,s6,s7,s8,s9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  s=new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        s1=s.load(getApplicationContext(),R.raw.sound1,1);
        s2=s.load(getApplicationContext(),R.raw.sound2,1);
        s3=s.load(getApplicationContext(),R.raw.sound3,1);
        s4=s.load(getApplicationContext(),R.raw.sound4,1);
        s5=s.load(getApplicationContext(),R.raw.sound5,1);
        s6=s.load(getApplicationContext(),R.raw.sound6,1);
        s7=s.load(getApplicationContext(),R.raw.sound7,1);
        s8=s.load(getApplicationContext(),R.raw.sound8,1);
        s9=s.load(getApplicationContext(),R.raw.sound9,1);


    }

    public void playsound1(View v){
    s.play(s1,1.0f,1.0f,0,0,10f);
    }
    public void playsound2(View v){
        s.play(s2,1.0f,1.0f,0,0,10f);

    }
    public void playsound3(View v){
        s.play(s3,1.0f,1.0f,0,0,10f);

    }
    public void playsound4(View v){
        s.play(s4,1.0f,1.0f,0,0,10f);

    }
    public void playsound5(View v){
        s.play(s5,1.0f,1.0f,0,0,10f);

    }
    public void playsound6(View v){
        s.play(s6,1.0f,1.0f,0,0,10f);

    }
    public void playsound7(View v){
        s.play(s7,1.0f,1.0f,0,0,10f);

    }
    public void playsound8(View v){
        s.play(s8,1.0f,1.0f,0,0,10f);

    }
    public void playsound9(View v){
        s.play(s9,1.0f,1.0f,0,0,10f);

    }
}