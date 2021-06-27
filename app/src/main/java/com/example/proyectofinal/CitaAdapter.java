package com.example.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.proyectofinal.models.Cita;
import com.example.proyectofinal.models.Episodio;

import java.util.List;

public class CitaAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Cita> myCita;

    public CitaAdapter(Activity activity, List<Cita> myCita) {
        this.activity = activity;
        this.myCita = myCita;
    }

    @Override
    public int getCount()  {
        return myCita.size();
    }

    @Override
    public Object getItem(int position)  {
        return myCita.get(position);
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
            v = inf.inflate(R.layout.itemcita,null);
        }

        Cita Cita = myCita.get(position);

        TextView quoteCitas = v.findViewById(R.id.txtCita);
        quoteCitas.setText(Cita.getQuoteCitas());

        TextView authorCitas = v.findViewById(R.id.txtauthor);
        authorCitas.setText(Cita.getAuthorCitas());



        return v;
    }
}
