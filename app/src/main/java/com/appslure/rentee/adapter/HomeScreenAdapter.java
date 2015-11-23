package com.appslure.rentee.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appslure.rentee.R;

/**
 * Created by appslure on 23-11-2015.
 */
public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.PropertyListHolder>  {

    Context mContext;
    public HomeScreenAdapter(Context context){
        mContext=context;
    }

    @Override
    public PropertyListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(mContext).
                inflate(R.layout.home_screen_row_list, parent, false);

        return new PropertyListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PropertyListHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public static class PropertyListHolder extends RecyclerView.ViewHolder{



        public PropertyListHolder(View itemView) {
            super(itemView);


        }
    }
}
