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


public class StartupActivity extends ActionBarActivity {


    Button butStart;
    Button butAbout;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LearningCurve.ttf");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        butStart=(Button)findViewById(R.id.StartGame);
        butStart.setTypeface(custom_font);
        butAbout=(Button)findViewById(R.id.buttonAb);
        butAbout.setTypeface(custom_font);
        text1=(TextView)findViewById(R.id.textViewBeg);
        text1.setTypeface(custom_font);
    }

    //De umblat si creeat activity despre noi
    public void onClick (View view)
    {
        Intent intent1 = new Intent(this, QuizActivity.class);
        startActivity(intent1);
        finish();
    }
}
