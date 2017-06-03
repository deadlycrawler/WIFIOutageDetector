package com.tools.radio.wifioutagedetector;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean mStartButtonTogleStage = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView record = (TextView) findViewById(R.id.ToggleRecordButton);


        record.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mStartButtonTogleStage==true){
                    record.setText("recording...");
                    record.setBackgroundColor(Color.RED);
                    mStartButtonTogleStage=false;

                }else{
                    record.setText("recording stoped");
                    record.setBackgroundColor(Color.CYAN);
                    mStartButtonTogleStage=true;}


            }

        });



    }

}
