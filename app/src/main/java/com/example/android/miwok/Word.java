package com.example.android.miwok;

/**
 * Created by exalogic on 20/3/18.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get miwok translation of the word
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
