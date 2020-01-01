package com.example.ta5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void cap(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void hulk(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void capitana(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void black(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void ironman(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void thor(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
}
