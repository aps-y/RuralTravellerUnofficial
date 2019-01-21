package com.example.ruraltraveller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.telecom.Call;

public class PgrAdapter extends FragmentPagerAdapter {
    public PgrAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch(i){
            case 0:
                DetailsFragment detailsFragment = new DetailsFragment();
                return detailsFragment;
            case 1:
                ReachFragment reachFragment = new ReachFragment();
                return reachFragment;

            case 2:
                LocalityFragment localityFragment = new LocalityFragment();
                return localityFragment;

             default:
                 return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       switch(position) {
           case 0:
               return "Data";

           case 1:

               return "Reach";

           case 2:
               return "Locality";

           default:
               return null;
       }
    }
}
