package com.example.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.proyectofinal.models.Muerto;

import java.util.List;

public class MuertoAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Muerto> myMuerto;

    public MuertoAdapter(Activity activity, List<Muerto> myMuerto) {
        this.activity = activity;
        this.myMuerto = myMuerto;
    }

    @Override
    public int getCount()  {
        return myMuerto.size();
    }

    @Override
    public Object getItem(int position)  {
        return myMuerto.get(position);
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
            v = inf.inflate(R.layout.itemmuerto,null);
        }

        Muerto Muerto = myMuerto.get(position);

        TextView deathMuerto = v.findViewById(R.id.txtdeath);
        deathMuerto.setText(Muerto.getDeathMuerto());

        TextView causeMuerto = v.findViewById(R.id.txtcause);
        causeMuerto.setText(Muerto.getCauseMuerto());

        TextView responsibleMuerto = v.findViewById(R.id.txtresponsible);
        responsibleMuerto.setText(Muerto.getResponsibleMuerto());

        TextView last_wordsMuerto = v.findViewById(R.id.txtUltimasp);
        last_wordsMuerto.setText(Muerto.getLast_wordsMuerto());


        return v;
    }
}
