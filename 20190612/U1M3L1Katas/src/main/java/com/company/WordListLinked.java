package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class WordListLinked {
    public static void main(String[] args) {

        String[] wordList = {"byte", "case", "catch", "class", "const", "continue", "do", "double", "else", "extends"};
        LinkedList<String> newWordList = new LinkedList<>();

        for(String element : wordList) {
            //System.out.println(element);
            newWordList.add(element);
        }

        System.out.println(newWordList);

    }

}
