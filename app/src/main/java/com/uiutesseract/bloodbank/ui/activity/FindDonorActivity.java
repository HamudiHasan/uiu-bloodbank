package com.uiutesseract.bloodbank.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uiutesseract.bloodbank.R;

public class FindDonorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_donor);

        startActivity(new Intent(FindDonorActivity.this,RequestActivity.class));
    }
}
