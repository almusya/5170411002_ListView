package com.example.presiden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {
    TextView name;
    ImageView image;
    TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        name = findViewById(R.id.listpresiden);
        image = findViewById(R.id.imageView);
        desc = findViewById(R.id.listpresiden);

        Intent intent = getIntent();


        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));
        desc.setText(intent.getStringExtra("desc"));

    }
}
