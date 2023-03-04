package com.example.aula001;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private EditText edit1;
    private Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //a partir daqui vem a lógica

        text1 = (TextView) findViewById(R.id.txtPhone);
        edit1 = findViewById(R.id.edtPhone);
        btn1 = findViewById(R.id.btnEnviar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edit1.getText().toString();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
        });

    }
}