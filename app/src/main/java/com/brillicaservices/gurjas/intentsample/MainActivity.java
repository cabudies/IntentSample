package com.brillicaservices.gurjas.intentsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.edit_text);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.
                OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = text.getText().toString();
                Intent intent = new Intent(
                        MainActivity.this,
                        SecondActivity.class);
                intent.putExtra("Name", name);
                startActivity(intent);
            }
        });
    }
}
