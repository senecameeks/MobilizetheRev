package com.example.smeeks.mobilizetherev;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class createcause extends ActionBarActivity {

    ImageButton animalb;
    ImageButton educationb;
    ImageButton healthb;
    ImageButton environmentb;
    ImageButton civilrightsb;
    ImageButton womenb;
    ImageButton cultureb;
    ImageButton povertyb;
    ImageButton lgbtq;
    String value;
    Activity activity;

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
        setContentView(R.layout.activity_createcause);

       Intent i = getIntent();
        value = i.getStringExtra("value");

        activity = this;
        animalb = (ImageButton)findViewById(R.id.imageButton);
        educationb = (ImageButton)findViewById(R.id.imageButton2);
        healthb = (ImageButton)findViewById(R.id.imageButton3);
        environmentb = (ImageButton)findViewById(R.id.imageButton4);
        civilrightsb =  (ImageButton)findViewById(R.id.imageButton5);
        womenb = (ImageButton)findViewById(R.id.imageButton6);
        cultureb = (ImageButton)findViewById(R.id.imageButton7);
        povertyb = (ImageButton)findViewById(R.id.imageButton8);
        lgbtq = (ImageButton)findViewById(R.id.imageButton9);

        animalb.setOnClickListener(listener);
        educationb.setOnClickListener(listener);
        healthb.setOnClickListener(listener);
        environmentb.setOnClickListener(listener);
        civilrightsb.setOnClickListener(listener);
        womenb.setOnClickListener(listener);
        cultureb.setOnClickListener(listener);
        povertyb.setOnClickListener(listener);
        lgbtq.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_createcause, menu);
        return true;
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case (R.id.imageButton):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                     }

                case (R.id.imageButton2):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton3):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton4):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton5):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton6):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton7):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton8):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

                case (R.id.imageButton9):
                    if(value == "create_event"){
                        startActivity(new Intent(getApplicationContext(), create_event.class));
                    }
                    else{
                        startActivity(new Intent(getApplicationContext(), MssgBoardPage.class));
                    }

            }


        }
    };


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
