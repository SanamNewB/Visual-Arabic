package com.sanamshikalgar.audiblearabic;
// Words is java class file
// is the word arraylist for both languages

public class Words {
    private String mEnglishTranslation;
    private String mArabicTranslation;
    private int mVoice;

    // @param NO_IMAGE_PROVIDED is a constant value set to -1 by me.

    private int mPicture = NO_IMAGE_PROVIDED; // setting image to start at no image state
    // final means this is a constant and cannot be changed
    // static means this variable is associated with a class and not object instance of the class
    private static final int NO_IMAGE_PROVIDED = -1; // -1 because out of range of all possible resource id's

    // For Phrases Activity without images. Changes in WordAdapter
    public Words(String englishTranslation, String arabicTranslation,int voice) {
        mEnglishTranslation = englishTranslation;
        mArabicTranslation = arabicTranslation;
        mVoice = voice;
    }

    // Create a new Words object.
    public Words(String englishTranslation, String arabicTranslation, int picture,int voice) {
        mEnglishTranslation = englishTranslation;
        mArabicTranslation = arabicTranslation;
        mPicture = picture;
        mVoice = voice;

    }

    public String getEnglish() {
        return mEnglishTranslation;
    }

    public String getArabic() {
        return mArabicTranslation;
    }

    public int getPicture() {
        return mPicture;
    }

// image visible vs image invisible
// if mPicture variable is not equal (!=) to -1, then THERE IS a valid image and the boolean hasImage() should return TRUE
// if mPicture variable is -1, then THERE IS NO valid image and hasImage should be FALSE

    public boolean hasImage() {
        return mPicture != NO_IMAGE_PROVIDED;
    }

    public int getVoice() {
        return mVoice;
    }
}