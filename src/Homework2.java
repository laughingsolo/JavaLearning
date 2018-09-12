import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int sum=0;
        sum=sum+a%10;
        a=a/10;
        sum=sum+a%10;
        a=a/10;
        sum=sum+a%10;

        System.out.println("The sum of the digits is "+sum);
    }
}
