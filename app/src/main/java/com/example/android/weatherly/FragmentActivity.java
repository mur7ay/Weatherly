package com.example.android.weatherly;

import android.os.Bundle;
import android.app.Activity;

public class FragmentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
