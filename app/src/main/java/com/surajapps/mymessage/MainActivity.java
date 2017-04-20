package com.surajapps.mymessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String SENT_MESSAGE = "com.surajapps.mymessage.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(getApplicationContext(), DisplayMessage.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        intent.putExtra(SENT_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}
