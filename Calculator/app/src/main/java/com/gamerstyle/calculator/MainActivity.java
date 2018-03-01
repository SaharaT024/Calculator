package com.gamerstyle.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button add,substract,multiply,divide,Bequal,B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,BDot;

    private double num1,num2;
    boolean plus,minus,multi,div;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button)findViewById(R.id.B1);
        B2 = (Button)findViewById(R.id.B2);
        B3 = (Button)findViewById(R.id.B3);
        B4 = (Button)findViewById(R.id.B4);
        B5 = (Button)findViewById(R.id.B5);
        B6 = (Button)findViewById(R.id.B6);
        B7 = (Button)findViewById(R.id.B7);
        B8 = (Button)findViewById(R.id.B8);
        B9 = (Button)findViewById(R.id.B9);
        B0 = (Button)findViewById(R.id.B0);
        BDot    = (Button)findViewById(R.id.BDot);
        Bequal  = (Button)findViewById(R.id.Bequal);
        add          = (Button)findViewById(R.id.add);
        substract    = (Button)findViewById(R.id.substract);
        multiply     = (Button)findViewById(R.id.multiply);
        divide       = (Button)findViewById(R.id.divide);

        result = (TextView)findViewById(R.id.result);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        BDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });

        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num1 = Double.parseDouble(result.getText()+" ");
               plus = true;
               result.setText(null);
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(result.getText()+" ");
                minus = true;
                result.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(result.getText()+" ");
                multi = true;
                result.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(result.getText()+" ");
                div = true;
                result.setText(null);
            }
        });

        Bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(result.getText()+" ");
                if(plus = true)
                {
                    result.setText(num1+num2+" ");
                    plus = false;
                }
                else if(minus = true)
                {
                    result.setText(num1-num2+" ");
                    minus = false;
                }
                else if(multi = true)
                {
                    result.setText(num1*num2+" ");
                    multi = false;
                }
                else if(div = true)
                {
                    result.setText(num1/num2+" ");
                    div = false;
                }
            }
        });

    }
}
