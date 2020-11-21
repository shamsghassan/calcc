package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txvRes = findViewById(R.id.txvRes);
        final EditText etnum1 = findViewById(R.id.etnum1);
        final EditText etnum2 = findViewById(R.id.etnum2);
        Button btnsub = findViewById(R.id.btnsub);
        Button btnsum = findViewById(R.id.btnsum);
        Button btndivi = findViewById(R.id.btndivi);
        Button btnmulti = findViewById(R.id.btnmulti);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(etnum1.getText().toString());
                int Number2=Integer.parseInt(etnum2.getText().toString());
                int result=Number1- Number2;
                txvRes.setText(String.valueOf(result));
            }
        });   btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(etnum1.getText().toString());
                int Number2=Integer.parseInt(etnum2.getText().toString());
                int result=Number1+ Number2;
                txvRes.setText(String.valueOf(result));
            }
        });
        try {
            btndivi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int Number1=Integer.parseInt(etnum1.getText().toString());
                    int Number2=Integer.parseInt(etnum2.getText().toString());
                    int result=Number1/ Number2;
                    txvRes.setText(String.valueOf(result));
                }
            });
        } catch (Exception Error)
        {
            Toast.makeText(MainActivity.this,"Divide By Zero" ,Toast.LENGTH_SHORT).show();
        }


        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(etnum1.getText().toString());
                int Number2=Integer.parseInt(etnum2.getText().toString());
                int result=Number1* Number2;
                txvRes.setText(String.valueOf(result));
            }
        });

    }
}