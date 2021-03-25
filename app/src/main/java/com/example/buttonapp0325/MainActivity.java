package com.example.buttonapp0325;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button nButton1;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*nButton1 = (Button) findViewById(R.id.button1);
        mTextView1 = (TextView) findViewById(R.id.textView1);
*/

        nButton1 = findViewById(R.id.button1);
        mTextView1 = findViewById(R.id.textView1);

        nButton1.setOnClickListener(new MyonClickListener(this));


    }
}