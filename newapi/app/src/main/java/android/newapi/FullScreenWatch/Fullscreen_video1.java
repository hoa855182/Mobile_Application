package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video1 extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen1);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/tu840h.mp4?Expires=1636640880&Signature=Ig1KELAetrGZfZYtAfEU1mTXZiN6LHG4c6cacF0gTSS0ppqxbA79UR~3maW~bPD~3jKGs0a9yHjQ7KCbGyUY4yTO9GqeerrdTpihTXBCxiehKS9XNG~9s66lORfYCz3-0jlXxIuwCFfqpGJVRM6QIm3hZwrTQELcn8LibqsYT0~UKESyQJHQ1VCl33xQsEffaZHuqkEUlIMKyaOHSDE1IsoCRe3TdQQNoMU3xe9RvXyjHfvVDretcFrWG-L9KKVYs7qvVqsdOfMd0HcGzDcDh8MStvqtT54pRqx6TMC-jwFvnFGnC8UDAhLUjUZjpDw82qNnLHkPT6Stgu0Ptn6~PA__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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