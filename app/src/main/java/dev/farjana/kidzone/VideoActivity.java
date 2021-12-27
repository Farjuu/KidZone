package dev.farjana.kidzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoActivity extends AppCompatActivity {

    Intent goBackIntent;
    TextView rhymeTopics, rhymePageTitle;
    ImageView goBackImg;
    RecyclerView rhymeTopicHorizonRecycler, rhymesVideosVerticalRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
       /* requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/
        initializeAll();
        onClick();

    }

    private void onClick() {
        goBackImg.setOnClickListener(View ->{
            goBackIntent = new Intent( VideoActivity.this, DashBoardActivity.class);
            startActivity(goBackIntent);
            finish();
        });
    }

    private void initializeAll() {
        rhymeTopics = findViewById(R.id.topics_rhymes);
        rhymePageTitle = findViewById(R.id.rhymePageTitle);
        goBackImg = findViewById(R.id.goback_Img_VideoLayout);
        rhymeTopicHorizonRecycler = findViewById(R.id.Rhymes_Topic_horizontal_recyclerView);
        rhymesVideosVerticalRecycler = findViewById(R.id.Rhymes_videos_vertical_recyclerview);
    }
}