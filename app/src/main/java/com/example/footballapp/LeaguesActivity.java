package com.example.footballapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.footballapp.adapter.LeaguesAdapter;
import com.example.footballapp.databinding.ActivityLeaguesBinding;
import com.example.footballapp.model.MockData;

public class LeaguesActivity extends AppCompatActivity {

    private ActivityLeaguesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLeaguesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        binding.recyclerViewLeagues.setLayoutManager(new LinearLayoutManager(this));
        LeaguesAdapter adapter = new LeaguesAdapter(MockData.getMockLeagues()); // Usando os dados mock
        binding.recyclerViewLeagues.setAdapter(adapter);
    }
}