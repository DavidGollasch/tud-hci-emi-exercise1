package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class FibonacciRecursiveActivity extends AppCompatActivity {

    private NumberPicker numberPicker;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci_recursive);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        InitializeActivity();
    }

    private void InitializeActivity() {
        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(30);

        tvOutput = (TextView) findViewById(R.id.textViewFibonacci);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                CalculateSpecificFibonacciNumber(newVal);
            }
        });
    }

    /**
     * Calculates and screen-prints the desired Fibonacci number
     * @param position The position of the desired number in the Fibonacci row
     */
    private void CalculateSpecificFibonacciNumber(int position) {
        int number = Fibonacci(position);
        tvOutput.setText(Integer.toString(number));
    }

    /**
     * Recursive Fibonacci calculation
     * @param n Currently selected position number
     * @return The Fibonacci number of position n
     */
    private int Fibonacci(int n) {

        /* TODO: IMPLEMENT THIS */

        return 0; // TODO: remove this statement
    }
}
