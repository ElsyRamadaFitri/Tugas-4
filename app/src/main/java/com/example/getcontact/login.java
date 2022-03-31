package com.example.getcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);
    }
    public void clickLogin (View view) {
        Intent i = new Intent(this,cari.class);
        startActivity(i);
    }
}
