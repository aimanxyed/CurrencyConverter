package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {








    public void functionConvert(View view)
    {
       Log.i(" info" , "button pressed");
        //TextView currencyTextView = (TextView) findViewById(R.id.AmountTextView);
       EditText currencyInput =   (EditText) findViewById(R.id.AmountPKEditTextView);
        //Log.i(" textinput", currencyInput.getText().toString() );
         String AmountInEuros = currencyInput.getText().toString();
         Double AmountInEurosDouble = Double.parseDouble(AmountInEuros);
         Double AmountInDollarsDouble = AmountInEurosDouble *1.3;
         String AmountInDollarsString = String.format("%.2f", AmountInDollarsDouble);
         Toast.makeText(this, AmountInDollarsString, Toast.LENGTH_SHORT ).show();

    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
