package com.uiutesseract.bloodbank.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.uiutesseract.bloodbank.R;

// b-Hero
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner staticSpinner = (Spinner) findViewById(R.id.spinner);
    }
}
