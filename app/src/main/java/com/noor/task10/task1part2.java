package com.noor.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class task1part2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1part2);

    }

    public void clicking(View view) {
        setContentView(R.layout.gift);
    }
    public void next(View view) {
        setContentView(R.layout.profile);
    }

    public void tomap(View view) {
        setContentView(R.layout.driveapp);
    }
}