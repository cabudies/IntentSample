package com.brillicaservices.gurjas.intentsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");

        TextView textView;
        textView = findViewById(R.id.text_view);

        textView.setText("Hello " + name);
    }
}
