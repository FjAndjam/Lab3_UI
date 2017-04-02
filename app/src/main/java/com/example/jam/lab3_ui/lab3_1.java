package com.example.jam.lab3_ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab3_1 extends AppCompatActivity {

    private String[] names = new String[]
            {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageIds = new int[]
            {R.drawable.lion, R.drawable.tiger,R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_1);
        final List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for(int i=0; i<names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this, listItems, R.layout.layout,
                new String[] {"personName", "header"},
                new int[] { R.id.textView, R.id.imageView });
        ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                System.out.println(names[position] + " is selected.");
//                view.setBackgroundColor(Color.RED);
                Toast.makeText(lab3_1.this, names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
