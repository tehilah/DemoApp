package com.example.gofish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        configureEditText();
    }

    public void configureEditText() {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() == 5){
                    Intent intent = new Intent(ThirdScreen.this, MainActivity.class);
                    intent.putExtra("value", s.toString());
                    startActivity(intent);
                    finish();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
