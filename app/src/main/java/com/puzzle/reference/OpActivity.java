package com.puzzle.reference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OpActivity extends AppCompatActivity {

    TextView op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);

        op = findViewById(R.id.op);

        String message = getIntent().getStringExtra("Message");
        op.setText(message);
    }
}