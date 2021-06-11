package com.puzzle.reference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity {

    TextView c,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        c = findViewById(R.id.c);
        n = findViewById(R.id.n);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChoiceActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChoiceActivity.this,NotificationActivity.class);
                startActivity(intent);

            }
        });



    }
}