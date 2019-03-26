package com.example.trygithub.SharedPrefrence;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences sharedPref ;
    SharedPreferences.Editor editor ;
    Context context ;
    int PRIVATE_MODE =0;
    private static final String PREF_NAME ="nagi" ;
    private static final String IS_FIRST_TIME_LAUNCH ="IsFirstTimeLaunch";


    public PrefManager (Context context1){
        this.context=context1;
        sharedPref = context1.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor= sharedPref.edit();

    }
    public void setFirstTimeLaunched (boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();

    }
    public boolean isFirstTimeLaunch (){
        return sharedPref.getBoolean(IS_FIRST_TIME_LAUNCH,true);

    }
}
