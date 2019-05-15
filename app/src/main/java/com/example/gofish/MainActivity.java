package com.example.gofish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.tapOnMe);

        configureNextButton();
        configureButtonForThirdScreen();
        setTextView();

    }

    public void configureNextButton() {
        Button nextButton = (Button) findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FishermanActivity.class));
            }
        });
    }

    public void configureButtonForThirdScreen() {

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ThirdScreen.class));
            }
        });

    }

    public void setTextView(){
        String numbers = getIntent().getStringExtra("value");
        if(numbers != null){
            text.setText("You have entered " + numbers);
        }
    }
}

