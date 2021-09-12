package com.hienqp.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMainActivity = (Button) findViewById(R.id.button_activity_main);
        buttonMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        Log.d("TAG", "onCreate: Main");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("TAG", "onStart: Main");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("TAG", "onResume: Main");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TAG", "onPause: Main");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("TAG", "onStop: Main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("TAG", "onRestart: Main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("TAG", "onDestroy: Main");
    }
}