package com.company;

import java.util.ArrayList;

public class WordList {

    public static void main(String[] args) {

        String[] wordList = {"byte", "case", "catch", "class", "const", "continue", "do", "double", "else", "extends"};
        ArrayList<String> newWordList = new ArrayList<>();

        for(String element : wordList) {
            //System.out.println(element);
            newWordList.add(element);
        }

        System.out.println(newWordList);

    }

}