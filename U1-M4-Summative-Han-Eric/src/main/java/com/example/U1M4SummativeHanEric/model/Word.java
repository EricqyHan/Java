package com.example.U1M4SummativeHanEric.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;

public class Word {
    private String word;
    private String definition;

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
