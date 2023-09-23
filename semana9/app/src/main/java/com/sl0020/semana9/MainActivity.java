package com.sl0020.semana9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Aula Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());
        //após o searchView, vamos configurar o ActionProvider
        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        share.setShareIntent(configIntent());
        return true;
    }

    private Intent configIntent() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain"); //plain ou *
        i.putExtra(Intent.EXTRA_TEXT, "Texto para compartilhar");
        return i;
    }

    private SearchView.OnQueryTextListener onSearch() {
        return new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(), "Texto enviado: "+query, Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //aqui vai o comportamento dinamico enquanto o texto é digitado
                //quando cada caractere for digitado, este evento é disparado/ativado
                return false;
            }
        };
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.action_search){
            //acao do botao search
            Toast.makeText(getApplicationContext(), "Botao Search", Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.action_refresh){
            //acao do botao refresh
            Toast.makeText(getApplicationContext(), "Botao Refresh", Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.action_settings) {
            //acao do botao settings
            Toast.makeText(getApplicationContext(), "Botao Settings", Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==android.R.id.home){
            Toast.makeText(getApplicationContext(), "Botao Home", Toast.LENGTH_LONG).show();
        }
        return true;
    }
}