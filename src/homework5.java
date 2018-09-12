import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("True or False " + isPalindrome(number));

    }

    public static int reverse(int number) {
        int[] num = new int[100];
        int sum = 0;
        int renum=0;
        while (number != 0) {
            num[sum] = number % 10;
            number = number / 10;
            sum = sum + 1;
        }
        for (int i = 0; i < sum; i++){
            renum=renum+((int)Math.pow(10,sum-i-1)*num[i]);

        }
        return renum;

    }

    public static boolean isPalindrome(int number) {
        int number2 = reverse(number);
        if (number == number2) {
            return true;
        }
        else {
            return false;
        }
    }


}
