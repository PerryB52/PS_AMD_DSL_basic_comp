package com.example.alexandrup.ps_amd_dsl_basic_comp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //never forget about design support dependecny in gradle file

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

    public void showSnackBarWithColoredText(View view) {

        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Error Loading File", Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something

            }
        });

        View snackBarLayout = snackbar.getView();
        snackBarLayout.setBackgroundColor(Color.BLUE);

        //snackbar message text color
        TextView txvMessage = (TextView) snackBarLayout.findViewById(android.support.design.R.id.snackbar_text);
        txvMessage.setTextColor(Color.YELLOW);

        //changing action button color - with in built method 1
        //snackbar.setActionTextColor(Color.GREEN);

        //changing action button color - method 2
        Button btn = (Button) snackbar.getView().findViewById(android.support.design.R.id.snackbar_action);
        btn.setTextColor(Color.RED);

        snackbar.show();

    }

    public void goToActivityNavigationView(View view) {

        Intent i = new Intent(MainActivity.this, ActivityNaigationView.class);
        startActivity(i);

    }
}
