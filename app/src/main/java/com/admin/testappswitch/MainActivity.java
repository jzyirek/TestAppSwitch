package com.admin.testappswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{
    private Button sendButtonId;
    private EditText inputTextId;
    private String message;

    public static final String EXTRA_MESSAGE = "com.admin.testappswitch";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButtonId = (Button) findViewById(R.id.sendButtonId);
        inputTextId = (EditText) findViewById(R.id.inputTextId);

        //sendButtonId.setOnClickListener(this);
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        message = inputTextId.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}
