package com.example.chaitanya.menuexample;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        switch (id) {
            case R.id.menu_bookmark:
                Toast toast = Toast.makeText(MainActivity.this, "Bookmark Selected", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                toast.show();
                return true;
            case R.id.menu_save:
                Toast toast1 = Toast.makeText(MainActivity.this, "Save Selected", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
                toast1.show();
                return true;
            case R.id.menu_search:
                Toast toast2 = Toast.makeText(MainActivity.this, "Search Selected", Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                toast2.show();
                return true;
            case R.id.menu_share:
                Toast toast3 = Toast.makeText(MainActivity.this, "Share selected", Toast.LENGTH_SHORT);
                toast3.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                toast3.show();
                return true;
            case R.id.menu_delete:
                Toast toast4 = Toast.makeText(MainActivity.this, "Delete Selected", Toast.LENGTH_SHORT);
                toast4.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.LEFT, 0, 0);
                toast4.show();
                return true;
            case R.id.menu_preferences:
                Toast toast5 = Toast.makeText(MainActivity.this, "Preferences Selected", Toast.LENGTH_SHORT);
                toast5.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.RIGHT, 0, 0);
                toast5.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
