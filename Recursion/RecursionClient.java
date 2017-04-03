package Recursion;
/**
 * Client for the recursion labs
 * 
 * Aayush Chanda
 * Recursion Labs Client
 */
import java.util.*;
public class RecursionClient
{
    public static void main(String[] args)
    {
        Count thing = new Count();
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("#1");
        System.out.print("Enter in a number: ");
        int n = Keyboard.nextInt();
        System.out.println("There are " + thing.lengthOfNumber(n) + " digits in that number");
        
        System.out.println("\n#2");
        Keyboard.nextLine();
        System.out.println("Enter in a phrase:");
        String phrase = Keyboard.nextLine();
        System.out.println("The fact that the phrase is a palindrome is " + thing.palindromeTester(phrase));
        
        System.out.println("\n#3");
        System.out.print("Enter in a number for the numerator: ");
        int numer = Keyboard.nextInt();
        System.out.print("Enter in a number for the denominator: ");
        int denom = Keyboard.nextInt();
        System.out.println("The greatest common denominator is " + thing.gcd(numer, denom));
    }
    
    /*
     * GCD Output
     * 
     * Enter in a number for the numerator: 99
     * Enter in a number for the denominator: 1090
     * The greatest common denominator is 1
     * 
     * Enter in a number for the numerator: 99
     * Enter in a number for the denominator: 999
     * The greatest common denominator is 9
     */
}
