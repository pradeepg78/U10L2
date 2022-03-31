import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("mohammed"));
    }

    public static String countdown(int number)
    {
        if (number == 0) return " Blastoff!";
        else return number + " " + countdown(number - 1);
    }

    public static boolean isPalindrome(String check)
    {
        if (check.length() == 0 || check.length() == 1) return true;
        else
        {
            if (check.substring(0,1).equals(check.substring(check.length() - 1, check.length())))
            {
                return isPalindrome(check.substring(1, check.length() - 1));
            }
            else return false;
        }
    }

    public static int countEvens(int[] array, int i) {
        
    }


}

