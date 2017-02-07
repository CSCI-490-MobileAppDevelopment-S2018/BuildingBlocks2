package edu.cofc.buildingblocks2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Window;
import android.widget.Chronometer;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = (VideoView) findViewById(R.id.video_view);
        MediaController mc = new MediaController(this);
        Uri video = Uri.parse("http://andys-veggie-garden.appspot.com/vid/reveal.mp4");

        vv.setMediaController(mc);
        vv.setVideoURI(video);
    }


}
