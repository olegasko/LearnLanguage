package com.example.android.miwok;



public class Word {

    private String mEnglishWord;
    private String mTranslatedWord;
    private int mImageResourceId;
    private boolean mImageVisibility;

    public Word(String englishWord, String translatedWord) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mImageVisibility = false;
    }

    public Word(String englishWord, String translatedWord, int imageResourceId) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mImageResourceId = imageResourceId;
        this.mImageVisibility = true;
    }

    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getTranslatedWord() {
        return mTranslatedWord;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean getImageVisibility() {
        return  mImageVisibility;
    }
}
