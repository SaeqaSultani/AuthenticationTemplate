package com.asoodaowar.ezTemplate.activities;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.asoodaowar.ezTemplate.R;
import com.asoodaowar.ezTemplate.adapters.ViewPagerAdapter;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_eight.SignInEightFragment;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_eight.SignUpEightFragment;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_seventeenth.SignInSeventeenthFragment;
import com.asoodaowar.ezTemplate.fragments.sign_in_up_seventeenth.SignUpSeventeenthFragment;
import com.google.android.material.tabs.TabLayout;


public class SignInUpSeventeenthActivity extends AppCompatActivity{

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in_up_seventeenth);

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
        adapter.addFragment(new SignInSeventeenthFragment(),getString(R.string.sign_in));
        adapter.addFragment(new SignUpSeventeenthFragment(),getString(R.string.sign_up));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}