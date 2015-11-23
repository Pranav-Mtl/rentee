package com.appslure.rentee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.efor18.rangeseekbar.RangeSeekBar;

public class SearchSeeker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_seeker);

        initialize();
    }

    private void initialize(){
        final TextView min = (TextView) findViewById(R.id.minValue);
        final TextView max = (TextView) findViewById(R.id.maxValue);
        // create RangeSeekBar as Integer range between 20 and 75
        RangeSeekBar<Integer> seekBar = new RangeSeekBar<Integer>(0,100000, this);
        seekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener<Integer>() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar<?> bar, Integer minValue, Integer maxValue) {
                // handle changed range values
                min.setText(minValue.toString());
                max.setText(maxValue.toString());

            }
        });

        // add RangeSeekBar to pre-defined layout
        ViewGroup layout = (ViewGroup) findViewById(R.id.layout);
        layout.addView(seekBar);

    }
}
