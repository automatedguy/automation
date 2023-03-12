package test.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Exercises {

    public void exercise1() {
        // add for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        // add switch statement
        switch (1) {
            case 1:
                System.out.println("Hello World!");
                break;
            case 2:
                System.out.println("Hello World!");
                break;
            default:
                System.out.println("Hello World!");
                break;
        }

    }

    public Boolean isPalindrome(String inputString) {
        // add if statement
        if (inputString == null) {
            return false;
        }

        // add while loop
        int i = 0;
        int j = inputString.length() - 1;
        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    public void isNumberEven(int number) {
        // add if statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }


    public static boolean isNumberPrime(int num){
        // add if statement
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // Create method to iterate array list and find duplicated elements
    public void findDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
    }

    // Create a method to populate HashMap with key and value
    public void populateHashMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        System.out.println(map);
    }

    // Create method for ordering array list
    public void orderArrayList() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array Elements in Ascending Order: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }


    // Create method to find the largest number in array list
    public void findLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in array is: " + max);
    }

    // create method for ordering LinkedList
    public void orderLinkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        Collections.sort(list);
        System.out.println("LinkedList in ascending order: " + list);
    }


    // Create a method 2 find the second largest number in array list without sorting
    public static void findSecondLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest number in array is: " + secondMax);
    }

    public static void main(String[] args) {
        findSecondLargestNumber();
    }

    
}
