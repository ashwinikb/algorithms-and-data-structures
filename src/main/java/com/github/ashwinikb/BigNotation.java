package com.github.ashwinikb;

import java.util.Arrays;

public class BigNotation {
    //O(1) Example.
    public static int printFirstItem(int[] arrayOfItems) {
        System.out.println(arrayOfItems[0]);
        return 0;
    }


    //O(N)
    public static void printALlItem(int[] arrayOfItems){
        for(int print : arrayOfItems){
            System.out.println(print);
        }
    }

    //O(N^2)
    public static void printAllPossibleOrderedPair(int[] arrayOfItems){
        for(int item : arrayOfItems){
            for(int prints : arrayOfItems){
                int[] orderedPair = new int[]{item,prints};
                System.out.println(Arrays.toString(orderedPair));
            }
        }
    }

    //O(N) + O(N) = O(N)
    public static void printAllItemsTwice(int[] arrayOfItems){
        for(int item : arrayOfItems){
            System.out.println(item);
        }

        for(int prints : arrayOfItems){
            System.out.println(prints);
        }

    }

}
