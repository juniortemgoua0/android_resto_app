package com.orange.apptest2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
  Button returnThird;
    public final static String EXTRA_REPLY_MESSAGE = "reponse_ok";
    public final static String EXTRA_REPLY_CANCELED_MESSAGE = "reponse_canceled";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        returnThird = findViewById(R.id.return_third_activity);

        returnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY_MESSAGE, "Nous revenons de la troisieme activite");
                setResult(RESULT_OK, replyIntent);
                finish();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_REPLY_CANCELED_MESSAGE, "Nous revenons de la troisieme activite sans avoir accomplit l'objectif");
            setResult(RESULT_CANCELED, replyIntent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


