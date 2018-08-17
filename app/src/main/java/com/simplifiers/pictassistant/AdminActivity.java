package com.simplifiers.pictassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdminActivity extends AppCompatActivity {

    TextView textView_canteenmenu,textView_eventmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        textView_canteenmenu = findViewById(R.id.textView_addcanteen);
        textView_eventmenu = findViewById(R.id.textView_addevent);

        textView_canteenmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminActivity.this,AddCanteenMenu.class));
            }
        });

        textView_eventmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminActivity.this,AddEventDetails.class));
            }
        });

    }
}
