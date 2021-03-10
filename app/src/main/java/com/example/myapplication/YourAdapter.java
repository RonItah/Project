package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class YourAdapter extends ArrayAdapter<Currency> {
    private Context c;
    private int resource;
    private ArrayList<Currency> objects;

    public YourAdapter(Context c, int resource, ArrayList<Currency> objects) {
        super(c,resource,objects);
        this.c = c;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li=(LayoutInflater)this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v =li.inflate(this.resource, null);
        Currency c = this.objects.get(position);
        TextView CountryName = v.findViewById(R.id.CountryName);
        CountryName.setText(String.valueOf(c.getCountryName()));
        TextView CurrencyName = v.findViewById(R.id.CurrencyName);
        CurrencyName.setText(String.valueOf(c.getCoinName()));
        TextView CurrencyValue = v.findViewById(R.id.CurrencyValue);
        CurrencyValue.setText(String.valueOf(c.getCoinValue()));
        ImageView IV = v.findViewById(R.id.usa);
        IV.setImageResource(R.drawable.usa);
        return v;
    }
}

