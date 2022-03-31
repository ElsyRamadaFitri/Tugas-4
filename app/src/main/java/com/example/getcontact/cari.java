package com.example.getcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cari extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.cari);
    }

    public void clickcari(View view) {
        Intent i = new Intent(this,cari.class);
        startActivity(i);
    }

    public void clickpercakapan(View view) {
        Intent i = new Intent(this,percakapan.class);
        startActivity(i);
    }

    public void clickpanggilan(View view) {
        Intent i = new Intent(this,panggilan.class);
        startActivity(i);
    }

    public void clicklainnya(View view) {
        Intent i = new Intent(this,lainnya.class);
        startActivity(i);
    }
}
