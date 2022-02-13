package com.asoodaowar.ezTemplate.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asoodaowar.ezTemplate.R;
import com.asoodaowar.ezTemplate.activities.SignInUpEightActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpEighteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpEleventhActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpFifteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpFifthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpFirstActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpFourteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpFourthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpNineteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpNinthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpSecondActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpSeventeenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpSeventhActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpSixteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpSixthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpTenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpThirdActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpThirteenthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpTwelfthActivity;
import com.asoodaowar.ezTemplate.activities.SignInUpTwentiethActivity;
import com.asoodaowar.ezTemplate.models.Title;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.TitleViewHolder> {

    Context context;
    List<Title> titleList;

    public RecyclerViewAdapter(Context context, List<Title> titleList) {
        this.context = context;
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_main,parent,false);
        return new TitleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, int position) {

        Title title = titleList.get(position);

        holder.tv_title.setText(title.title);
    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    class TitleViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_title;

        TitleViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.textView_title);

            /*On Item Click*/
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (getAdapterPosition() == 0) {
                        Intent intent = new Intent(context, SignInUpFirstActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 1) {
                        Intent intent = new Intent(context, SignInUpSecondActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 2) {
                        Intent intent = new Intent(context, SignInUpThirdActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 3) {
                        Intent intent = new Intent(context, SignInUpFourthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 4) {
                        Intent intent = new Intent(context, SignInUpFifthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 5) {
                        Intent intent = new Intent(context, SignInUpSixthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 6) {
                        Intent intent = new Intent(context, SignInUpSeventhActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 7) {
                        Intent intent = new Intent(context, SignInUpEightActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 8) {
                        Intent intent = new Intent(context, SignInUpNinthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 9) {
                        Intent intent = new Intent(context, SignInUpTenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 10) {
                        Intent intent = new Intent(context, SignInUpEleventhActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 11) {
                        Intent intent = new Intent(context, SignInUpTwelfthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 12) {
                        Intent intent = new Intent(context, SignInUpThirteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 13) {
                        Intent intent = new Intent(context, SignInUpFourteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 14) {
                        Intent intent = new Intent(context, SignInUpFifteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 15) {
                        Intent intent = new Intent(context, SignInUpSixteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 16) {
                        Intent intent = new Intent(context, SignInUpSeventeenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 17) {
                        Intent intent = new Intent(context, SignInUpEighteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 18) {
                        Intent intent = new Intent(context, SignInUpNineteenthActivity.class);
                        context.startActivity(intent);
                    }
                    if (getAdapterPosition() == 19) {
                        Intent intent = new Intent(context, SignInUpTwentiethActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

}
