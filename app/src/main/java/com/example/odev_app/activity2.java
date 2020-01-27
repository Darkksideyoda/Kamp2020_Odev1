package com.example.odev_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    Spinner spnrDuzey;
    boolean secimdef = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        spnrDuzey = findViewById(R.id.spinner_duzey);
        spnrDuzey.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(secimdef){
                    secimdef = false;
                }
                else{
                    TextView tv = (TextView)view;
                    String takecity = tv.getText().toString();
                    takecity = spnrDuzey.getSelectedItem().toString();
                    Toast.makeText(activity2.this,takecity+" Secildi.", Toast.LENGTH_LONG).show();
            }}

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
