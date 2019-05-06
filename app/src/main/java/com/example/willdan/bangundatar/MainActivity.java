package com.example.willdan.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText one, two;
    Button kali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        hasil = findViewById(R.id.hasil);

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one.getText().toString().isEmpty() || two.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "isi woy", Toast.LENGTH_SHORT).show();
                } else {
                    perkalian();
                }
            }
        });



    }


    void perkalian(){
        double angka1 = Double.parseDouble(one.getText().toString());
        double angka2 = Double.parseDouble(two.getText().toString());

        Double total = angka1 * angka2;

        hasil.setText((CharSequence) hasil);

    }
}
