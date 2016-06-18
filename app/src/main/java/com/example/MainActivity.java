package com.example;

import android.graphics.Paint;
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
    TextView totalPayable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        priceField  = (EditText) findViewById(R.id.priceField);
        vatField = (EditText) findViewById(R.id.vatField);
        discountField = (EditText) findViewById(R.id.discountField);
        finalPrice = (TextView) findViewById(R.id.finalPriceLabel);
        totalPayable = (TextView) findViewById(R.id.totalPayableField);
    }

    public void calculatePrice(View view) {

            double price = Double.parseDouble(priceField.getText().toString().trim());
            double vat = Double.parseDouble(vatField.getText().toString().trim());
            double discount = Double.parseDouble(discountField.getText().toString().trim());


        CalculateInterest obj = new CalculateInterest(price,vat,discount);
        finalPrice.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        finalPrice.setText(obj.getInterestAmount());
        totalPayable.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        totalPayable.setText(obj.getTotalpayable());



    }
}
