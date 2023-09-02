package com.example.projeto_aula3;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {

    private String tag = "CICLOVIDA";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag, getClass().getName()+"onCreate chamado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, getClass().getName()+".onStart chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, getClass().getName()+".onRestart chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, getClass().getName()+".onResume chamado.");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(tag, getClass().getName()+".onSaveInstanceState chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, getClass().getName()+".onStop chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, getClass().getName()+".onDestroy chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, getClass().getName()+".onPause chamado.");
    }
}
