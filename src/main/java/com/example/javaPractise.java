package com.example;

import org.omg.Messaging.SyncScopeHelper;

public class javaPractise {

    public static void main(String args[]) {

        System.out.println("Hi siddu");

        String str1 = "deeksha prasanna";
        char[] string1 = str1.toCharArray();
        int str1ln = str1.length();
        System.out.println(str1ln);

        String revstr = "";

        for (int i = str1ln - 1; i >= 0; i--) {
            revstr = revstr + str1.charAt(i);
        }
        System.out.println(revstr);

        String newstring = "";

        for (char string : string1) {
            System.out.println(string);

        }

        System.out.println(newstring);
        int a = 0;
        while (a <= 20) {
            System.out.println(a = a + 2);
        }

    };

};
