package uwtacoma.apps.teachingandlearningcenter;
import android.app.Notification;
import android.support.annotation.MainThread;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import  android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static  final String DEBUG_TAG = "TLC_APP";


    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        DrawerLayout drawerLayout = (DrawerLayout)this.findViewById(R.id.home_drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewPager viewPager = (ViewPager)this.findViewById(R.id.pager);
        viewPager.setAdapter(new HomeFragmentPageAdapter(getSupportFragmentManager(),
                HomeActivity.this));
        TabLayout tabLayout = (TabLayout)this.findViewById(R.id.tabLayout);

            tabLayout.setupWithViewPager(viewPager);

        DrawerLayout  drawerLayout = (DrawerLayout)this.findViewById(R.id.home_drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                        R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }





}
