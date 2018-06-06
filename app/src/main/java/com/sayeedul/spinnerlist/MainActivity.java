package com.sayeedul.spinnerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String [] country = {"India","China","Pakistan","USA"};
    String [] state1 = {"Ind.State","W.B","M.P","Punjab","Maharashtra"};
    String [] state2 = {"Chin.State","Sichuan","Gansu","Yunnan","Hunan"};
    String [] state3 = {"Pak.State","Punjab.","Sindh","Balochistan","Khyber Pakhtunkhwa"};
    String [] state4 = {"USA.State","Georgia","Hawaii","Texas"," Colorado"};

    Spinner CountrySpinner,StateSpinner;
    ArrayAdapter<String> countryAdapter;
    ArrayAdapter<String> stateAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountrySpinner = (Spinner)findViewById(R.id.countrySpinner);
        StateSpinner = (Spinner)findViewById(R.id.stateSpinner);

        countryAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,country);
        CountrySpinner.setAdapter(countryAdapter);

        stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,state1);
        StateSpinner.setAdapter(stateAdapter);

        CountrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0 :   stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,state1);
                        StateSpinner.setAdapter(stateAdapter);
                        break;

                    case 1 :   stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,state2);
                        StateSpinner.setAdapter(stateAdapter);
                        break;

                    case 2 :   stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,state3);
                        StateSpinner.setAdapter(stateAdapter);
                        break;

                    case 3 :    stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,state4);
                        StateSpinner.setAdapter(stateAdapter);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
