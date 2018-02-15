package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView weatherDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        weatherDay = (TextView) findViewById(R.id.tv_weather_details);
        if(intent != null){
            if(intent.hasExtra(Intent.EXTRA_TEXT)) {
                String forecast = intent.getStringExtra(Intent.EXTRA_TEXT);
                weatherDay.setText(forecast);
            }
        }
        // complete (2) Display the weather forecast that was passed from MainActivity
    }
}