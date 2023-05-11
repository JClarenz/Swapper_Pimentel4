package com.example.swapper_pimentel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.checkbtn);
        e1 = (EditText) findViewById(R.id.input1);
        e2 = (EditText) findViewById(R.id.input2);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyMessage_Pimentel.class);
                String fir = e1.getText().toString();
                String sec = e2.getText().toString();
                if (fir.equalsIgnoreCase(sec)) {
                    i.putExtra("same", "THE SAME");
                    startActivity(i);

                } else {
                    i.putExtra("same", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
    public void onSwap (View view){
        e1 = (EditText) findViewById(R.id.input1);
        e2 = (EditText) findViewById(R.id.input2);
        String getFirstString = String.valueOf(e1.getText());
        String getSecondString = String.valueOf(e2.getText());
        e1.setText(getSecondString);
        e2.setText(getFirstString);
    }
}




