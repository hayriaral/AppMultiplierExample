package com.hayriaral.appmultiplierexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void openInbox(View view){
        Intent intent = new Intent(this,Inbox.class);
        startActivity(intent);
    }

    public void openJunk(View view){
        Intent intent = new Intent(this,JunkEmail.class);
        startActivity(intent);
    }
}
