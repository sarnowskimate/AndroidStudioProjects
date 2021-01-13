package com.msarnowski.listoftrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // declare ListView
    ListView planListView;

    // declare ArrayList
    String[] plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fill ArrayList with data
        plan = getResources().getStringArray(R.array.plan_array);

        // assign to ListView
        planListView = (ListView) findViewById(R.id.listView);

        // set Adapter
        planListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, plan));

        // register setOnListener
        planListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), plan[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}