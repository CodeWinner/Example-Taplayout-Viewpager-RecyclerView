package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;

public class BookPagerAdapter extends FragmentStatePagerAdapter {

    public BookPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FragmentShowBook();
                break;
            case 1:
                fragment = new FragmentCart();
                break;
            case 2:
                fragment = new FragmentInfor();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Buy";
                break;
            case 1:
                title = "Cart";
                break;
            case 2:
                title = "Infor";
                break;
        }
        return title;
    }
}
