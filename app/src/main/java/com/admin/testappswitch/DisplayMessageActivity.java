package com.admin.testappswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity
{
    //com.admin.testappswitch
    private String message;
    private TextView DisplayTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        DisplayTextId = (TextView) findViewById(R.id.DisplayTextId);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        DisplayTextId.setText(message);

    }
}
