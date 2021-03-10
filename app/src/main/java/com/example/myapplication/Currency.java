package com.example.myapplication;

import android.media.Image;

public class Currency {

    private String Flag;
    private String CoinName;
    private String CountryName;
    private String CoinValue;

    public Currency(String flag, String coinName, String countryName, String coinValue) {
        Flag = flag;
        CoinName = coinName;
        CountryName = countryName;
        CoinValue = coinValue;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }

    public String getCoinName() {
        return CoinName;
    }

    public void setCoinName(String coinName) {
        CoinName = coinName;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getCoinValue() {
        return CoinValue;
    }

    public void setCoinValue(String coinValue) {
        CoinValue = coinValue;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "Flag='" + Flag + '\'' +
                ", CoinName='" + CoinName + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", CoinValue='" + CoinValue + '\'' +
                '}';
    }
}

