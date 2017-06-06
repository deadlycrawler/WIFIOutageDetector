package com.tools.radio.wifioutagedetector;


import android.content.Context;
import android.util.Log;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.view.View.Z;

public class Recorder {

    public Recorder(){


    }
    private boolean recorderActive = false;


    public boolean start() {

        while (this.recorderActive == true) {
            //need to periodicly ping and record
            return ping();

        }
        return true;
    }

    public void stop() {

        recorderActive = false;
    }

    public boolean ping(){

        //placeholder
        return true;
    }

}
