package com.example.ahsan.taranagarstarcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home(View view) {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void about(View view) {
        Intent i=new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(i);
        finish();
    }

    public void place(View view) {
        Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
        finish();
    }

    public void clg(View view) {
        Intent i=new Intent(getApplicationContext(),Main4Activity.class);
        startActivity(i);
        finish();
    }
}
