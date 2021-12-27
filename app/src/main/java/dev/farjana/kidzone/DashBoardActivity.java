package dev.farjana.kidzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dev.farjana.kidzone.adapter.CollectStarBadgeRecyclerAdapter;
import dev.farjana.kidzone.model.DashBoardRecyclerModel;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView collectStarBadgeRecycler;
    Intent ReceiverIntent, senderIntent;
    String receiveData;
    TextView takeLessonQuote,greetingText,getIntoClassText;
    ImageView bookImageView;
    ProgressBar studentProgressCount;

    List<DashBoardRecyclerModel> collectStarBadgeRecyclerItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        fetchIntentData();
        initializeAll();
        createGreetingText();
        addList();
        loadRecycler();
        click();
    }

    private void addList() {
        collectStarBadgeRecyclerItemList = new ArrayList<>();
        collectStarBadgeRecyclerItemList.add(new DashBoardRecyclerModel("Collect Stars",3,"Get Stars",R.drawable.ic_baseline_star_24_null));
    }

    private void loadRecycler() {
        collectStarBadgeRecycler = findViewById(R.id.collect_star_badge);
        CollectStarBadgeRecyclerAdapter recyclerAdapter = new CollectStarBadgeRecyclerAdapter(collectStarBadgeRecyclerItemList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1) ;
        collectStarBadgeRecycler.setLayoutManager(gridLayoutManager);
        collectStarBadgeRecycler.setAdapter(recyclerAdapter);

    }

    private void createGreetingText() {
        String text = "Welcome, "+ receiveData +" !!";
        greetingText.setText(text);
    }

    public void click() {
        bookImageView.setOnClickListener(view -> {
            senderIntent = new Intent(DashBoardActivity.this,Lessons.class);
            startActivity(senderIntent);
        });
    }

    private void initializeAll() {
        collectStarBadgeRecycler = findViewById(R.id.collect_star_badge);
        takeLessonQuote = findViewById(R.id.takeLessonQuote);
        greetingText =findViewById(R.id.greetingText);
        getIntoClassText = findViewById(R.id.getIntoClassText);
        bookImageView = findViewById(R.id.bookImage);
        studentProgressCount = findViewById(R.id.studentProgressCount);
    }

    private void fetchIntentData() {
        ReceiverIntent = getIntent();
        receiveData = ReceiverIntent.getStringExtra("UserName");
    }
}