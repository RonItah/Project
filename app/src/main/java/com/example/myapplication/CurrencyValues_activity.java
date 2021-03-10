package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CurrencyValues_activity extends AppCompatActivity {

    private ListView LV;
    private ArrayList<Currency> Currencies;
    private YourAdapter YA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_values_activity);
        LV = findViewById(R.id.LV);
        Currencies = new ArrayList<Currency>();
        GetData();
        YourAdapter YA = new YourAdapter(this,R.layout.layout,Currencies);
        LV.setAdapter(YA);
    }
    public void GetData(){
        Currency c= new Currency("usa.png","US Dollars","USA","3.32327489");
        Currencies.add(c);
        c= new Currency("europe.png","Euro","Europe","3.95331796");
        Currencies.add(c);
    }
}