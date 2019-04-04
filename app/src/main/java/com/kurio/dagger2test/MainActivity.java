package com.kurio.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.kurio.dagger2test.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    MySharedPreferences mySharedPreferences;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        ((MyApplication) getApplicationContext()).getMyComponent().inject(this);

        mySharedPreferences.putData("info", 10);
        try {
            text1.setText(mySharedPreferences.getData("info") + "");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
