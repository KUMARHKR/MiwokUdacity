package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers =(TextView)findViewById(R.id.Number);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this,
                        NumberAcivity.class);
                startActivity(numbersIntent);
            }
        });
        //-----------------------------------------------------------------------------------------------------
        TextView family =(TextView)findViewById(R.id.FamilyMembers);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this,
                        FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
    //-----------------------------------------------------------------------------------------------------

        TextView colors =(TextView)findViewById(R.id.Colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this,
                        ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

//-----------------------------------------------------------------------------------------------

        TextView phrasas =(TextView)findViewById(R.id.phrasas);
        phrasas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasasIntent = new Intent(MainActivity.this,
                        PhrasasActivity.class);
                startActivity(phrasasIntent);
            }
        });
        //-----------------------------------------------------------------------------------------------------


    }


}