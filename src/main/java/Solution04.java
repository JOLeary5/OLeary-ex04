/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Prompt user for a noun
    - Prompt user for a verb
    - Prompt user for an adjective
    - Prompt user for an adverb
    - Display Comedy string
 */
import java.sql.SQLOutput;
import java.util.Scanner;


public class Solution04
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String Noun = scanR.nextLine();

        System.out.println("Enter a verb: ");
        String Verb = scanR.nextLine();

        System.out.println("Enter an adjective: ");
        String Adjective = scanR.nextLine();

        System.out.println("Enter an adverb: ");
        String Adverb = scanR.nextLine();

        System.out.println("My wife bought a " + Adjective + " " + Noun + ". All it does is " + Adverb + " " + Verb +" and it costs my life savings.");
    }
}
