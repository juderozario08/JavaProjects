package practice;

import MyLibs.Search;

public class BinarySearchRecursive{
    static int[] list = {1,2,3,4,5,6,7,8,9,10};
    static int counter = 0;
    public static void main(String[] args){
        int start = 0;
        int endIndex = list.length-1;
        int number = 10;
        System.out.println("Guess: "+number);
        System.out.println("Binary Search: " +Search.binarySearch(list, start, endIndex, number));
    }
}
