package com.example.garrett.lab3_gduffy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] team_array = {"Ohio State", "Florida State", "Wake Forest", "Boston College", "North Carolina State", "Georgia Tech", "North Virginia", "Chicago State" };
        ListAdapter scheduleAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_array);
        ListView scheduleListView = (ListView) findViewById(R.id.scheduleListView);
        scheduleListView.setAdapter(scheduleAdapter);

    }
}
