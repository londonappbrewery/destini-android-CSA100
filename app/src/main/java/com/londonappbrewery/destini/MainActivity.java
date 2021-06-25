package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Story[] mStoryBank = new Story[] {
        new Story(1, R.string.T1_Story, R.string.T1_Ans1, 3, R.string.T1_Ans2, 2),
        new Story(2, R.string.T2_Story, R.string.T2_Ans1, 3, R.string.T2_Ans2, 4),
        new Story(3, R.string.T3_Story, R.string.T3_Ans1, 6, R.string.T3_Ans2, 5),
        new Story(4, R.string.T4_End, -1, -1, -1, -1),
        new Story(5, R.string.T5_End, -1, -1, -1, -1),
        new Story(6, R.string.T6_End, -1, -1, -1, -1),
    };

    int mCurrentStoryIndex;
    TextView mStoryTextView;
    Button mAnswerOneButton;
    Button mAnswerTwoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mAnswerOneButton = findViewById(R.id.buttonTop);
        mAnswerTwoButton = findViewById(R.id.buttonBottom);

        if (savedInstanceState != null) {
            mCurrentStoryIndex = savedInstanceState.getInt("storyNumber", 0);
        }

        updateView();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(1);
                updateView();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(2);
                updateView();
            }
        });

    }

    public void updateStory(int userSelection) {
        if (userSelection == 1) {
            mCurrentStoryIndex = mStoryBank[mCurrentStoryIndex].getAnswerOneResultNumber() - 1;
        } else {
            mCurrentStoryIndex = mStoryBank[mCurrentStoryIndex].getAnswerTwoResultNumber() - 1;
        }
    }

    public void updateView() {
        mStoryTextView.setText(mStoryBank[mCurrentStoryIndex].getStoryID());
        if (mStoryBank[mCurrentStoryIndex].getAnswerOneID() != -1) {
            mAnswerOneButton.setText(mStoryBank[mCurrentStoryIndex].getAnswerOneID());
            mAnswerTwoButton.setText(mStoryBank[mCurrentStoryIndex].getAnswerTwoID());
        } else {
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("storyNumber", mCurrentStoryIndex);
    }
}
