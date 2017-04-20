package com.surajapps.mymessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity {

    private static final String TAG = DisplayMessage.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Log.d(TAG, "onCreate() method called");

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.SENT_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(msg);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() method called");
    }
}
