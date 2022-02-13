package com.asoodaowar.ezTemplate.activities;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.asoodaowar.ezTemplate.R;
import com.asoodaowar.ezTemplate.adapters.ViewPagerAdapter;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_eleventh.SignInEleventhFragment;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_eleventh.SignUpEleventhFragment;

import com.google.android.material.tabs.TabLayout;


public class SignInUpEleventhActivity extends AppCompatActivity{

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in_up_eleventh);

        initComponent();

    }

    private void initComponent() {
//
        viewPager = findViewById(R.id.viewpager);
        tabLayout =  findViewById(R.id.viewpagertab);
        setupViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SignInEleventhFragment(),getString(R.string.sign_in));
        adapter.addFragment(new SignUpEleventhFragment(),getString(R.string.sign_up));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
