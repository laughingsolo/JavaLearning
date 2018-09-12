import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Enter a degree in Celsius: ");
        Scanner input = new Scanner(System.in);
        double degree = input.nextDouble();
        double fahrenheit=((9.0/5)*degree+32);
        System.out.println(degree+" Celsius is "+fahrenheit+" Fahrenheit");
    }
}
