package com.sds.challenges;

import java.util.Scanner;

/**
 * Given a string, s , and an integer, k , complete the function 
 * so that it finds the lexicographically smallest and largest 
 * substrings of length k.
 * 
 * Function Description
 * Complete the getSmallestAndLargest function in the editor below.yoda
 * 
 * getSmallestAndLargest has the following parameters:
 * - string s: a string
 * - int k: the length of the substrings to find
 * 
 * Returns
 * string: the string ' + "\n" + ' where and are the two substrings
 * 
 * @author Svetlana Shopova
 *
 */
public class JavaSubstringComparisons {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int substringLength = in.nextInt();         
       
        System.out.println(getSmallestAndLargest(input, substringLength));
        in.close();
    }
    
    public static String getSmallestAndLargest(String input, int substringLength) {        
        String smallest = input.substring(0,substringLength);
        String largest = input.substring(0,substringLength);
        int border = input.length()-substringLength + 1;
       
        for(int i = 0; i < border; i++) {
            String sub = "";
            for(int j = i; j < i + substringLength; j++) {
                sub += input.charAt(j);
            }
            
            if(i > 0) {
                if (sub.compareTo(smallest) < 0){
                    smallest = sub;
                }
                if(sub.compareTo(largest) > 0){
                    largest = sub;
                }
            } else {
                smallest = sub;
                largest = sub;
            } 
        }        
        return smallest + "\n" + largest;
    }
}
