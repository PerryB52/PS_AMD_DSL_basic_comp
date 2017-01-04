package com.example.alexandrup.ps_amd_dsl_basic_comp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityNaigationView extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private TextView mTxvMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naigation_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_nav_toolbar);
        setSupportActionBar(toolbar);

        mTxvMenuItem = (TextView) findViewById(R.id.txvMenuItem);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                R.string.drawer_open, R.string.drawer_close);

        mDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState(); //!important

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        String itemNAme = (String) menuItem.getTitle();
        mTxvMenuItem.setText(itemNAme);

        hideDrawer();

        switch (menuItem.getItemId()){
            case R.id.item_android:
                //your code
                break;
            case R.id.item_ios:
                //your code
                break;
        }

        return true;
    }

    private void showDrawer(){

        mDrawerLayout.openDrawer(GravityCompat.START);

    }

    private void hideDrawer() {

        mDrawerLayout.closeDrawer(GravityCompat.START);

    }

    @Override
    public void onBackPressed() {

        if(mDrawerLayout.isDrawerOpen(GravityCompat.START))
            hideDrawer();
        else
        super.onBackPressed();

    }
}
