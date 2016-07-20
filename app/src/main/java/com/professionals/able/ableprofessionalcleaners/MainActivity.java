package com.professionals.able.ableprofessionalcleaners;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.professionals.able.ableprofessionalcleaners.adapter.CardAdapter;
import com.professionals.able.ableprofessionalcleaners.adapter.Recycler_View_Adapter;
import com.professionals.able.ableprofessionalcleaners.entity.Data;
import com.professionals.able.ableprofessionalcleaners.entity.Movie;
import com.professionals.able.ableprofessionalcleaners.utils.BitmapUtils;
import com.professionals.able.ableprofessionalcleaners.utils.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends AppCompatActivity implements CardAdapter.Listener {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    CardAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

   /*     findViewById(R.id.btn_play_again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });*/

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Batman vs Superman", R.drawable.sample));
        data.add(new Data("X-Men: Apocalypse",  R.drawable.sample));
        data.add(new Data("Captain America: Civil War", R.drawable.sample));
        data.add(new Data("Kung Fu Panda 3", R.drawable.sample));
        data.add(new Data("Warcraft",R.drawable.sample));
        data.add(new Data("Alice in Wonderland",  R.drawable.sample));

        return data;
    }
    @Override
    public void onItemClicked(Movie movie) {

    }
}
