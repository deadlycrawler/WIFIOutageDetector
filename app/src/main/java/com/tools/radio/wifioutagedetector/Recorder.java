package com.tools.radio.wifioutagedetector;


import android.content.Context;
import android.util.Log;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Recorder {

    public Recorder(){


    }
    private boolean recorderActive = false;


    public void start() {

        while (this.recorderActive == true) {
            //need to periodicly ping and record

        }
    }

    public void stop() {

        recorderActive = false;
    }

}
