import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = sumDigits(number);
        System.out.println(sum);
    }

    public static int sumDigits(int x) {

        int sum = 0;
        while (x!=0) {
            sum = sum + x % 10;
            x=x/10;
        }
        return sum;
    }
}
