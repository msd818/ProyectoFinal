package com.example.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.proyectofinal.models.Personaje;

import java.util.List;

public class PersonajeAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Personaje> myPersonaje;

    public PersonajeAdapter(Activity activity, List<Personaje> myPersonaje) {
        this.activity = activity;
        this.myPersonaje = myPersonaje;
    }

    @Override
    public int getCount()  {
        return myPersonaje.size();
    }

    @Override
    public Object getItem(int position)  {
        return myPersonaje.get(position);
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
            v = inf.inflate(R.layout.itempersonaje,null);
        }

        Personaje Personaje = myPersonaje.get(position);

        TextView namePersonaje = v.findViewById(R.id.txtName1);
        namePersonaje.setText(Personaje.getNamePersonaje());

        TextView birthdayPersonaje = v.findViewById(R.id.txtBirthday);
        birthdayPersonaje.setText(Personaje.getBirthdayPersonaje());

        TextView statusPersonaje = v.findViewById(R.id.txtStatus);
        statusPersonaje.setText(Personaje.getStatusPersonaje());

        TextView nicknamePersonaje = v.findViewById(R.id.txtNickname);
        nicknamePersonaje.setText(Personaje.getNicknamePersonaje());


        return v;
    }
}
