package com.londonappbrewery.destini;

public class Story {

    private int mStoryNumber;
    private int mStoryID;
    private int mAnswerOneID;
    private int mAnswerOneResultNumber;
    private int mAnswerTwoID;
    private int mAnswerTwoResultNumber;

    public Story(int storyNumber, int storyID, int answerOneID, int answerOneResultNumber, int answerTwoID, int answerTwoResultNumber) {
        mStoryNumber = storyNumber;
        mStoryID = storyID;
        mAnswerOneID = answerOneID;
        mAnswerOneResultNumber = answerOneResultNumber;
        mAnswerTwoID = answerTwoID;
        mAnswerTwoResultNumber = answerTwoResultNumber;
    }

    public int getStoryNumber() {
        return mStoryNumber;
    }

    public void setStoryNumber(int storyNumber) {
        mStoryNumber = storyNumber;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswerOneID() {
        return mAnswerOneID;
    }

    public void setAnswerOneID(int answerOneID) {
        mAnswerOneID = answerOneID;
    }

    public int getAnswerOneResultNumber() {
        return mAnswerOneResultNumber;
    }

    public void setAnswerOneResultNumber(int answerOneResultNumber) {
        mAnswerOneResultNumber = answerOneResultNumber;
    }

    public int getAnswerTwoID() {
        return mAnswerTwoID;
    }

    public void setAnswerTwoID(int answerTwoID) {
        mAnswerTwoID = answerTwoID;
    }

    public int getAnswerTwoResultNumber() {
        return mAnswerTwoResultNumber;
    }

    public void setAnswerTwoResultNumber(int answerTwoResultNumber) {
        mAnswerTwoResultNumber = answerTwoResultNumber;
    }

}
