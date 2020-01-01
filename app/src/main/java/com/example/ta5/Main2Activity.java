package com.example.ta5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void LogIn(View view) {
        EditText et1 = (EditText) findViewById(R.id.EditText1);
        EditText et2 = (EditText) findViewById(R.id.EditText2);
        if (et1.getText().toString().equals("Andres") && et2.getText().toString().equals( "123456789")){
            Intent i = new Intent(this, Main3Activity.class );
            startActivity(i);}
        else{
            Intent i = new Intent(this, Main4Activity.class );
            startActivity(i);}
        }
    }

