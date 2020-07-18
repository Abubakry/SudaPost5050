package com.example.sudapost5050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerComplainMenu extends AppCompatActivity {

    Button btn_add, btn_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_complain_menu);



        btn_add =(Button) findViewById(R.id.button1);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(CustomerComplainMenu.this, CustomerComplain.class) ;
                startActivity(in);
            }
        });


        btn_list=(Button) findViewById(R.id.button2);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inServices =new Intent (CustomerComplainMenu.this,ComplainList.class);
                startActivity(inServices);
            }
        });


    }
}
