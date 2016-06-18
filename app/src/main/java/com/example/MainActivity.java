package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText priceField;
    EditText vatField;
    EditText discountField;
    TextView finalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceField  = (EditText) findViewById(R.id.priceField);
        vatField = (EditText) findViewById(R.id.vatField);
        discountField = (EditText) findViewById(R.id.discountField);
        finalPrice = (TextView) findViewById(R.id.finalPriceLabel);
    }

    public void calculatePrice(View view) {

        double price = Double.parseDouble(priceField.getText().toString());
        double vat = Double.parseDouble(vatField.getText().toString());
        double discount = Double.parseDouble(discountField.getText().toString());

        price += (price*vat)/100;
        price -= (price*discount)/100;

        finalPrice.setText("Total Price is : " + String.valueOf(price));



    }
}
