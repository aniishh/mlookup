package com.example.mlookup.activity.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.mlookup.R;
import com.example.mlookup.activity.main.fragments.celebs.CelebsFragment;
import com.example.mlookup.activity.main.fragments.home.HomeFragment;
import com.example.mlookup.activity.main.fragments.movies.MoviesFragment;
import com.example.mlookup.activity.main.fragments.people.PeopleFragment;
import com.example.mlookup.activity.main.fragments.recommedations.RecommendationsFragment;
import com.example.mlookup.activity.main.fragments.trending.TrendingFragment;
import com.example.mlookup.activity.main.fragments.tv.TVFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;
    private Context mContext;

    /**
     * Constructor for {@link FragmentStatePagerAdapter}.
     *
     * @param fm       fragment manager that will interact with this adapter
     * @param behavior determines if only current fragments are in a resumed state
     */
    PagerAdapter(@NonNull FragmentManager fm, int behavior, int numOfTabs, Context context) {
        super(fm, behavior);
        this.mNumOfTabs = numOfTabs;
        this.mContext = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position Tab position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new TVFragment();
            case 2:
                return new MoviesFragment();
            case 3:
                return new CelebsFragment();
            case 4:
                return new TrendingFragment();
            case 5:
                return new PeopleFragment();
            case 6:
                return new RecommendationsFragment();
            default:
                return new HomeFragment();
        }
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.home);
            case 1:
                return mContext.getString(R.string.tv);
            case 2:
                return mContext.getString(R.string.movies);
            case 3:
                return mContext.getString(R.string.celebs);
            case 4:
                return mContext.getString(R.string.trending);
            case 5:
                return mContext.getString(R.string.people);
            case 6:
                return mContext.getString(R.string.recommendations);
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
