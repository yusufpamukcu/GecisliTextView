package com.example.gecislitextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] texts = {"deneme1 ","android","FadingTextView"};
        FadingTextView FTV = (FadingTextView) findViewById(R.id.fadingTextView);
        FTV.setTexts(texts);
    }
}
