package Recursion;
/**
 * Classes for the Recursion Client program
 * 
 * Aayush Chanda
 * Counting Program
 */
public class Count
{
    int number;
    
    public Count()
    {
    }
    
    public int lengthOfNumber(int number)
    {
        if (number / 10 == 0)
        {
            return 1;
        }
        else
        {
            int num = lengthOfNumber(number / 10) + 1;
            return num;
        }
    }
    
    public boolean palindromeTester(String phrase)
    {
        if (phrase.length() == 0 || phrase.length() == 1)
        {
            return true;
        }
        
        if (phrase.charAt(0) == phrase.charAt(phrase.length() - 1))
        {
            return palindromeTester(phrase.substring(1, phrase.length() - 1));
        }
        else
        {
            return false;
        }
    }
    
    public int gcd(int a, int b)
    {
        if ((a % b) == 0)
        {
            return b;
        }
        else
        {
            return gcd(b, a % b);
        }
    }
}