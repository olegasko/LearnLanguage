package com.example.android.miwok;



public class Word {

    private String mEnglishWord;
    private String mTranslatedWord;
    private int mImageResourceId;
    private int mAudioResourceId;
    private boolean mImageVisibility;

    public Word(String englishWord, String translatedWord, int audioResourceId) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mAudioResourceId = audioResourceId;
        this.mImageVisibility = false;
    }

    public Word(String englishWord, String translatedWord, int imageResourceId, int audioResourceId) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
