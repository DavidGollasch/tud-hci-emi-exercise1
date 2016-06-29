package de.davidgollasch.emiexercise1;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static de.davidgollasch.emiexercise1.R.id.*;

public class MainActivity extends AppCompatActivity {

    private Button btnTask1a, btnTask1b, btnTask2, btnTask3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuHausfarbeBlauDunkel)));

        InitializeApp();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeApp() {
        btnTask1a = (Button) findViewById(buttonTask1a);
        btnTask1b = (Button) findViewById(buttonTask1b);
        btnTask2 = (Button) findViewById(buttonTask2);
        btnTask3 = (Button) findViewById(buttonTask3);

        //
        // EVENT LISTENERS
        //

        btnTask1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFibonacciActivity();
            }
        });
        
        btnTask1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFibonacciRecursiveActivity();
            }
        });
        
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDigitSumActivity();
            }
        });
        
        btnTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAudioPlaybackActivity();
            }
        });
    }

    /**
     * Start the First Activity (Task 1a) - Fibonacci
     */
    private void startFibonacciActivity() {
        startActivity(
                new Intent(this, FibonacciActivity.class));
    }

    /**
     * Start the Other First Activity (Task 1b) - Fibonacci #2
     */
    private void startFibonacciRecursiveActivity() {
        startActivity(
                new Intent(this, FibonacciRecursiveActivity.class));
    }

    /**
     * Start the Second Activity (Task 2) - Digit Sum
     */
    private void startDigitSumActivity() {
        startActivity(
                new Intent(this, DigitSumActivity.class));
    }

    /**
     * Start the Third Activity (Task 3) - Audio Playback
     */
    private void startAudioPlaybackActivity() {
        startActivity(
                new Intent(this, AudioPlaybackActivity.class));
    }

}
