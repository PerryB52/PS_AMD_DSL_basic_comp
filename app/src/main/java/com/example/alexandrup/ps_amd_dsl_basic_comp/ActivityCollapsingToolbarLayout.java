package com.example.alexandrup.ps_amd_dsl_basic_comp;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ActivityCollapsingToolbarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.collapse_toolbar);
        toolbar.setTitle("Module 5");
        toolbar.inflateMenu(R.menu.menu_main);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        collapsingToolbar.setTitle("Collapsing Toolbar");

    }
}
