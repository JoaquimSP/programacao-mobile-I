package com.example.projeto_aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends DebugActivity {
    private Button btn1;
    private EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // codigo para abrir nova activity
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                Bundle parametros = new Bundle();
                parametros.putString("nome", edit1.getText().toString());
                i.putExtras(parametros);
                startActivity(i);
            }
        });
    }
}