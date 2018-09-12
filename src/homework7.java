import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row");
        Scanner input = new Scanner(System.in);

        for (int rows = 0; rows < m.length; rows++) {
            for (int columns = 0; columns < m[0].length; columns++) {
                m[rows][columns] = input.nextInt();
            }
        }

        double sum = sumMatrix(m);

        System.out.println(" Sum of the matrix is "+sum);

    }

    public static double sumMatrix(int[][] m) {
        double sum = 0;
        for (int rows = 0; rows < m.length; rows++) {
            for (int columns = 0; columns < m[0].length; columns++) {
                sum = sum + m[rows][columns];
            }
        }
        return sum;
    }
}
