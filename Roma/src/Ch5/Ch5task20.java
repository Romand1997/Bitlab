package Ch5;
import java.util.Scanner;

public class Ch5task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[][] = new int[n][n];
        int y[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
                y[i][j] = nums[i][j];
                //КОПИЯ МАССИВА
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    nums[i][j] = nums[n - 1][j];
                }

            } else if (i == (n - 1)) {
                for (int j = 0; j < n; j++) {
                    nums[i][j] = y[0][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
