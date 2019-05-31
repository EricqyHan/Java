package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a word and we will tell you if it is a Java Keyword");
        String keyword = myScanner.nextLine();

        switch(keyword) {
            case "abstract":
            case "assert":
            case "boolean":
            case "break":
            case "case":
            case "catch":
            case "char":
            case "class":
            case "continue":
            case "default":
            case "do":
            case "double":
            case "else":
            case "enum":
            case "exports":
            case "extends":
            case "final":
            case "finally":
            case "float":
            case "for":
            case "if":
            case "implements":
            case "import":
            case "instanceof":
            case "int":
            case "interface":
            case "long":
            case "module":
            case "native":
            case "new":
            case "package":
            case "private":
            case "protected":
            case "public":
            case "requires":
            case "return":
            case "short":
            case "static":
            case "strictfp":
            case "super":
            case "switch":
            case "synchronized":
            case "this":
            case "throw":
            case "throws":
            case "transient":
            case "try":
            case "void":
            case "volatile":
            case "while":
                System.out.println("Is a Java keyword");
                break;

            default:
                System.out.println("not a Java keyword");
                break;
        }
    }
}
