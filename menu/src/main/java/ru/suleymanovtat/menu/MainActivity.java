package ru.suleymanovtat.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.app_name);
        menu.add(0, 2, 0, R.string.profile);
        menu.add(0, 3, 0, R.string.about);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Log.e("my", "click " + getString(R.string.app_name));
                break;
            case 2:
                Log.e("my", "click " + getString(R.string.profile));
                break;
            case 3:
                Log.e("my", "click " + getString(R.string.about));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}