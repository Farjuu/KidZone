package dev.farjana.kidzone.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.farjana.kidzone.DashBoardActivity;
import dev.farjana.kidzone.R;
import dev.farjana.kidzone.SelectStarBadgeGrid;
import dev.farjana.kidzone.model.DashBoardRecyclerModel;

public class CollectStarBadgeRecyclerAdapter extends RecyclerView.Adapter<CollectStarBadgeRecyclerAdapter.ViewHolder> {
    List<DashBoardRecyclerModel> collectStarBadgeRecyclerItemList;
    Context context;


    public CollectStarBadgeRecyclerAdapter(List<DashBoardRecyclerModel> collectStarBadgeRecyclerItemList, Context context) {
        this.context = context;
        this.collectStarBadgeRecyclerItemList = collectStarBadgeRecyclerItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.collect_star_recycler, parent, false);

        final ViewHolder holder = new ViewHolder(v);
        holder.getStarEarnBadgeButton.setOnClickListener(View ->{
            int position = holder.getAdapterPosition();
            Intent senderIntent = new Intent(parent.getContext(), SelectStarBadgeGrid.class);
            senderIntent.putExtra("buttontext",collectStarBadgeRecyclerItemList.get(position).getButtonText());
            parent.getContext().startActivity(senderIntent);
        });
       /* v.setOnClickListener(view1 -> {
            int position = holder.getAdapterPosition();
           // Intent intent = new Intent(parent.getContext(), WebActivity.class);
          //  intent.putExtra("url", collectStarBadgeRecyclerItemList.get(position).getSiteURl());
         //   parent.getContext().startActivity(intent);

        });*/
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DashBoardRecyclerModel item = collectStarBadgeRecyclerItemList.get(position);
        holder.starBadgeImageView.setImageResource(item.getImageId());
        holder.TitleGrid.setText(item.getTitleGrid());
        holder.UserScore.setText("0");
        holder.getStarEarnBadgeButton.setText(item.getButtonText());

    }

    @Override
    public int getItemCount() {
        return collectStarBadgeRecyclerItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView starBadgeImageView;
        TextView TitleGrid, UserScore;
        Button getStarEarnBadgeButton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            starBadgeImageView = itemView.findViewById(R.id.starBadgeImageView);
            TitleGrid = itemView.findViewById(R.id.titleGrid);
            UserScore = itemView. findViewById(R.id.userScore);
            getStarEarnBadgeButton = itemView.findViewById(R.id.getStarEarnBadgeBtn);
        }
    }
}
