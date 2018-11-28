package com.vinod.ksi074.mdtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            Toast.makeText(this, "item " + item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.item2) {
            Toast.makeText(this, "item " + item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.item3) {
            Toast.makeText(this, "item " + item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.search) {
            Toast.makeText(this, "search " + item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.cart) {
            Toast.makeText(this, "cart " + item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
