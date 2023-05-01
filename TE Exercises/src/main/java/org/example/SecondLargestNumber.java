package org.example;

public class SecondLargestNumber {
    // Given a series of numbers, return the second largest.
    public int secondLargest(int[] myArray) {
        int largestInt = Integer.MIN_VALUE;
        int secondLargestInt = Integer.MIN_VALUE;

        if (myArray.length < 2) {
            throw new IllegalArgumentException("The array must contain at least 2 integers.");
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= largestInt) {
                secondLargestInt = largestInt;
                largestInt = myArray[i];
            } else if (myArray[i] > secondLargestInt) {
                secondLargestInt = myArray[i];
            }
        }

        return secondLargestInt;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        SecondLargestNumber obj = new SecondLargestNumber();
        int secondLargestInteger = obj.secondLargest(myArray);
        System.out.println(secondLargestInteger);
    }


}
