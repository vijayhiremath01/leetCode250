import java.util.*;

public class matrix {

    private static final int i = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = sc.nextInt();
        System.out.println("enter the colums");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i < rows; i++){
            //cols
            for(int j = 0; j < cols; j++ ) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the target");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++) {
            if (numbers[i][j] == x) {
                System.out.println("x found at location(" + i + ", " + j + ")");
            }
        }
        }
        sc.close();
    }
}