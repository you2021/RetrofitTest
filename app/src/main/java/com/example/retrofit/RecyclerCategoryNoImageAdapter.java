package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCategoryNoImageAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<RecyclerCategoryNoImageItem> items;

    public RecyclerCategoryNoImageAdapter(Context context, ArrayList<RecyclerCategoryNoImageItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_category_no_item, parent, false);
        VH vh = new VH(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh = (VH)holder;
        RecyclerCategoryNoImageItem item = items.get(position);

        vh.productNm.setText(item.productNm);
        vh.makr.setText(item.makr);
        vh.recallPublictBgnde.setText(item.recallPublictBgnde);
        vh.lookNum.setText(Integer.toString(item.lookNum));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder {

        TextView productNm, makr, recallPublictBgnde, lookNum;

        public VH(@NonNull View itemView) {
            super(itemView);

            productNm = itemView.findViewById(R.id.productNm);
            makr = itemView.findViewById(R.id.makr);
            recallPublictBgnde = itemView.findViewById(R.id.recallPublictBgnde);
            lookNum = itemView.findViewById(R.id.lookNum);
        }


    }
}
