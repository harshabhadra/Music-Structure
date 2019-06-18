package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlaing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_plaing);
        // Find the VIew Forward
        ImageView forwardView = (ImageView) findViewById(R.id.forward);
        // set c Click listner to that view
        forwardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, "Play next song", duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        //Find the view play
        ImageView playView = (ImageView) findViewById(R.id.play_button);
        // Set a click listner to that view
        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, "Play/Pause", duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // Find the view backward
        ImageView backwardView = (ImageView) findViewById(R.id.backward);
        // Set a click listner to that view
        backwardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, "Play Previous Song", duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // Find The button Songs Details
        Button songsButton = (Button) findViewById(R.id.songs_details);
        // Set a click listner to that Button
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(NowPlaing.this, SongsDetails.class);
                startActivity(songsIntent);
            }
        });
        // Find the button Artist
        Button artistButton = (Button) findViewById(R.id.artist_details);
        // Set a click listner to that  button
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(NowPlaing.this, ArtistDetails.class);
                startActivity(artistIntent);
            }
        });
    }
}
