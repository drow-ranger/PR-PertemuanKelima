package com.deonico.prkelima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView menuku1 = findViewById(R.id.tvMenuku1);
        TextView etmenu1 = findViewById(R.id.tvMenu1);

        String menu1 = getIntent().getStringExtra("menu1");
        Double hargamenu1=0.8;
        String cost1 = getIntent().getStringExtra("costmenu1");
        etmenu1.setText(cost1);

        //String getcost1 = getIntent().getStringExtra("costmenu1");
        //Double cost1 = Double.parseDouble(getcost1);
        //Double cost1 = getIntent().getDoubleExtra("costmenu1",0);
        Double x = Double.parseDouble(etmenu1.getText().toString());
        if(menu1 == "Sup Matahari"){
            hargamenu1 = 12000.0*x;
        }else if (menu1 == "Soto Ayam"){
            hargamenu1 = 13000.0*x;
        }/*else if (menu1 == "Bakso"){
            hargasatuanmenu1 = 15000.0;
            hargamenu1 = hargasatuanmenu1*cost1;
        }else{
            hargamenu1 = 0.0;
        }*/

        String y = hargamenu1.toString();

        menuku1.setText(menu1);
        etmenu1.setText(y);

    }
}
