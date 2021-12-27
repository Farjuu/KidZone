package dev.farjana.kidzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Lessons extends AppCompatActivity {
    Intent gobackIntent;
    TextView topicsName,pageTitle;
    ImageView goBackImage;
    RecyclerView topicsAllHorizonRecycler, lessonsVerticalRecycler;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

     /*   requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/
        initializeAll();
        goBack();
    }

    private void initializeAll() {
        topicsName = findViewById(R.id.topics);
        pageTitle = findViewById(R.id.lessonPageTitle);
        goBackImage = findViewById(R.id.goback_Image_Lesson_Layout);
        topicsAllHorizonRecycler = findViewById(R.id.Topic_horizontal_recyclerView);
        lessonsVerticalRecycler = findViewById(R.id.lesson_vertical_recyclerview);
    }

    private void goBack() {
        goBackImage.setOnClickListener(View ->{
            gobackIntent = new Intent(Lessons.this, DashBoardActivity.class);
            startActivity(gobackIntent);
            finish();

        });
    }
}