package com.example.android.miwok;



public class Word {

    private String mEnglishWord;
    private String mTranslatedWord;

    public Word(String englishWord, String translatedWord) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
    }

    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getTranslatedWord() {
        return mTranslatedWord;
    }
}
