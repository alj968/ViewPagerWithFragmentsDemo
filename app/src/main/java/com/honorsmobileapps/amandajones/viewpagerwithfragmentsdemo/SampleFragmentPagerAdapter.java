package com.honorsmobileapps.amandajones.viewpagerwithfragmentsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int position) {
        if(position == 0) {
            return new FragmentOne();
        }
        else if(position == 1) {
            return new FragmentTwo();
        }
        else {
            return new FragmentThree();
        }
    }

    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "One";
        }
        else if(position == 1) {
            return "Two";
        }
        else {
            return "Three";
        }
    }
}
