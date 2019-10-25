package com.example.asus.dailyexpensenote.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.asus.dailyexpensenote.R;
import com.example.asus.dailyexpensenote.fragment.DashBoardFragment;
import com.example.asus.dailyexpensenote.fragment.ExpensesFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle(" Daily Expence List");

        replaceFragment(new DashBoardFragment());//set default fragment in dash board

        init();

        //navigation item selected action
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.dashBoardNavItemId:
                        replaceFragment(new DashBoardFragment());
                        return true;
                    case R.id.expensesNavItemId:
                        replaceFragment(new ExpensesFragment());
                        return true;
                }
                return false;
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.expence);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }

    //change fragment when nav item selected
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutId, fragment);
        fragmentTransaction.commit();
    }

    //initialize all component
    private void init() {
        bottomNavigationView = findViewById(R.id.bottomNavigationViewId);
    }
}
