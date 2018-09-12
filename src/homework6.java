import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] numsum = new int[100];
        while (number != 0) {
            numsum[number]++;
            number = input.nextInt();
        }

        for (int a = 0; a < 100; a++) {
            if (numsum[a] != 0) {
                if (numsum[a] == 1) {
                    System.out.println(a + " occurs " + numsum[a] + " time ");
                }
                else {
                    System.out.println(a + " occurs " + numsum[a] + " times ");
                }
            }
        }


    }

}
