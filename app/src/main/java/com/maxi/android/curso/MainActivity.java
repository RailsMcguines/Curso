package com.maxi.android.curso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.maxi.android.curso.activity.CollapsingToolBarActivity;
import com.maxi.android.curso.activity.LineraLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchLinearLayoutActivity(View view){
        Intent intent = new Intent(this, LineraLayoutActivity.class);
        startActivity(intent);
    }

    public void launchCollapsingToolBarActivity(View view){
        Intent intent = new Intent(this, CollapsingToolBarActivity.class);
        startActivity(intent);
    }
}
