package com.example.footballapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballapp.R;
import com.example.footballapp.model.League;

import java.util.List;

public class LeaguesAdapter extends RecyclerView.Adapter<LeaguesAdapter.LeagueViewHolder> {

    private final List<League> leagues;

    public LeaguesAdapter(List<League> leagues) {
        this.leagues = leagues;
    }

    @NonNull
    @Override
    public LeagueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_league, parent, false);
        return new LeagueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeagueViewHolder holder, int position) {
        League league = leagues.get(position);
        holder.leagueName.setText(league.getName());
        holder.countryName.setText(league.getCountry());
        String teamsText = String.join("\n", league.getTeams());
        holder.teamName.setText(teamsText);
    }

    @Override
    public int getItemCount() {
        return leagues.size();
    }

    public static class LeagueViewHolder extends RecyclerView.ViewHolder {
        final TextView leagueName;
        final TextView countryName;
        final TextView teamName;

        public LeagueViewHolder(@NonNull View itemView) {
            super(itemView);
            leagueName = itemView.findViewById(R.id.textViewLeagueName);
            countryName = itemView.findViewById(R.id.textViewCountry);
            teamName = itemView.findViewById(R.id.textViewTeamName);
        }
    }
}
