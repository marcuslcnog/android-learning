package com.example.imcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editWeight;
    private EditText editHeight;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editWeight = findViewById(R.id.editWeight);
        editHeight = findViewById(R.id.editHeight);
        textResult = findViewById(R.id.textResult);
    }

    public void calculateImc(View view) {
        double weight = Double.parseDouble(editWeight.getText().toString());
        double height = Double.parseDouble(editHeight.getText().toString());

        double result = (weight) / (height * height);

        if (result < 18.5) {
            textResult.setText("Peso Baixo, IMC = " + result);
        } else if (result >= 18.5 && result < 25) {
            textResult.setText("Peso Normal, IMC = " + result);
        } else if (result >= 25 && result < 30) {
            textResult.setText("Sobrepeso, IMC = " + result);
        } else if (result >= 30 && result < 35) {
            textResult.setText("Obesidade (Grau I), IMC = " + result);
        } else if (result >= 35 && result < 40) {
            textResult.setText("Obesidade Severa (Grau II), IMC = " + result);
        } else {
            textResult.setText("Obesidade Mórbita (Grau III), IMC = " + result);
        }
    }
}
