package ex15;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // assigned knownpassword as a string
        String knownPassword = "abc$123";

        System.out.print("Enter your Username: ");
        Scanner s = new Scanner(System.in);
        // make scanner class object to scan user input
        String username = s.nextLine();

        System.out.print("What is the password ?: ");
        String password = s.nextLine();

        //method returns true if strings are the same
        if((knownPassword.equals(password)))
        {
            System.out.println("Welcome! ");
        }
        else
        {
            System.out.print("I don't know you ");
        }
    }
}
