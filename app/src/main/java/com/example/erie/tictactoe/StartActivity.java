package com.example.erie.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button help;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        help = (Button)findViewById(R.id.button2);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(StartActivity.this,HelpActivity.class);

                startActivity(helpint);
            }
        });


        play = (Button)findViewById(R.id.button);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playint = new Intent(StartActivity.this,MainActivity.class);

                startActivity(playint);
            }
        });



    }
    public void clickExit(View v){
        finish();}

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {




                    public void onClick(DialogInterface arg0, int arg1) {
                        StartActivity.super.onBackPressed();
                    }
                }).create().show();
    }

    }


