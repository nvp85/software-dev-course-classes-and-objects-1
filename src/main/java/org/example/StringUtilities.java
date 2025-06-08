package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    static boolean shortString(String str) {
        return str.length() < 5;
    }
    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    static char firstLetter(String str) {
        return str.charAt(0);
    }
    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    static String censorAsparagus(String str) {
        return str.replace("asparagus", "****");
    }
    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    static String bigger(String str1, String str2) {
        return str1.length() >= str2.length() ? str1 : str2;
    }
}
