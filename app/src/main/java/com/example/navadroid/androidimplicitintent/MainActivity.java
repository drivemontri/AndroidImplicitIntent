package com.example.navadroid.androidimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Ideas from https://www.formget.com/android-intent/
// and https://developer.android.com/guide/components/intents-common.html

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        findViewById(R.id.btn_intent_1).setOnClickListener(this);
        findViewById(R.id.btn_intent_2).setOnClickListener(this);
        findViewById(R.id.btn_intent_3).setOnClickListener(this);
        findViewById(R.id.btn_intent_4).setOnClickListener(this);
        findViewById(R.id.btn_intent_5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_intent_1:
                // TODO: Open media gallery
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(intent);
                break;
            case R.id.btn_intent_2:
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0856053794"));
                startActivity(intent);
                // TODO: ???
                break;
            case R.id.btn_intent_3:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.6,-122.3"));
                startActivity(intent);
                // TODO: ???
                break;
            case R.id.btn_intent_4:
                intent.setAction(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_MESSAGE, "hello")
                    .putExtra(AlarmClock.EXTRA_HOUR, 5)
                    .putExtra(AlarmClock.EXTRA_MINUTES, 10);
                startActivity(intent);
                // TODO: ???
                break;
            case R.id.btn_intent_5:
                // TODO: ???
                break;

        }
    }
}
