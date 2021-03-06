package com.android.shashi.barcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String result = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("result")).toString();
        String format = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("format")).toString();
        TextView textView = findViewById(R.id.result);
        String output = "Value: "+result+"\nFormat: "+format;
        textView.setText(output);

    }
}
