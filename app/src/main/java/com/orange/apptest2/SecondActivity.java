package com.orange.apptest2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.orange.apptest2.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    public final static String EXTRA_REPLY_MESSAGE = "reponse_ok";
    public final static String EXTRA_REPLY_CANCELED_MESSAGE = "reponse_canceled";
    public final static String EXTRA_MESSAGE_TO_SEND_BY_RECEIVER = "messageToSendByReceiver";
    public ActivitySecondBinding ui;
//    Button btnReceiver;
//    TextView textReceiver;
//    EditText editReceiver;

    Button returnSecond ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ui.btnReceiver.setOnClickListener(v -> {
            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_MESSAGE_TO_SEND_BY_RECEIVER,ui.editReceiver.getText().toString());
            setResult(RESULT_OK , replyIntent);
            finish();
        });
//        btnReceiver = findViewById(R.id.btn_receiver);
//        textReceiver = findViewById(R.id.text_receiver);
//        editReceiver =findViewById(R.id.edit_receiver);

        Intent receiveIntent = getIntent();
        ui.textReceiver.setText(receiveIntent.getStringExtra(MainActivity.EXTRA_MESSAGE_TO_SEND_BY_SENDER));

//        ui.btnReceiver.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent replyIntent = new Intent();
//                replyIntent.putExtra(EXTRA_MESSAGE_TO_SEND_BY_RECEIVER,editReceiver.getText().toString());
//                setResult(RESULT_OK , replyIntent);
//                finish();
//            }
//        });


//        returnSecond.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent replyIntent = new Intent();
//                replyIntent.putExtra(EXTRA_REPLY_MESSAGE, "Nous revenons de la seconde activite");
//                setResult(RESULT_OK, replyIntent);
//                finish();
//            }
//        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_REPLY_CANCELED_MESSAGE, "Nous revenons de la seconde activite sans avoir accomplit l'objectif");
            setResult(RESULT_CANCELED, replyIntent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}