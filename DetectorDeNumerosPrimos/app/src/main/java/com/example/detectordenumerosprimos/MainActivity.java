package com.example.detectordenumerosprimos;

import static operations.Operations.isPrime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button myButton = null;
    private TextView myTextView = null;
    private EditText myEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView);
        myEditText = findViewById(R.id.editTextText2);

        myButton.setOnClickListener(this);
    }

    public void onClick(View v) {

        String textoB = myButton.getText().toString();

        if (textoB.equals(getString(R.string.text_comprobar))) {
            comprobar();
        } else {
            reboot();

        }
    }

    private void comprobar() {

        try {
            int numero = Integer.parseInt(myEditText.getText().toString());
            if (isPrime(numero)) {
                myTextView.setText(R.string.text_es);
            } else {
                myTextView.setText(R.string.text_noEs);
            }
        } finally {
            myButton.setText(R.string.text_reiniciar);
        }
    }

    public void reboot() {

        myEditText.setText("");
        myTextView.setText(R.string.text_introducir);
        myButton.setText(R.string.text_comprobar);

    }


}