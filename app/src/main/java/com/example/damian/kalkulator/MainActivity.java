package com.example.damian.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvTekst;
    private EditText etTekst;
    private EditText etTekst1;
    public int wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        //RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        //RadioButton rbOpcja1 = (RadioButton) findViewById(R.id.rbOpcja1);
        //RadioButton rbOpcja2 = (RadioButton) findViewById(R.id.rbOpcja2);
        //RadioButton rbOpcja3 = (RadioButton) findViewById(R.id.rbOpcja3);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton radioButton = (RadioButton) v;

                if(radioButton.isChecked()) {
                    Log.i("TAG", "Zaznaczona opcja: " + radioButton.getText());
                }
            }
        };

        //rbOpcja1.setOnClickListener(listener);
        //rbOpcja2.setOnClickListener(listener);
        //rbOpcja3.setOnClickListener(listener);

        //Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planety, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);



        tvTekst = findViewById(R.id.tvTekst);
        etTekst  = findViewById(R.id.etTekst);
        etTekst1  = findViewById(R.id.etTekst1);
        Button dodaj = findViewById(R.id.dodaj);
        Button odejmij = findViewById(R.id.odejmij);
        Button pomnoz = findViewById(R.id.pomnoz);
        Button podziel = findViewById(R.id.podziel);
        dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tekst = etTekst.getText().toString();
                String tekst1 = etTekst1.getText().toString();
                //tvTekst.setText(wynik);
                wynik = Integer.valueOf(tekst) + Integer.valueOf(tekst1);
                Log.i("TAG", "" +Integer.valueOf(tekst));
                Log.i("TAG", "" +Integer.valueOf(tekst1));
                tvTekst.setText(String.valueOf(wynik));
                //tvTekst.setText("Przycisk został kliknięty");
                //Log.d("TAG","Przycisk został kliknięty");
                //Toast.makeText(view.getContext(), "Click", Toast.LENGTH_LONG).show();
            }
        });

        odejmij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tekst = etTekst.getText().toString();
                String tekst1 = etTekst1.getText().toString();
                //tvTekst.setText(wynik);

                if(Integer.valueOf(tekst) > Integer.valueOf(tekst1)){
                    wynik = Integer.valueOf(tekst) - Integer.valueOf(tekst1);
                }
                else {
                    wynik = Integer.valueOf(tekst1) - Integer.valueOf(tekst);
                }

                Log.i("TAG", "" +Integer.valueOf(tekst));
                Log.i("TAG", "" +Integer.valueOf(tekst1));
                tvTekst.setText(String.valueOf(wynik));
                //tvTekst.setText("Przycisk został kliknięty");
                //Log.d("TAG","Przycisk został kliknięty");
                //Toast.makeText(view.getContext(), "Click", Toast.LENGTH_LONG).show();
            }
        });

        podziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tekst = etTekst.getText().toString();
                String tekst1 = etTekst1.getText().toString();
                //tvTekst.setText(wynik);
                if(Integer.valueOf(tekst) == 0 || Integer.valueOf(tekst1) == 0){
                    wynik = 0;
                }else if(Integer.valueOf(tekst) > Integer.valueOf(tekst1)) {
                    wynik = Integer.valueOf(tekst) / Integer.valueOf(tekst1);
                }else {
                    wynik = Integer.valueOf(tekst1) / Integer.valueOf(tekst);
                }

                Log.i("TAG", "" +Integer.valueOf(tekst));
                Log.i("TAG", "" +Integer.valueOf(tekst1));
                tvTekst.setText(String.valueOf(wynik));
                //tvTekst.setText("Przycisk został kliknięty");
                //Log.d("TAG","Przycisk został kliknięty");
                //Toast.makeText(view.getContext(), "Click", Toast.LENGTH_LONG).show();
            }
        });

        pomnoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tekst = etTekst.getText().toString();
                String tekst1 = etTekst1.getText().toString();
                //tvTekst.setText(wynik);
                wynik = Integer.valueOf(tekst) * Integer.valueOf(tekst1);
                Log.i("TAG", "" +Integer.valueOf(tekst));
                Log.i("TAG", "" +Integer.valueOf(tekst1));
                tvTekst.setText(String.valueOf(wynik));
                //tvTekst.setText("Przycisk został kliknięty");
                //Log.d("TAG","Przycisk został kliknięty");
                //Toast.makeText(view.getContext(), "Click", Toast.LENGTH_LONG).show();
            }
        });
    }
}
