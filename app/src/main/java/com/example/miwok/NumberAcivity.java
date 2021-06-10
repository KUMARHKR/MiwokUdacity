package com.example.miwok;


import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberAcivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
//Array
        ArrayList< String > words = new ArrayList<String>();
        words.add("one") ;
        words.add("two") ;
        words.add("three") ;
        words.add("four") ;
        words.add("five") ;
        words.add("six") ;
        words.add("seven") ;
        words.add("eight") ;
        words.add("mine") ;
        words.add("ten") ;

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootview);

        int index=0;
        while ( index <words.size()); {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            index++;

        }


    }
}