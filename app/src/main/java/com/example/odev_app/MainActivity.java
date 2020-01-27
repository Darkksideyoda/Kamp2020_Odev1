package com.example.odev_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String temp1,temp2;
    Button btngir;
    EditText edtc,edogr;
    Intent intent;
    Dialog cdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngir=findViewById(R.id.btnlogin);
        edtc = findViewById(R.id.edtc_cus);
        edogr=findViewById(R.id.edtogr_cus);
    }

    public void onClick(View view) {
        /*String ogr="1234";
        String tc="1234";
       // ogr = Integer.parseInt((edogr.getText().toString()));
       // tc = Integer.parseInt((edtc.getText().toString()));*/



        if(edtc.getText().toString().equals(temp1)&&edogr.getText().toString().equals(temp2)){

            Toast.makeText(this,"Doğrulandı",Toast.LENGTH_LONG).show();


            intent= new Intent(this,activity2.class);

            Bundle bundle = new Bundle();


            startActivity(intent);


            }



    }

    public void onClick2(View view) {

        dialogdisp("olustur");


    }

    private void dialogdisp(String msg) {


        cdialog = new Dialog(this);
        cdialog.setContentView(R.layout.dialog);
        Button btnkayitol = cdialog.findViewById(R.id.diakayit);
        final EditText tcogr = cdialog.findViewById(R.id.edtc_cus);
        final EditText numogr = cdialog.findViewById(R.id.edtogr_cus);



        btnkayitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1,b1;
                a1 = tcogr.getText().toString();
                b1 = numogr.getText().toString();
                temp1=a1;
                temp2=b1;
                cdialog.dismiss();
            }

        });


        cdialog.show();


    }
}
