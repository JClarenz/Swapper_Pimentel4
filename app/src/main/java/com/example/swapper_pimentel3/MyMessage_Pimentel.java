package com.example.swapper_pimentel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage_Pimentel extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message_pimentel);

        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.result);
        String result = secondActivity.getStringExtra("same");
        t.setText(result);
    }
}