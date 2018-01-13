package com.example.application.bmi_app;

/**
 * Created by jay on 1/12/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity_home);
    }

    public void buttonClick(View view){
        Intent intent=new Intent(this,activityTwo.class);
        startActivity(intent);
    }

}

