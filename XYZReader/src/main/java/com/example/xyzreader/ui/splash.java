package com.example.xyzreader.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.xyzreader.R;

/**
 * Created by Moha on 1/19/2018.
 */

public class splash extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;

    private static int  splashtime = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ImageView imageView = (ImageView)findViewById(R.id.myimage);
        coordinatorLayout=(CoordinatorLayout)findViewById(R.id.cordi);


        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "Welcome to xyz", Snackbar.LENGTH_LONG);

        snackbar.show();

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run (){

                Intent home = new Intent(splash.this,ArticleListActivity.class);
                startActivity(home);

                finish();
            }
        },splashtime);


    }
}
