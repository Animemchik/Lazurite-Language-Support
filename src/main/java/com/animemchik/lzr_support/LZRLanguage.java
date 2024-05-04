package com.animemchik.lzr_support;

import com.intellij.lang.Language;

public class LZRLanguage extends Language {

    public static final LZRLanguage INSTANCE = new LZRLanguage();

    private LZRLanguage() {
        super("Lazurite");
    }
}
