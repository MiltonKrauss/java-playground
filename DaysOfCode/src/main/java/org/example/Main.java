package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] intArrayForMakeMiddle = {1, 2, 3, 4};
        int[] makeMiddleResult = MakeMiddle.makeMiddle(intArrayForMakeMiddle);
        System.out.println(java.util.Arrays.toString(makeMiddleResult));
    }
}