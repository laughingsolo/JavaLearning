import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        System.out.println("please inout a second");
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int min = sum / 60;
        int sec = sum % 60;
        System.out.println(sum+" second is "+min+" min "+sec+" sec ");
    }
}
