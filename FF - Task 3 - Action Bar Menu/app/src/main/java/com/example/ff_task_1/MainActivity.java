package com.example.ff_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;




public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Test", "Create activity");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        switch(item.getItemId()) {

            case R.id.m0:
                Toast.makeText(this, "You have chosen Baku Engineering University", Toast.LENGTH_LONG).show();
           return true;
            case R.id.m1:
                Toast.makeText(this, "You have chosen Facebook", Toast.LENGTH_LONG).show();
                return true;
                case R.id.m2:
               Toast.makeText(this, "You have chosen Twitter", Toast.LENGTH_LONG).show();
                    return true;

            case R.id.m3:
               Toast.makeText(this, "You have chosen Youtube", Toast.LENGTH_LONG).show();
                return true;

            case R.id.m4:
                Toast.makeText(this, "You have chosen Linkedin", Toast.LENGTH_LONG).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Test", "Start activity");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Test", "Resume activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Test", "Pause activity");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Test", "Stop activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Test", "Destroy activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Test", "ReStart activity");
    }
}
