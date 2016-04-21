package com.example.smeeks.mobilizetherev;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Adapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView categories = (ListView) findViewById(R.id.categories);

        final ArrayList<String> mediums = new ArrayList<String>();

        mediums.add("Article");
        mediums.add("Event");
        mediums.add("Petition");
        mediums.add("Fundraiser");
        mediums.add("Image");
        mediums.add("Survey");
        mediums.add("Audio/Video File");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mediums);
        categories.setAdapter(arrayAdapter);

        categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediums.get(position) == "Article") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
                if (mediums.get(position) == "Event") {
                    startActivity(new Intent(MainActivity.this, activity3.class));
                }
                if (mediums.get(position) == "Petition") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
                if (mediums.get(position) == "Fundraiser") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
                if (mediums.get(position) == "Image") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
                if (mediums.get(position) == "Survey") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
                if (mediums.get(position) == "Audio/Video File") {
                    Log.i("Medium Picked:", mediums.get(position));
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
