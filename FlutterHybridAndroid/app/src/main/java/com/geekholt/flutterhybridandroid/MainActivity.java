package com.geekholt.flutterhybridandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText paramInput = findViewById(R.id.paramInput);
        findViewById(R.id.jump).setOnClickListener(view -> {
            String inputParams = paramInput.getText().toString().trim();
            FlutterAppActivity.start(MainActivity.this, inputParams);
//                startActivity(
//                    FlutterActivity
//                        .withNewEngine()
//                        .initialRoute("route1")
//                        .build(MainActivity.this)
//                );
        });
    }
}
