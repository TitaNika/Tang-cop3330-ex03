/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment3 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote? ");
        String quote = scan.nextLine();

        System.out.print("Who said it? ");
        String author = scan.nextLine();

        System.out.println(author + " says: " + quote);
    }

}