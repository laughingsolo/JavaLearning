import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int value, the program exits if the input is 0: ");

        int posum = 0;
        int nesum = 0;
        int sum = 0;
        float average = 0;
        int number = input.nextInt();

        while (number != 0) {
            if (number > 0) {
                posum++;
            }
            if (number < 0) {
                nesum++;
            }
            sum = sum + number;
            number = input.nextInt();
        }

        average = (float) sum / (posum + nesum);

        System.out.println("The number of positives is " + posum);
        System.out.println("The number of negatives is " + nesum);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + average);

    }
}
