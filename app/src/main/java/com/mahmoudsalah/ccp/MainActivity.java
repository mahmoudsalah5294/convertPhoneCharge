package com.mahmoudsalah.ccp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText MoneyBox;
    EditText ChargeBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MoneyBox = findViewById(R.id.MoneyBox);
        ChargeBox = findViewById(R.id.ChargeBox);

    }

    public void convert(View view) {
        if (ChargeBox.getText().toString().isEmpty()) {
            float amount = Float.parseFloat((MoneyBox.getText().toString()));
            ChargeBox.setText("" + amount * 0.7);
            return;
        } else if (MoneyBox.getText().toString().isEmpty()){
            float charge = Float.parseFloat(ChargeBox.getText().toString());
            MoneyBox.setText("" + charge / 0.7);
            return;

        }
    }

    public void clear(View view) {
        MoneyBox.setText("");
        ChargeBox.setText("");
    }
}

