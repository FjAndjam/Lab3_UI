package com.example.jam.lab3_ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class lab3_3 extends AppCompatActivity {
    TextView textView_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);
        textView_test = (TextView) findViewById(R.id.textView_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.lab3_3_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_font_small:
                textView_test.setTextSize(10*2);
                break;
            case R.id.menu_font_middle:
                textView_test.setTextSize(16*2);
                break;
            case R.id.menu_font_big:
                textView_test.setTextSize(20*2);
                break;
            case R.id.menu_normal:
                Toast.makeText(lab3_3.this, "menu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_color_red:
                textView_test.setTextColor(Color.RED);
                break;
            case R.id.menu_color_blue:
                textView_test.setTextColor(Color.BLUE);
                break;
            case R.id.menu_color_black:
                textView_test.setTextColor(Color.BLACK);
                break;
        }
        return true;
    }
}
