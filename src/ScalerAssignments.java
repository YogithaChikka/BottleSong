import java.util.Scanner;
public class ScalerAssignments
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();

//        /*   WHILE LOOP  */
        int i = 1;
        int firstDigit = 0;
        int lastDigit = 0;
        while (i <= T)
        {
            int N = sc.nextInt();
            lastDigit = N % 10;
            while (N > 0)
            {
                firstDigit = N % 10;
                N /= 10;
            }
            System.out.println(firstDigit + " " + lastDigit);
            i++;
        }
    }
}

