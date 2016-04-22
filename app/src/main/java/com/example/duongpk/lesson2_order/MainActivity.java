package com.example.duongpk.lesson2_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Date;

public class MainActivity extends AppCompatActivity {

    int quantity=2;
    int price=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayQuantity(quantity);
        displayPrice("$" + quantity*price);

        Button btnTru;
        btnTru=(Button)findViewById(R.id.btnTru);
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vw) {
                decreaseQuantity();
            }
        });

        Button btnCong;
        btnCong=(Button)findViewById(R.id.btnCong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vw) {
                increaseQuantity();
            }
        });

        Button btnOrder;
        btnOrder=(Button)findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vw) {
                int price = quantity * 5;
                displayPrice("$" + price);
            }
        });
    }

    /**
     * This method used for button "-" Decrease
     */
    private void decreaseQuantity(){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method used for button "+" Increase
     */
    private void increaseQuantity(){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called to when click button "-" or "+"
     * @param num: number want to display
     */
    private void displayQuantity(int num){
        TextView QuantityTextView = (TextView) findViewById(R.id.txtSoLuong);
        QuantityTextView.setText("" + num);
    }

    /**
     * This method is called to click on button Order
     * @param message: the price
     */
    private void displayPrice(String message){
        TextView PriceTextView = (TextView) findViewById(R.id.txtGia);
        PriceTextView.setText("" + message);
    }

}
