/*
 *  UCF COP3330 Fall 2021 Exercise 2 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise02;
import java.util.Scanner;


public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("What is your input string?\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        System.out.println(input+" has "+length+" characters.");
    }
}
