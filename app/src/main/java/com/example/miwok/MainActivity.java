package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberAcivity clickListner = new NumberAcivity();
        TextView numbers =(TextView)findViewById(R.id.Number);
        numbers.setOnClickListener(clickListner);

    }
    /*public void numberView(View view){
        Intent i = new Intent (this , NumberAcivity.class);
        startActivity(i);

    }*/
    public void familyView(View view){
        Intent i =new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
    public void phrasasView(View view){
        Intent i =new Intent(this,PhrasasActivity.class);
        startActivity(i);
    }
    public void colorsView(View view){
        Intent i =new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

}