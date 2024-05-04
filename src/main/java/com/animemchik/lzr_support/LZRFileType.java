package com.animemchik.lzr_support;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class LZRFileType extends LanguageFileType {

    public static final LZRFileType INSTANCE = new LZRFileType();

    private LZRFileType() {
        super(LZRLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Lazurite File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Lazurite language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "lzr";
    }

    @Override
    public Icon getIcon() {
        return LZRIcons.FILE;
    }

}