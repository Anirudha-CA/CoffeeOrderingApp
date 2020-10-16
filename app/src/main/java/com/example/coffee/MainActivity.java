package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int q1=0;
    int q2=0;
    int q3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        String price1 = "Amount for " + q1 + "Cups of Black Coffee is $" + q1*3;
        String price2 = "Amount for " + q2 + "Cups of Latte Coffee is $" + q2*2;
        String price3 = "Amount for " + q3 + "Cups of Capucciuno Coffee is $" + q3*1;
        int tp = q1*3 + q2*2 + q3*1;
        int tn= q1 + q2 + q3;
        String tot = "Total Amount for total " + tn + "Cups of coffee is $"+ tp;
        displaym1(price1);
        displaym2(price2);
        displaym3(price3);
        displaym4(tot);
    }
    public void increment1(View view){
        q1 = q1 +1;
        displayid1(q1);
    }
    public void decrement1(View view){
        if (q1<1){
            q1 = 0;
            displayid1(q1);
        }
        else
        {
            q1 = q1 - 1;
            displayid1(q1);
        }
    }
    public void increment2(View view){
        q2 = q2 +1;
        displayid2(q2);
    }
    public void decrement2(View view){
        if (q2<1){
            q2 = 0;
            displayid2(q2);
        }
        else
        {
            q2 = q2 - 1;
            displayid2(q2);
        }
    }
    public void increment3(View view){
        q3 = q3 +1;
        displayid3(q3);
    }
    public void decrement3(View view){
        if (q3<1){
            q3 = 0;
            displayid3(q3);
        }
        else
        {
            q3 = q3 - 1;
            displayid3(q3);
        }
    }
    private void displayid1(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view1);
        quantityTextView.setText("" + num);
    }
    private void displayid2(int num){
        TextView quantityTextview = (TextView) findViewById(R.id.quantity_text_view2);
        quantityTextview.setText("" + num);
    }
    private void displayid3(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view3);
        quantityTextView.setText("" + num);
    }
    private void displaym1(String msg){
        TextView priceTextview = (TextView) findViewById(R.id.price_text_view1);
        priceTextview.setText(msg);
    }
    private void displaym2(String msg){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view2);
        priceTextView.setText(msg);
    }
    private void displaym3(String msg){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view3);
        priceTextView.setText(msg);
    }
    private void displaym4(String msg){
        TextView priceTextview = (TextView) findViewById(R.id.price_text_view4);
        priceTextview.setText(msg);
    }
}