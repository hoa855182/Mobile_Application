package android.newapi.ButtonComment;

import androidx.appcompat.app.AppCompatActivity;

import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;

public class ButtonCommentFragmentWatch4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_comment_fragment_watch4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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