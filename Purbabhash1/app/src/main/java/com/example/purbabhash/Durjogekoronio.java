package com.example.purbabhash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Durjogekoronio extends Activity implements OnClickListener{
    CheckBox ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8,ck9;
//    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.durjoge_koronio);

//        bt = (Button)findViewById(R.id.button);
//        bt.setOnClickListener(this);
        ck1 =(CheckBox)findViewById(R.id.checkBox1);
        ck1.setOnClickListener(this);
        ck2 =(CheckBox)findViewById(R.id.checkBox2);
        ck2.setOnClickListener(this);
        ck3 =(CheckBox)findViewById(R.id.checkBox3);
        ck3.setOnClickListener(this);
        ck4 =(CheckBox)findViewById(R.id.checkBox4);
        ck4.setOnClickListener(this);
        ck5 =(CheckBox)findViewById(R.id.checkBox5);
        ck5.setOnClickListener(this);
        ck6 =(CheckBox)findViewById(R.id.checkBox6);
        ck6.setOnClickListener(this);
        ck7 =(CheckBox)findViewById(R.id.checkBox7);
        ck7.setOnClickListener(this);
        ck8 =(CheckBox)findViewById(R.id.checkBox8);
        ck8.setOnClickListener(this);
        ck9 =(CheckBox)findViewById(R.id.checkBox9);
        ck9.setOnClickListener(this);

        if(ck1.isChecked()==true||ck2.isChecked()==true||ck3.isChecked()==true||ck4.isChecked()==true){
            if(ck5.isChecked()==true||ck6.isChecked()==true||ck7.isChecked()==true||ck8.isChecked()==true||ck9.isChecked()==true){
                startActivity(new Intent(Durjogekoronio.this,Cyclonecenter.class));
            }
        }

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
//    if(){}
//	else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}
//        if(){}
//        else if(){}

        if(ck1.isChecked()==true&&ck2.isChecked()==true&&ck3.isChecked()==true&&ck4.isChecked()==true){
            if(ck5.isChecked()==true && ck6.isChecked()==true&&ck7.isChecked()==true&&ck8.isChecked()==true&&ck9.isChecked()==true){
                Durjogekoronio.this.finish();
                startActivity(new Intent(Durjogekoronio.this,Cyclonecenter.class));
            }
        }

    }

    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        Durjogekoronio.this.finish();
        startActivity(new Intent(Durjogekoronio.this,Options.class));

    }

}
