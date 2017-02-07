package edu.cofc.buildingblocks2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar bar = (ProgressBar) findViewById(R.id.progress_bar);
        bar.setProgress(75);

        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        supportRequestWindowFeature(Window.FEATURE_PROGRESS);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_progress);
    }


}
