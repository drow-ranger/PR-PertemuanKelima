package com.deonico.prkelima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner menu1 = findViewById(R.id.spMenu1);
        final Spinner menu2 = findViewById(R.id.spMenu2);
        final Spinner menu3 = findViewById(R.id.spMenu3);
        final Spinner menu4 = findViewById(R.id.spMenu4);

        final EditText costmenu1 = findViewById(R.id.etMenu1);
        final EditText costmenu2 = findViewById(R.id.etMenu2);
        final EditText costmenu3 = findViewById(R.id.etMenu3);
        final EditText costmenu4 = findViewById(R.id.etMenu4);

        final Button Calc = findViewById(R.id.btnHitung);

        String[] strMenu1 = {"Sup Matahari",
                "Soto Ayam",
                "Bakso"};

        String[] strMenu2 = {"Nasi Gudeg",
                "Nasi Liwet",
                "Nasi Goreng"};

        String[] strMenu3 = {"Es Dawet",
                "Es Cincau"};

        String[] strMenu4 = {"Es Teh Manis",
                "Es Jeruk",
                "AMDK Botol"};

        ArrayAdapter adapterMenu1 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, strMenu1);
        ArrayAdapter adapterMenu2 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, strMenu2);
        ArrayAdapter adapterMenu3 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, strMenu3);
        ArrayAdapter adapterMenu4 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, strMenu4);

        menu1.setAdapter(adapterMenu1);
        menu2.setAdapter(adapterMenu2);
        menu3.setAdapter(adapterMenu3);
        menu4.setAdapter(adapterMenu4);

        menu1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newForm = new Intent(MainActivity.this,
                        ResultActivity.class);
                newForm.putExtra("menu1", menu1.getSelectedItem().toString());
                //newForm.putExtra("costmenu1", Double.parseDouble(costmenu1.getText().toString()));
                newForm.putExtra("costmenu1", costmenu1.getText().toString());
                startActivity(newForm);
            }
        });

    }
}
