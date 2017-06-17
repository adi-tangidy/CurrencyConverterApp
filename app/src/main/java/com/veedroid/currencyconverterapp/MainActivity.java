package com.veedroid.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertClick(View view){
        EditText txtConvertAmt = (EditText) findViewById(R.id.txtConvertAmount);

        Double conversionRate = new Double("13297");

        Toast.makeText(MainActivity.this, "IDR " + new Double(txtConvertAmt.getText().toString()) * conversionRate, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
