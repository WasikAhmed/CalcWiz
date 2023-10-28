package com.example.calcwiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView MainDisplay = findViewById(R.id.main_display);
    TextView ResultDisplay = findViewById(R.id.result_display);
    Button DigitBtn0 = findViewById(R.id.digit_button0);
    Button DigitBtn00 = findViewById(R.id.digit_button00);
    Button DigitBtn1 = findViewById(R.id.digit_button1);
    Button DigitBtn2 = findViewById(R.id.digit_button2);
    Button DigitBtn3 = findViewById(R.id.digit_button3);
    Button DigitBtn4 = findViewById(R.id.digit_button4);
    Button DigitBtn5 = findViewById(R.id.digit_button5);
    Button DigitBtn6 = findViewById(R.id.digit_button6);
    Button DigitBtn7 = findViewById(R.id.digit_button7);
    Button DigitBtn8 = findViewById(R.id.digit_button8);
    Button DigitBtn9 = findViewById(R.id.digit_button9);
    Button ClearBtn = findViewById(R.id.clear_button);
    Button DeleteBtn = findViewById(R.id.del_button);
    Button EqualBtn = findViewById(R.id.equal_button);
    Button AddBtn = findViewById(R.id.add_button);
    Button SubBtn = findViewById(R.id.sub_button);
    Button MulBtn = findViewById(R.id.mul_button);
    Button DivBtn = findViewById(R.id.div_button);
    Button PercentBtn = findViewById(R.id.percent_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}