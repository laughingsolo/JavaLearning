import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double average=(a+b+c)/3;

        System.out.println("The average of three numbers "+a+" "+b+" "+c+" "+"is "+average);

    }
}
