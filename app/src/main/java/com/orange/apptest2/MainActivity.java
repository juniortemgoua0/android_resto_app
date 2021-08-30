package com.orange.apptest2;

import static com.orange.apptest2.R.drawable.ic_launcher_background;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.orange.apptest2.adapter.HigtTechAdapter;
import com.orange.apptest2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    public static final int SECOND_ACTIVITY_REQUEST = 2;
    public static final int THIRD_ACTIVITY_REQUEST = 3;


    public  static final String  EXTRA_MESSAGE_TO_SEND_BY_SENDER = "messageToSendBySender";
    public ActivityMainBinding ui ;
    public  static final String  NOM = "nom";
    public static final String PRENOM = "prenom";
    MainActivity activity;
    int count ;
    EditText nom ;
    EditText prenom;
    Button send;
    Drawable addBtnColor;
    LinearLayout myLayout;
    TextView showResult;
    Button btnSender ;
    EditText editSender;
    TextView textSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        btnSender =findViewById(R.id.btn_sender);
        textSender = findViewById(R.id.txt_sender);
        editSender = findViewById(R.id.edit_sender);
        btnSender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String messageToSend = editSender.getText().toString();
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra(EXTRA_MESSAGE_TO_SEND_BY_SENDER,  messageToSend);
                startActivityForResult(intent, SECOND_ACTIVITY_REQUEST);
            }
        });

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Bonjour ");
//        actionBar.hide();

//        List<HigtTech> listItem = new ArrayList<>();
//        listItem.add( new HigtTech("Ordinateur fixe", "pharmacie_logo" , 5000));
//        listItem.add( new HigtTech("Processeur", "ubuntu_logo_orange" , 2000));
//        listItem.add( new HigtTech("Super clavier", "visual_studio" , 1000));
//
//        ListView showListItem = findViewById(R.id.first_list_view);
//
//        showListItem.setAdapter(new HigtTechAdapter(this, listItem));

//         nom= findViewById(R.id.nom);
//         prenom = findViewById(R.id.prenom);
//        send = findViewById(R.id.send_btn);


//        myLayout = findViewById(R.id.my_dynamic_layout);
//        TextView newText = new TextView(this);
//        newText.setText(getResources().getString(R.string.heading));
//        newText.setTextSize(22);
//        newText.setTextColor(Color.rgb(255,0,255));
//        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        newText.setLayoutParams(params);
//        myLayout.addView(newText);
//
//
//        ImageView  myImage = new ImageView(this);
//        ViewGroup.LayoutParams newParams = new LinearLayout.LayoutParams(100, 100);
//        myImage.setBackgroundResource(R.drawable.ic_launcher_foreground);
//        myImage.setLayoutParams(newParams);
//        myLayout.addView(myImage);

//        showResult= findViewById(R.id.show_result);
    }

    public void increment(View view) {
//        Toast.makeText(this, "salut", Toast.LENGTH_LONG).show();
//         count++;
//         value.setText(String.valueOf(count));
//         value.setTextColor(getResources().getColor(R.color.purple_500));
//
//         if(count%2 == 0){
//             addButton.setBackgroundColor(getResources().getColor(R.color.black));
//         }else addButton.setBackgroundColor(getResources().getColor(R.color.teal_200));



    }

    public void decrement(View view){


        if(count>0){
            count--;
//            value.setText(String.valueOf(count));
//            value.setTextColor(getResources().getColor(R.color.black));
        }else
            Toast.makeText(this , " vous ne pouvez pas aller en dessous de 0", Toast.LENGTH_LONG).show();
    }

    public void sendValues(View view) {

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(NOM, nom.getText().toString());
        intent.putExtra(PRENOM, prenom.getText().toString() );
        startActivity(intent);

    }

    public void showSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this , SecondActivity.class);
        startActivityForResult(intent, SECOND_ACTIVITY_REQUEST );

//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle("Salut");
//        dialog.setMessage("Bonjour comment aller vous la famille ");
//        dialog.setIcon(R.drawable.pharmacie_logo);
//        dialog.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                AlertDialog.Builder mySecondPopPup = new AlertDialog.Builder(MainActivity.this);
//                mySecondPopPup.setTitle("Second PopPup");
//                mySecondPopPup.setMessage(" voici le deuxieme popup");
//                mySecondPopPup.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext(), "Bouton oui  cliquer " , Toast.LENGTH_SHORT).show();
//                    }
//                });
//                mySecondPopPup.show();
//            }
//        });
//
//        dialog.setNegativeButton("Non", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                AlertDialog.Builder popup = new AlertDialog.Builder(MainActivity.this);
//                popup.setTitle("Alternative");
//                popup.setMessage("Nous remercions d'etre parvenu jusque la ");
//                popup.setPositiveButton("Merci", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getApplicationContext() , " refuser" , Toast.LENGTH_SHORT).show();
//                    }
//                });
//                popup.show();
//            }
//        });
//
//        dialog.show();
    }

    public void showThirdActivity(View view) {
        Intent intent = new Intent(MainActivity.this , ThirdActivity.class);
        startActivityForResult(intent, THIRD_ACTIVITY_REQUEST );

//        CustomDialog customDialog = new CustomDialog(MainActivity.this);
//        customDialog.setTitle("bonne annee 2021");
//        customDialog.setSubTitle("vous etes les bienvenu dans cette formation");
//        customDialog.getNoButton().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                customDialog.dismiss();
//                Toast.makeText(MainActivity.this, "action refuser" , Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        customDialog.getYesButton().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                customDialog.dismiss();
//                Toast.makeText(MainActivity.this, "action accepter" , Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        customDialog.build();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SECOND_ACTIVITY_REQUEST) {
            if (resultCode == RESULT_OK)
                textSender.setText(data.getStringExtra(SecondActivity.EXTRA_MESSAGE_TO_SEND_BY_RECEIVER));
//            else if(resultCode == RESULT_CANCELED)
//                showResult.setText(data.getStringExtra(SecondActivity.EXTRA_REPLY_CANCELED_MESSAGE));
        }
//        else if(requestCode == THIRD_ACTIVITY_REQUEST){
//            if (resultCode == RESULT_OK)
//                showResult.setText(data.getStringExtra(ThirdActivity.EXTRA_REPLY_MESSAGE));
//            else if(resultCode == RESULT_CANCELED)
//                showResult.setText(data.getStringExtra(ThirdActivity.EXTRA_REPLY_CANCELED_MESSAGE));
//        }

    }

}