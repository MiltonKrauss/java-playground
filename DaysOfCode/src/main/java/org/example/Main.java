package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        int[] intArrayForMakeMiddle = {1, 2, 3, 4};
        int[] makeMiddleResult = MakeMiddle.makeMiddle(intArrayForMakeMiddle);
        System.out.println("MakeMiddle: middle two elements of {1, 2, 3, 4}");
        System.out.println(java.util.Arrays.toString(makeMiddleResult));
        System.out.println();

        int[] intArrayForMakeLast = {1, 2, 3};
        int[] makeLastResult = MakeLast.makeLast(intArrayForMakeLast);
        System.out.println("MakeLast: double the array length and match the last element of {1, 2, 3}");
        System.out.println(java.util.Arrays.toString(makeLastResult));
        System.out.println();

        int[] intArrayForMakeEnds = {1, 2, 3};
        int[] makeEndsResult = MakeEnds.makeEnds(intArrayForMakeEnds);
        System.out.println("Make Ends: first and last elements of {1, 2, 3}");
        System.out.println(java.util.Arrays.toString(makeEndsResult));
        System.out.println();

        int lessBy10test1a = 1;
        int lessBy10test1b = 6;
        int lessBy10test1c = 11;
        boolean lessBy10test1Result = LessBy10.lessBy10(lessBy10test1a, lessBy10test1b, lessBy10test1c);
        int lessBy10test2a = 1;
        int lessBy10test2b = 4;
        int lessBy10test2c = 7;
        boolean lessBy10test2Result = LessBy10.lessBy10(lessBy10test2a, lessBy10test2b, lessBy10test2c);
        System.out.println("LessBy10: a difference of 10 or more between any two elements 1, 6, 11");
        System.out.println(lessBy10test1Result);
        System.out.println("LessBy10: a difference of 10 or more between any two elements 1, 4, 7");
        System.out.println(lessBy10test2Result);
        System.out.println();
    }
}