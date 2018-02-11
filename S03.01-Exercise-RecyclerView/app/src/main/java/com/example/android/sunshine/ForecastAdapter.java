package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jasonbrown on 2/11/18.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    private String[] mWeatherData;
    // Within forecast_list_item.xml //////////////////////////////////////////////////////////////

    // Complete (24) Override onCreateViewHolder
    // Complete (25) Within onCreateViewHolder, inflate the list item xml into a view
    // Complete (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // complete (27) Override onBindViewHolder
    // complete (28) Set the text of the TextView to the weather for this list item's position

    // complete (29) Override getItemCount
    // complete (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // complete (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // complete (32) After you save mWeatherData, call notifyDataSetChanged
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////

    public ForecastAdapter() {


    }

    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forcast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weather = mWeatherData[position];
        holder.mWeatherTextView.setText(weather);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null)
            return 0;
        else
            return mWeatherData.length;
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);

        }
        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
        // Complete (18) Create a public final TextView variable called mWeatherTextView

        // Complete (19) Create a constructor for this class that accepts a View as a parameter
        // Complete (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // Complete (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
    }

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // Complete (15) Add a class file called ForecastAdapter
    // Complete (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // Complete (23) Create a private string array called mWeatherData

    // Complete (47) Create the default constructor (we will pass in parameters in a later lesson)

    // Complete (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // Complete (17) Extend RecyclerView.ViewHolder


}
