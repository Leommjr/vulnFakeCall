package com.vulnerable.fakecall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String NUMERO_PADRAO = "(34)984442025";

    public void ligar(View view) {
        EditText numero = (EditText) findViewById(R.id.inputNumber);
        Log.e("aaaaaaaaa", String.valueOf(numero));
    }
}