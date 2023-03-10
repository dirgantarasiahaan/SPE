import java.util.Scanner;

public class Narcissistic {

    public static void main(String[] args) {
        Narcissistic narcissistic = new Narcissistic();

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean result = narcissistic.narcissistic(input);
        System.out.println(result);

    }

    public static int getDigitsNumber(int number)
    {
        if (number == 0) {
            return 0;
        }
        return 1 + getDigitsNumber(number / 10);
    }

    public boolean narcissistic(int number)
    {
        int rank = getDigitsNumber(number);
        int n = number;
        int sum = 0;
        while(n > 0)
        {
            sum+= Math.pow(n % 10, rank);
            n = n / 10;
        }
        return (number == sum);
    }
}
