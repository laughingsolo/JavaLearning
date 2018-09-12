import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        int gck = 1;
        int k = 1;

        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0) {
                gck = k;
            }
            k++;
        }

        System.out.println("The greatest common divisor for "+number1+" and "+number2+" is "+gck);

    }
}
