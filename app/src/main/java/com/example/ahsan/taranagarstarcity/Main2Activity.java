package com.example.ahsan.taranagarstarcity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void chouk(View view) {


        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/aPNSc8jrw872"));
        startActivity(i);
        finish();
    }

    public void mandir(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/1ZLRUX4nfXt"));
        startActivity(i);
        finish();
    }

    public void fort(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/kj2FYjknSgs"));
        startActivity(i);
        finish();
    }

    public void masjid(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/1PgmdpUPj662"));
        startActivity(i);
        finish();
    }

    public void masjidd(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/zwRUqfp4AHB2"));
        startActivity(i);
        finish();
    }


    public void home(View view) {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void place(View view) {
        Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
        finish();
    }

    public void about(View view) {
        Intent i=new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(i);
        finish();
    }
}

