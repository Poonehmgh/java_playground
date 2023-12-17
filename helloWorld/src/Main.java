import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    /* Mortgage Calculator  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAXLOAN = 1000000;
        int MIN_LOAN  = 1000;
        int MIN_AIR = 0;
        int MAX_AIR = 30;
        int MIN_YEARS = 1;
        int MAX_YEARS = 30;
        int principal = MIN_LOAN -1;
        float AIR = MIN_AIR -1 ;
        int years = MIN_YEARS - 1;

        while (true)
        {
            System.out.println("Principal: (between 1k and 1,000,000)");
            principal = scanner.nextInt();
            if (principal <= MAXLOAN && principal >= MIN_LOAN)
                break;
        }
        while(true) {
            System.out.println("Annucal Inetest Rate: ");
                AIR = scanner.nextFloat();
            if (AIR >= MIN_AIR && AIR <= MAX_AIR)
                break;
        }
        while(true) {
            System.out.println("Period (Years): ");
            years = scanner.nextInt();
            if (years >= MIN_YEARS && years <= MAX_YEARS) {
                break ;
            }
        }
        System.out.println("Mortgage: ");
        mortgageCal(principal, AIR, years);
    }
    private static void mortgageCal(int principal, float air, int years)
    {
        final byte MONTH_PER_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = air / MONTH_PER_YEAR / PERCENT;
        int numPayments  = years * MONTH_PER_YEAR;
        double result = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numPayments)/Math.pow(1 + monthlyInterestRate, numPayments);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currRes = currency.format(result);
        System.out.println(currRes);
    }
    /* Switch statement syntax
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next();
        switch (role)
        {
            case("Admin"):
                System.out.println("You are admin! congrats");
                break;
            case("none"):
                System.out.println("You are nobody!");
                break;
        }
    }*/
    /*  FizzBuzz */
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        if (num % 5 == 0 && num % 3 == 0)
//        {
//            System.out.println("FizzBuzz!");
//        }else if (num % 3 == 0)
//            System.out.println("Buzz!");
//        else if (num % 5 == 0)
//            System.out.println("Fizz!");
//        else
//            System.out.println(num);
//    }


}