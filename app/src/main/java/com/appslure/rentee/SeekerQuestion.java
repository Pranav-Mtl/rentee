package com.appslure.rentee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.efor18.rangeseekbar.RangeSeekBar;

public class SeekerQuestion extends AppCompatActivity {

    Spinner spnInterest,spnGender,spnFlatmates,spnOccupation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_question);
        initialize();
    }

    private void initialize(){
        spnInterest= (Spinner) findViewById(R.id.spinner_interest);
        spnFlatmates= (Spinner) findViewById(R.id.spinner_flatmates);
        spnGender= (Spinner) findViewById(R.id.spinner_gender);
        spnOccupation= (Spinner) findViewById(R.id.spinner_occupation);

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


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGender.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapterInterest = ArrayAdapter.createFromResource(this, R.array.interested, android.R.layout.simple_spinner_item);
        adapterInterest.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnInterest.setAdapter(adapterInterest);

        ArrayAdapter<CharSequence> adapterFlatmates = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapterFlatmates.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnFlatmates.setAdapter(adapterFlatmates);

        ArrayAdapter<CharSequence> adapterOccupation = ArrayAdapter.createFromResource(this, R.array.occupation, android.R.layout.simple_spinner_item);
        adapterOccupation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnOccupation.setAdapter(adapterOccupation);
    }
}
