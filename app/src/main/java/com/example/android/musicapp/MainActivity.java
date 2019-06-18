package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        // set click listner to fab button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fabIntent = new Intent(MainActivity.this, AddSongs.class);
                startActivity(fabIntent);
            }
        });
        // find the view 1st song
        LinearLayout songs1 = (LinearLayout) findViewById(R.id.songs1);
        // Set on click listner to that view
        songs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs1Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs1Intent);
            }
        });
        // find the view 2nd song
        LinearLayout songs2 = (LinearLayout) findViewById(R.id.songs2);
        // Set on click listner to that view
        songs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs2Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs2Intent);
            }
        });
        // find the view 3rd song
        LinearLayout songs3 = (LinearLayout) findViewById(R.id.songs3);
        // Set on click listner to that view
        songs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs3Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs3Intent);
            }
        });
        // find the view 4th song
        LinearLayout songs4 = (LinearLayout) findViewById(R.id.songs4);
        // Set on click listner to that view
        songs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs4Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs4Intent);
            }
        });
        // find the view 5th song
        LinearLayout songs5 = (LinearLayout) findViewById(R.id.songs5);
        // Set on click listner to that view
        songs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs5Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs5Intent);
            }
        });
        // find the view 6th song
        LinearLayout songs6 = (LinearLayout) findViewById(R.id.songs6);
        // Set on click listner to that view
        songs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs6Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs6Intent);
            }
        });
        // find the view 7th song
        LinearLayout songs7 = (LinearLayout) findViewById(R.id.songs7);
        // Set on click listner to that view
        songs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs7Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs7Intent);
            }
        });
        // find the view 8th song
        LinearLayout songs8 = (LinearLayout) findViewById(R.id.songs8);
        // Set on click listner to that view
        songs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs8Intent = new Intent(MainActivity.this, NowPlaing.class);
                startActivity(songs8Intent);
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
