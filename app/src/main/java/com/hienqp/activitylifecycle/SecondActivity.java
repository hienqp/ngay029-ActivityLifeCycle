package com.hienqp.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button buttonSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonSecondActivity = (Button) findViewById(R.id.button_activity_second);
        buttonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Log.d("TAG", "onCreate: Second");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("TAG", "onStart: Second");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("TAG", "onResume: Second");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TAG", "onPause: Second");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("TAG", "onStop: Second");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("TAG", "onRestart: Second");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("TAG", "onDestroy: Second");
    }
}