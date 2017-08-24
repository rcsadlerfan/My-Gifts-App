package moffa.nick.mygifts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import moffa.nick.mygifts.R;

public class DisplayAnswersActivity extends AppCompatActivity {

    String gender;
    String age;
    String relativity;
    String occasion;

    TextView mSelectedGenderTextView;
    TextView mSelectedAgeTextView;
    TextView mSelectedRelativityTextView;
    TextView mSelectedOccasionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_answers);

        mSelectedGenderTextView = (TextView)findViewById(R.id.tv_gender_selected);
        mSelectedAgeTextView = (TextView)findViewById(R.id.tv_age_selected);
        mSelectedRelativityTextView = (TextView)findViewById(R.id.tv_relativity_selected);
        mSelectedOccasionTextView = (TextView)findViewById(R.id.tv_occasion_selected);

        gender = getIntent().getStringExtra(QuestionActivity.EXTRA_ITEM_GENDER);
        age = getIntent().getStringExtra(QuestionActivity.EXTRA_ITEM_AGE);
        relativity = getIntent().getStringExtra(QuestionActivity.EXTRA_ITEM_RELATIVITY);
        occasion = getIntent().getStringExtra(QuestionActivity.EXTRA_ITEM_OCCASION);

        mSelectedGenderTextView.setText("Selected Gender: " + gender);
        mSelectedAgeTextView.setText("Selected Age: " + age);
        mSelectedRelativityTextView.setText("Selected Relativity: " + relativity);
        mSelectedOccasionTextView.setText("Selected Occasion: " + occasion);
    }
}
