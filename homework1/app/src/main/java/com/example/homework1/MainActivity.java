package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
        EditText qz = findViewById(R.id.quiz);
        EditText hw = findViewById(R.id.hw);
        EditText md = findViewById(R.id.md);
        EditText f = findViewById(R.id.finals);
        TextView result = findViewById(R.id.results);

        Button reset = findViewById(R.id.reset);
        Button calc = findViewById(R.id.calc);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qz.setText("");
                hw.setText("");
                md.setText("");
                f.setText("");
                result.setTextColor(Color.parseColor("#FF4A87"));
                result.setText("Result");
                Toast.makeText(MainActivity.this, "Rest the Fields", Toast.LENGTH_SHORT).show();
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // quiz to double
                String x = qz.getText().toString();
                double quiz = Double.parseDouble(x);

                // homework to double
                String y = hw.getText().toString();
                double hwm = Double.parseDouble(y);

                // mids to double
                String z = hw.getText().toString();
                double mids = Double.parseDouble(z);

                // finals to double
                String c = hw.getText().toString();
                double ff = Double.parseDouble(c);

                // sum
                double tot = quiz+ hwm + mids+ ff;

                // if condition
                if (tot <=100 && tot >=90){
                    result.setText("A");
                    result.setTextColor(Color.parseColor("#27C700"));
                }
                else if (tot <90 && tot >=80){
                    result.setText("B");
                    result.setTextColor(Color.parseColor("#AED30B"));
                }
                else if (tot <80 && tot >=70){
                    result.setText("C");
                    result.setTextColor(Color.parseColor("#998F00"));
                }
                else if (tot <70&& tot >=60){
                    result.setText("D");
                    result.setTextColor(Color.parseColor("#C77F00"));
                }
                else{
                    result.setText("F");
                    result.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });


    }
}