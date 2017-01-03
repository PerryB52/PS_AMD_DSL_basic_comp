package com.example.alexandrup.ps_amd_dsl_basic_comp;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorlayout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "FAB Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showSimpleSnackBar(View view) {

        Snackbar.make(coordinatorLayout, "Hello from simple SnackBar", Snackbar.LENGTH_SHORT).show();

    }

    public void showSnackBarWithActionCallback(View view) {

        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Error Loading File", Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                Snackbar.make(coordinatorLayout, "File Loaded Succesfully", Snackbar.LENGTH_SHORT).show();
            }
        });

        snackbar.show();

    }
}
