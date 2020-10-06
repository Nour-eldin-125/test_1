package com.noor.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.btn);
    }

    public void clicked(View view) {
        setContentView(R.layout.second_screen);
    }

    public void click(View view) {
        setContentView(R.layout.activity_main);
    }

    public void newpage(View view) {
        Intent inte =new Intent(MainActivity.this,task1part2.class);
        startActivity(inte);
    }


}