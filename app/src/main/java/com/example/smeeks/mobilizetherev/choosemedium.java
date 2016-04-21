package com.example.smeeks.mobilizetherev;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class choosemedium extends ActionBarActivity {

    public void gotoProfile(View view){
        Intent i = new Intent(getApplicationContext(), profile.class);
        startActivity(i);
    }

    public void gotoNotifs(View view){
        Intent i = new Intent(getApplicationContext(), notifications.class);
        startActivity(i);
    }
    public void gotoNewsFeed(View view){
        Intent i = new Intent(getApplicationContext(), newsfeed.class);
        startActivity(i);
    }
    public void gotoAddACause(View view){
        Intent i = new Intent(getApplicationContext(), choosemedium.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosemedium);

        final ListView categories = (ListView) findViewById(R.id.categories);

        final ArrayList<String> mediums = new ArrayList<String>();

        mediums.add("Event");
        mediums.add("MessageBoard");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mediums);
        categories.setAdapter(arrayAdapter);

        categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediums.get(position) == "Event") {
                    Intent i = new Intent(getApplicationContext(), createcause.class);
                    i.putExtra("value", "create_event");
                    Log.i("Medium Picked:", i.getStringExtra("value"));
                    startActivity(i);
                    //startActivity(new Intent(choosemedium.this, createcause.class));
                }
                if (mediums.get(position) == "MessageBoard") {
                    Intent i = new Intent(getApplicationContext(), createcause.class);
                    i.putExtra("value", "create_messageboard");
                    Log.i("Medium Picked:", i.getStringExtra("value"));
                    startActivity(i);
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choosemedium, menu);
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
