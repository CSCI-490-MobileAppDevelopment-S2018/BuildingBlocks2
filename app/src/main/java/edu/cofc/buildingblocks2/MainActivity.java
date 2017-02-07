package edu.cofc.buildingblocks2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Window;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Chronometer timer = (Chronometer) findViewById(R.id.chronometer);
        long base = timer.getBase();
        Log.d("DebugTag", "base = " + base);
        timer.setBase(90978530);
        timer.start();
    }


}
