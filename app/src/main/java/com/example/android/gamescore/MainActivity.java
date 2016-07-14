package com.example.android.gamescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int redScore = 0;
    int yellowScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method displays Team red's score on the screen.
     */
    private void displayRed(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.redScore);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays Team red's score on the screen.
     */
    private void displayYellow(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.yellowScore);
        quantityTextView.setText("" + number);
    }
    /**
     * This method is called when the team Red's +1 button is cliked
     */
    public void redIncrement1(View View)   {

        redScore = redScore + 1;
        displayRed(redScore);
    }
    /**
     * This method is called when the team Red's +2 button is cliked
     */
    public void redIncrement2(View View)   {

        redScore = redScore + 2;
        displayRed(redScore);
    }
    /**
     * This method is called when the team Red's +3 button is cliked
     */
    public void redIncrement3(View View)   {

        redScore = redScore + 3;
        displayRed(redScore);
    }

    /**
     * This method is called when the team Yellow's +1 button is cliked
     */
    public void yellowIncrement1(View View)   {

        yellowScore = yellowScore + 1;
        displayYellow(yellowScore);
    }
    /**
     * This method is called when the team Yellow's +2 button is cliked
     */
    public void yellowIncrement2(View View)   {

        yellowScore = yellowScore + 2;
        displayYellow(yellowScore);
    }
    /**
     * This method is called when the team Yellow's +3 button is cliked
     */
    public void yellowIncrement3(View View)   {

        yellowScore = yellowScore + 3;
        displayYellow(yellowScore);
    }
}
