package com.ulp.villa.prueba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class TwoFragment extends Fragment {

    BottomNavigationView bot_nav;
    FrameLayout frameLayout2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_two, container, false);

        bot_nav = (BottomNavigationView)v.findViewById(R.id.bottomNavigation);
        frameLayout2 = (FrameLayout)v.findViewById(R.id.frameLayout2);

        bot_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;

                if(menuItem.getItemId()== R.id.nav_home){
                    fragment = new HomeFragment();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout2, fragment);
                    fragmentTransaction.commit();
                }
                else if (menuItem.getItemId()== R.id.nav_favorite){
                    fragment = new FavoriteFragment();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout2, fragment);
                    fragmentTransaction.commit();

                }
                else if (menuItem.getItemId()== R.id.nav_search){
                    fragment = new SearchFragment();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout2, fragment);
                    fragmentTransaction.commit();

                }
                return false;
            }
        });

        return v;
    }

}
