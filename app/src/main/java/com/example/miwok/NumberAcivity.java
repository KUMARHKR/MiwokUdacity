package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//public class NumberAcivity extends AppCompatActivity {
public class NumberAcivity implements View.OnClickListener{


//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_number);
//    }
    @Override
    public  void onClick(View view){
        Toast.makeText(view.getContext(),
                "Open the List of Numbers",
                Toast.LENGTH_SHORT).show();

    }
}