package com.homework1;

import java.util.Iterator;

public class StringWords implements Iterator<StringWords> {

    private String word;
    private int pos = 0;

    public StringWords() {
        super();
    }

    public StringWords(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean hasNext() {
        return pos == word.length();
    }

    @Override
    public StringWords next() {
        return null;
    }

}
