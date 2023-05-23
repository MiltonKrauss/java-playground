package org.example;

public class LessBy10 {
    /* Create a boolean method called LessBy10 that takes in three integers, "a", “b”, and “c”.
Given three ints, a b c, return true if one of them is 10 or more different than one of the others.
lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true */
    public static boolean lessBy10 (int a, int b, int c) {
        if ((Math.abs(a - b) >= 10) || (Math.abs(a - c) >= 10) || (Math.abs(b- c) >= 10)) {
            return true;
        }
        return false;
    }
}
