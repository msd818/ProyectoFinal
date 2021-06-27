package com.example.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.proyectofinal.models.Episodio;

import java.util.List;

public class EpisodioAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Episodio> myEpisodio;

    public EpisodioAdapter(Activity activity, List<Episodio> myEpisodio) {
        this.activity = activity;
        this.myEpisodio = myEpisodio;
    }

    @Override
    public int getCount()  {
        return myEpisodio.size();
    }

    @Override
    public Object getItem(int position)  {
        return myEpisodio.get(position);
    }

    @Override
    public long getItemId(int position)  {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemepisodio,null);
        }

        Episodio Episodio = myEpisodio.get(position);

        TextView titleEpisodio = v.findViewById(R.id.txtTitle);
        titleEpisodio.setText(Episodio.getTitleEpisodio());

        TextView seasonEpisodio = v.findViewById(R.id.txtSeason);
        seasonEpisodio.setText(Episodio.getSeasonEpisodio());

        TextView episodeEpisodio = v.findViewById(R.id.txtEpisode);
        episodeEpisodio.setText(Episodio.getEpisodeEpisodio());

        TextView dateEpisodio = v.findViewById(R.id.txtDate);
        dateEpisodio.setText(Episodio.getDateEpisodio());


        return v;
    }
}
