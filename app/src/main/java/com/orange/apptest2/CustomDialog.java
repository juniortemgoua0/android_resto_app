package com.orange.apptest2;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialog extends Dialog {

    // fields
    private String title , subTitle;
    Button yesButton , noButton;
    TextView txtTitle , txtSubTitle;

    //constructor
    public CustomDialog(@NonNull Context context) {
        super(context, R.style.Base_Theme_AppCompat_Light_Dialog_Alert);
        setContentView(R.layout.my_popup_template);
        yesButton = findViewById(R.id.yes_button);
        noButton = findViewById(R.id.no_button);
        txtTitle = findViewById(R.id.title);
        txtSubTitle = findViewById(R.id.subtitle);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Button getYesButton() {
        return yesButton;
    }


    public Button getNoButton() {
        return noButton;
    }

   public void build(){
        this.show();
        this.txtTitle.setText(this.title);
        this.txtSubTitle.setText(this.subTitle);
   }
}
