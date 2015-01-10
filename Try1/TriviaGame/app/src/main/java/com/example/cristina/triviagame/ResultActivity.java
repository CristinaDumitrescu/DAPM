package com.example.cristina.triviagame;


import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LearningCurve.ttf");
        Button playAg = (Button) findViewById(R.id.buttonPlayA);
        playAg.setTypeface(custom_font);


        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar1);
        TextView t = (TextView) findViewById(R.id.textResult);
        t.setTypeface(custom_font);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        bar.setRating(score);
        switch (score) {
            case 1:
                t.setText("Go back to 4th grade!");
                break;
            case 2:
                t.setText("Did you ever pass math?");
                break;
            case 3:
                t.setText("I'd give you a C.");
                break;
            case 4:
                t.setText("Ah, almost there!");
                break;
            case 5:
                t.setText("Woah, you could be my teacher!");
                break;
        }
    }
}