package com.sds.challenges;

import java.util.Scanner;

/**
 * Given two strings of lower case English letters, A and B , perform the following operations:
 * 1. Sum the lengths of A and B.
 * 2. Determine if A  is lexicographically larger than B
 *    (i.e.: does B  come before A in the dictionary?).
 * 3. Capitalize the first letter in A  and B and print them on a single line, separated by a space.
 * 
 * <p>Input Format
 *
 * The first line contains a string A. The second line contains another string B.
 * The strings are comprised of only lowercase English letters.</p>
 *
 * <p>Output Format 
 * There are three lines of output:
 * For the first line, sum the lengths of A  and B.
 * For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, 
 * separated by a space.<\p>
 * 
 *<p> @author Svetlana Shopova</p>
 * 
 *<p> @since 04.10.2021</p>
 */
public class JavaStringsIntroduction {
   
  public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    String firstWord = sc.next();
    String secondWord = sc.next();
    
    System.out.println(firstWord.length() + secondWord.length());
    if(firstWord.compareTo(secondWord) > 0){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }  
    
    firstWord = firstWord.toUpperCase().substring(0,1) + firstWord.substring(1, firstWord.length());   
    secondWord = secondWord.toUpperCase().substring(0,1) + secondWord.substring(1, secondWord.length());    
    System.out.println(firstWord + " " + secondWord);    
    sc.close();
  }
}
