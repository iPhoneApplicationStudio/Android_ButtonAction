package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    int price = 5;
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setQuantityText();
    }

    public void submitOrder(View view)
    {
        displayPrice(price,quantity);
    }



    public void displayPrice(int numberOfCoffees, int quantity)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(numberOfCoffees*quantity));
    }

    public void incrementQuantity(View view){
        quantity += 1;
        setQuantityText();
    }
    public void decrementQuantity(View view)
    {
        if (quantity == 0){
            return;
        }
        quantity -= 1;
        setQuantityText();
    }

    private void setQuantityText()
    {
        TextView quantityText = (TextView) findViewById(R.id.quantity_text_view);
        quantityText.setText(""+quantity);
    }

}
