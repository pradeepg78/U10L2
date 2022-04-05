import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        int[] intArr = {2, 4, 5, 7, 9, 9, 6, 3, 96};
        System.out.println(findMaximum(intArr, 0));
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
       if (i == array.length) return 0;
       int n;
       if ((array[i] % 2) == 0)
       {
           n = 1;
       }
       else
       {
           n = 0;
       }
       return n + countEvens(array, i + 1);
    }

    public static int findMaximum(int[] array, int i) {
       if (i == array.length - 1) return array[i];
       int max = findMaximum(array, i + 1);
       if (max > array[i])
       {
           return max;
       }
       else return array[i];
    }


}

