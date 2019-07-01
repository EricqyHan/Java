package com.example.U1M4SummativeHanEric.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;

public class Answer {
    private String question;
    private String answer;

    public Answer() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
