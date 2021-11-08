package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video2 extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen2);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/cx3p8x.mp4?Expires=1636640940&Signature=BolwoeZMVQnIu68wzw1cPuGOYMVois184B-IFGsV~1NwERu3rvBcH3KkvYh7SYhFHhvqnmOMSvrYZDCulmPz2lhrqhwxPzoF5ErHt-tGhHLa38iimPBY06n1W~7Xhhpegl6odNMTUCOMATzyyW7rlDsvYwLqlWPrA6pmgyih4VL3QvY8lXVqhC8DYYnC6-ZZwoUdrG6d0IsIaKi458L5l~Awa8FtsXmjX-7zoSUB5RF6N1VXKAdpUHwbMFVHmhX7MlIDZ~jKpzA0xJEMS7IOuzpp4UPUVa2XoFEMIOlcWLlciqsnPGVSdYOXTYNZhopNBq8e~~iu9OWvDEzYC-viwg__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView.setVideoURI(video);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setPadding(0, 0, 0, 0);
        mediaController.setAnchorView(videoView);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}