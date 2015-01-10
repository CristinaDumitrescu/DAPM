package com.example.cristina.triviagame;


import android.os.Bundle;
import android.app.Activity;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
//get rating bar object
        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar1);
//get text view
        TextView t = (TextView) findViewById(R.id.textResult);
//get score
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
//display score
        bar.setRating(score);
        switch (score) {
            case 1:
            case 2:
                t.setText("Go back to 4th grade!");
                break;
            case 3:
            case 4:
                t.setText("Ah, almost there");
                break;
            case 5:
                t.setText("Woah, you could be my teacher!");
                break;
        }
    }
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }

*/

}