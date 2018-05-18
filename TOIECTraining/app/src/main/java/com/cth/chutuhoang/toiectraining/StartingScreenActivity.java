package com.cth.chutuhoang.toiectraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        Button btn_start_example = findViewById(R.id.btn_start_example);

        btn_start_example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartExample();
            }
        });
    }

    private void StartExample(){
        Intent intent = new Intent(StartingScreenActivity.this, Example.class);
        startActivity(intent);
    }
}
