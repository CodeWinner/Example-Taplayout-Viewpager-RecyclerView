package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view;

import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;


public class MainActivity extends AppCompatActivity implements HandleEvents{
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private BookPagerAdapter mBookPagerAdapter;
    private int[] icons = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tab_main);
        mViewPager = findViewById(R.id.viewpager_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mBookPagerAdapter = new BookPagerAdapter(fragmentManager);
        mViewPager.setAdapter(mBookPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mViewPager.setPageTransformer(true,new ZoomOutPageTransformer());
        mTabLayout.getTabAt(0).setIcon(icons[0]);
        mTabLayout.getTabAt(1).setIcon(icons[1]);
        mTabLayout.getTabAt(2).setIcon(icons[2]);

    }

    @Override
    public void change(int posion) {
        mViewPager.setCurrentItem(posion);
    }
}
