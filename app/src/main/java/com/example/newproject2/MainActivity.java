package com.example.newproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click (View view){
        Snackbar snackbar = Snackbar.make(view, "THE WORLD", Snackbar.LENGTH_LONG);

        snackbar.setAction("NEXT...",new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Next clicked!",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        snackbar.show();
    }

}