package com.example.sudapost5050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complainmenu extends AppCompatActivity {

    Button btn_add, btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complainmenu);


        btn_add =(Button) findViewById(R.id.btn_addComplain);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(Complainmenu.this, CustomerComplain.class) ;
                startActivity(in);
            }
        });


        btn_list=(Button) findViewById(R.id.btn_ListComplain);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inServices =new Intent (Complainmenu.this,ComplainList.class);
                startActivity(inServices);
            }
        });




    }
}
