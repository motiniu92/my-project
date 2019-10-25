package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBarId;
    private TextView textVeiwId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBarId = findViewById(R.id.ratingBarId);
        textVeiwId = findViewById(R.id.textViewId);
        textVeiwId.setText("Value : " +ratingBarId.getProgress());

        ratingBarId.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {

                textVeiwId.setText("Value : " + rating);
            }
        });
    }
}
