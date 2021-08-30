package com.orange.apptest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    TextView nom ;
    TextView prenom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       nom = findViewById(R.id.show_nom);
       prenom = findViewById(R.id.show_prenom);
        Intent intent = getIntent();
        String nomIntent = intent.getStringExtra(MainActivity.NOM);
        String prenomIntent = intent.getStringExtra((MainActivity.PRENOM));
        nom.setText("Nom : " + nomIntent);
        if(!prenomIntent.equalsIgnoreCase("junior"))
            prenom.setText("Prenom : " + prenomIntent);
       else
         prenom.setVisibility(View.INVISIBLE);


//        textDetail = findViewById(R.id.detail_txt);
//        textDetail.setText(MainActivity.MESSAGE);
//        Toast.makeText(this, MainActivity.MESSAGE, Toast.LENGTH_LONG).show();
    }


//    public void changeActivity(View view) {
//        Intent intent = new Intent(this, )
//    }
}