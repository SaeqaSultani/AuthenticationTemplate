package com.asoodaowar.ezTemplate.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.asoodaowar.ezTemplate.R;
import com.asoodaowar.ezTemplate.adapters.RecyclerViewAdapter;
import com.asoodaowar.ezTemplate.models.Title;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*Array for Titles*/
    String[] array_title={
            "Sign In/Up 1",
            "Sign In/Up 2",
            "Sign In/Up 3",
            "Sign In/Up 4",
            "Sign In/Up 5",
            "Sign In/Up 6",
            "Sign In/Up 7",
            "Sign In/Up 8",
            "Sign In/Up 9",
            "Sign In/Up 10",
            "Sign In/Up 11",
            "Sign In/Up 12",
            "Sign In/Up 13",
            "Sign In/Up 14",
            "Sign In/Up 15",
            "Sign In/Up 16",
            "Sign In/Up 17",
            "Sign In/Up 18",
            "Sign In/Up 19",
            "Sign In/Up 20",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /*toolbar*/
       Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(toolbar);

        /*recyclerView*/
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        /*ArrayList of Title*/
        List<Title> titleList = new ArrayList<>();

        for(int i=0;i<array_title.length;i++){

            Title title = new Title();
            title.title = array_title[i];

            titleList.add(title);
        }

        /*LinearLayoutManager*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /*RecyclerViewAdapter*/
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,titleList);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        Intent intent;
        switch (id){

            case R.id.action_about:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
