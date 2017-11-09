package com.maxi.android.curso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.maxi.android.curso.activity.CollapsingToolBarActivity;
import com.maxi.android.curso.activity.LineraLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLinearLayoutActivity(v);
            }
        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                launchToast(v);
                return true;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCollapsingToolBarActivity(v);
            }
        });
    }

    public void launchLinearLayoutActivity(View view){
        Intent i = new Intent(this, LineraLayoutActivity.class);
        startActivity(i);
    }

    public void launchCollapsingToolBarActivity(View view){
        Intent intent = new Intent(this, CollapsingToolBarActivity.class);
        startActivity(intent);
    }

    public void launchToast(View view){
        Toast.makeText(this, "Esto es un Toast", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.info_details:
                Toast.makeText(this, "Info pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.search:
                Toast.makeText(this, "Search pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.add:
                Toast.makeText(this, "Add pressed", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
