package com.example.loginlibrary;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = findViewById(R.id.famous_tv);

//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/famous_font.otf");
//
//        textView.setTypeface(custom_font);
    }
}
