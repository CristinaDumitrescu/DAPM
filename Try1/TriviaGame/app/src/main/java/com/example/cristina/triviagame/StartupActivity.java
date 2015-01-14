package com.example.cristina.triviagame;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class StartupActivity extends ActionBarActivity {


    Button butStart;
    Button butAbout;
    TextView text1;
    Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LearningCurve.ttf");
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        butStart=(Button)findViewById(R.id.StartGame);
        butStart.setTypeface(custom_font);
        butStart.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(StartupActivity.this, QuizActivity.class);
                startActivity(intent1);
                finish();
            }
        });
        butAbout=(Button)findViewById(R.id.buttonAb);
        butAbout.setTypeface(custom_font);
        butAbout.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(StartupActivity.this, AboutUs.class);
                startActivity(intent1);
                finish();
            }
        });
        text1=(TextView)findViewById(R.id.textViewBeg);
        text1.setTypeface(custom_font);

       // addListenerOnButtonStart();
       // addListenerOnButtonAbout();
    }
/*
    //De umblat si creeat activity despre noi
    public void addListenerOnButtonStart () {
        butStart.setOnClickListener(new View.OnClickListener() {
            @Override

        });
    }
    public void addListenerOnButtonAbout ()
    {
        butAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(StartupActivity.this, AboutUs.class);
                startActivity(intent2);
                finish();
            }
        });

    }

    */




}
