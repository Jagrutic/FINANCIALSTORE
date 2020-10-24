package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.myapplication.ui.home.HomeFragment;
import com.example.myapplication.ui.notification.NotificationFragment;
import com.example.myapplication.ui.portfolio.PortfolioFragment;
import com.example.myapplication.ui.transaction.TransactionFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class StartUsing extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    NavController navController;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_using);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,new HomeFragment()).commit();

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment frag=null;
                switch(item.getItemId()){
                    case R.id.navigation_home: frag= new HomeFragment();
                        break;

                    case R.id.navigation_portfolio: frag= new PortfolioFragment();
                        break;

                    case R.id.navigation_notification: frag= new NotificationFragment();
                    break;

                    case R.id.navigation_profile: frag= new TransactionFragment();

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,frag).commit();
                return true;
            }
        });

        navController = Navigation.findNavController(this, R.id.fragment_layout);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView =(NavigationView)findViewById(R.id.navigation_view);
        final DrawerLayout drawerLayout =(DrawerLayout) findViewById(R.id.drawerLayout);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.navigation_home:
                        Toast.makeText(getApplicationContext(),"Home pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_aboutus:
                        Toast.makeText(getApplicationContext(),"About us pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_settings:
                        Toast.makeText(getApplicationContext(),"Settings pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_changepassword:
                        Toast.makeText(getApplicationContext(),"Change Password pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_shareapp:
                        Toast.makeText(getApplicationContext(),"Sharer App pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_rateus:
                        Toast.makeText(getApplicationContext(),"Rate us pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_helpsupport:
                        Toast.makeText(getApplicationContext(),"Help & Support pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.navigation_logout:
                        Toast.makeText(getApplicationContext(),"Logout pannel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });

    }
}