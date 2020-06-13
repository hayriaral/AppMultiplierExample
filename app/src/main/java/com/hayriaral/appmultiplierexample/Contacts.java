package com.hayriaral.appmultiplierexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Contacts extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }

    public void openFavoriteContacts(View view) {
        Intent intent = new Intent(this, FavoriteContacts.class);
        startActivity(intent);
    }
}
