package com.example.hellotoast;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSnackbar ;
    TextView tview;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tview = findViewById(R.id.tview);
        btnSnackbar = findViewById(R.id.btnsnackbar);
        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "adding", Snackbar.LENGTH_LONG).show();

                counter++;
                tview.setText(""+counter);
            }
        });


    }
}
