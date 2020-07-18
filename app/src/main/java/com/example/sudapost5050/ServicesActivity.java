package com.example.sudapost5050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ServicesActivity extends AppCompatActivity {

    Button btn_main, btn_map;

    ListView Lstview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);


        btn_main =(Button) findViewById(R.id.button1);
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(ServicesActivity.this, MainActivity.class) ;
                startActivity(in);
            }
        });


        btn_map=(Button) findViewById(R.id.button3);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inServices =new Intent (ServicesActivity.this,MapsActivity.class);
                startActivity(inServices);
            }
        });

        Lstview =(ListView) findViewById(R.id.List01);
        String [] values = new String[] {"خدمة البريد العادي" , "خدمة البريد السريع", "خدمة صناديق البريد الخصوصية", "خدمة توصيل البريد لأماكن الإقامة", "اخدمة الطرود البريدية", "شكاوي العملاء"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,android.R.id.text1,values );

        Lstview.setAdapter(adapter);

        Lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0) {

                    Intent myIntent = new Intent(view.getContext(), Service01.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 1) {


                    Intent myIntent = new Intent(view.getContext(), Service02.class);
                    startActivityForResult(myIntent, 0);

                }


                if (position == 2) {


                    Intent myIntent = new Intent(view.getContext(), Service03.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 3) {


                    Intent myIntent = new Intent(view.getContext(), Service04.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 4) {


                    Intent myIntent = new Intent(view.getContext(), Service05.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 5) {


                    Intent myIntent = new Intent(view.getContext(), Complainmenu.class);
                    startActivityForResult(myIntent, 0);

                }


            }


        });







    }
}



