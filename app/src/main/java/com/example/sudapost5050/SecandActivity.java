package com.example.sudapost5050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecandActivity extends AppCompatActivity {

    Button btn_main, btn_services, btn_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secand);

        btn_main =(Button) findViewById(R.id.button1);
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(SecandActivity.this, MainActivity.class) ;
                startActivity(in);
            }
        });


        btn_services=(Button) findViewById(R.id.button2);
        btn_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inServices =new Intent (SecandActivity.this,ServicesActivity.class);
                startActivity(inServices);
            }
        });


        btn_map=(Button) findViewById(R.id.button3);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inMap =new Intent (SecandActivity.this,MapsActivity.class);
                startActivity(inMap);
            }
        });



    }
}
