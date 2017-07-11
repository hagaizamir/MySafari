package hagai.edu.mysafari;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Hagai Zamir on 11-Jul-17.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<AnimalItem> data;

    public AnimalAdapter( Context context, List<AnimalItem> data) {
        this.inflater = inflater;
        this.context = context;
        this.data = data;

    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.amimal_item, parent, false);
        return new AnimalViewHolder(v);
    }





    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        AnimalItem animal = data.get(position);
        holder.tvType.setText(animal.getType());
        holder.tvTitle.setText(animal.getTitle());
        holder.ivThumbnail.setImageResource(animal.getThumbnailResId());


    }


    @Override
    public int getItemCount() {
        return data.size();
    }
    public class AnimalViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        TextView tvType;
        ImageView ivThumbnail;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            tvType = (TextView) itemView.findViewById(R.id.tvType);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);


        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int position =  getAdapterPosition();
                AnimalItem animal =  data.get(position);
                Toast.makeText(context, animal.getTitle() , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Activity.class);

                intent.putExtra("animal", animal);

                context.startActivity(intent);
            }
        });

        }
    }


}
