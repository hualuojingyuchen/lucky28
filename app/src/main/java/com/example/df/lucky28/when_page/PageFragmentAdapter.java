package com.example.df.lucky28.when_page;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * author：xdf
 * project：AppWhenThePage
 * package：com.luck.app.page.when_page
 * email：
 * data：2017/2/22
 */
public class PageFragmentAdapter extends FragmentPagerAdapter {
    private List<PageFragment> fragments = new ArrayList<>();

    public PageFragmentAdapter(FragmentManager fm, List<PageFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public PageFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
