package dev.farjana.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Badges extends AppCompatActivity {

    ImageView userImageFromGmail,badgeImage;
    TextView  userName, earned_badges_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);

       /* requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/
        initializeAll();

    }

    private void initializeAll() {
        userImageFromGmail = findViewById(R.id.emailImage);
        badgeImage = findViewById(R.id.badgeImage);
        userName = findViewById(R.id.userName);
        earned_badges_text = findViewById(R.id.earned_badges_text);

    }
}