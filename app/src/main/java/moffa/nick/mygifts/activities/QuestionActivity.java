package moffa.nick.mygifts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import moffa.nick.mygifts.R;
import moffa.nick.mygifts.data.StoredAnswers;
import moffa.nick.mygifts.tools.CustomListAdapter;

public class QuestionActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_GENDER = "extra.item.gender";
    public static final String EXTRA_ITEM_AGE = "extra.item.age";
    public static final String EXTRA_ITEM_RELATIVITY = "extra.item.relativity";
    public static final String EXTRA_ITEM_OCCASION = "extra.item.occasion";

    ListView mGenderAnswerListView;
    ListView mAgeAnswersListView;
    ListView mRelativityAnswersListView;
    ListView mOccasionAnswersListView;

    TextView mQuestionTextView;

    public static String selectedGender;
    public static String selectedAge;
    public static String selectedRelativity;
    public static String selectedOccasion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mGenderAnswerListView = (ListView)findViewById(R.id.lv_gender_answers);
        mAgeAnswersListView = (ListView)findViewById(R.id.lv_age_answers);
        mRelativityAnswersListView = (ListView)findViewById(R.id.lv_relativity_answers);
        mOccasionAnswersListView = (ListView)findViewById(R.id.lv_occasion_answers);
        mQuestionTextView = (TextView)findViewById(R.id.tv_question);

        mGenderAnswerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedGender = parent.getItemAtPosition(position).toString();
                showAgeView();
            }
        });
        mAgeAnswersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedAge = parent.getItemAtPosition(position).toString();
                showRelativityView();
            }
        });
        mRelativityAnswersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedRelativity = parent.getItemAtPosition(position).toString();
                showOccasionView();
            }
        });
        mOccasionAnswersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedOccasion = parent.getItemAtPosition(position).toString();
                startIntent();
            }
        });

        mQuestionTextView.setText("What is your gift recipient's gender?");
        mGenderAnswerListView.setAdapter(new CustomListAdapter(this, android.R.layout.simple_list_item_1, StoredAnswers.getGenderQuestion()));
        mAgeAnswersListView.setAdapter(new CustomListAdapter(this, android.R.layout.simple_list_item_1, StoredAnswers.getAgeQuestion()));
        mRelativityAnswersListView.setAdapter(new CustomListAdapter(this, android.R.layout.simple_list_item_1, StoredAnswers.getRelativityQuestion()));
        mOccasionAnswersListView.setAdapter(new CustomListAdapter(this, android.R.layout.simple_list_item_1, StoredAnswers.getOccasionQuestion()));
    }
    private void showAgeView(){
        mGenderAnswerListView.setVisibility(View.INVISIBLE);
        mAgeAnswersListView.setVisibility(View.VISIBLE);
        mQuestionTextView.setText("What is your gift recipient's age?");
    }
    private void showRelativityView(){
        mAgeAnswersListView.setVisibility(View.INVISIBLE);
        mRelativityAnswersListView.setVisibility(View.VISIBLE);
        mQuestionTextView.setText("What is your goft recipient's relativity to you?");
    }
    private void showOccasionView(){
        mRelativityAnswersListView.setVisibility(View.INVISIBLE);
        mOccasionAnswersListView.setVisibility(View.VISIBLE);
        mQuestionTextView.setText("What is your gift recipient's occasion?");
    }
    private void startIntent(){
        Intent intent = new Intent(this, DisplayAnswersActivity.class);
        intent.putExtra(QuestionActivity.EXTRA_ITEM_GENDER, selectedGender);
        intent.putExtra(QuestionActivity.EXTRA_ITEM_AGE, selectedAge);
        intent.putExtra(QuestionActivity.EXTRA_ITEM_RELATIVITY, selectedRelativity);
        intent.putExtra(QuestionActivity.EXTRA_ITEM_OCCASION, selectedOccasion);
        startActivity(intent);
    }
}
