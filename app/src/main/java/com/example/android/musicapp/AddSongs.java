package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AddSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_songs);
        //Find the layout scan device
        LinearLayout scanDevice = (LinearLayout) findViewById(R.id.scan);
        // Set a click listner to scanDevice
        scanDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, "Scan your device", duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // Find the layout buy online
        LinearLayout buyOnline = (LinearLayout) findViewById(R.id.buy_online);
        // Set a click listner to that layout
        buyOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(AddSongs.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }

}

