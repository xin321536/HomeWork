package com.example.yyxx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.yyxx.fragment.Adapter.FragmentAdapter;
import com.example.yyxx.fragment.CUFragment;
import com.example.yyxx.fragment.HomeFragment;
import com.example.yyxx.fragment.PersonalFragment;
import com.example.yyxx.fragment.RecordFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager home_vp;
    private TabLayout home_tab;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initFragment() {
        fragments = new ArrayList<>();

        fragments.add(new HomeFragment());
        fragments.add(new CUFragment());
        fragments.add(new RecordFragment());
        fragments.add(new PersonalFragment());
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragments);

        home_vp.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
        home_tab.setTabMode(TabLayout.MODE_FIXED);
        home_tab.setupWithViewPager(home_vp);
        home_tab.getTabAt(0).setText("首页").setIcon(R.drawable.ic_launcher_background);
        home_tab.getTabAt(1).setText("课程").setIcon(R.drawable.ic_launcher_background);
        home_tab.getTabAt(2).setText("约课记录").setIcon(R.drawable.ic_launcher_background);
        home_tab.getTabAt(3).setText("个人").setIcon(R.drawable.ic_launcher_background);
    }

    private void initView() {
        home_vp = (ViewPager) findViewById(R.id.home_vp);
        home_tab = (TabLayout) findViewById(R.id.home_tab);
        initFragment();
    }
}
