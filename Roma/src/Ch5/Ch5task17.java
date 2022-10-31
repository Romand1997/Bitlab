package Ch5;
import java.util.Scanner;

public class Ch5task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int nums[][] = new int[n][m];
        int q=0;
        int w=0;
        int e=0;
        int r=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        if(n%2==0) {
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j <m; j++) {
                    q = nums[i][j];
                    nums[i][j] = nums[n-1-i][j];
                    nums[n-1-i][j] = q;
                }
            }
        }
                else{for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <m; j++) {
                q = nums[i][j];
                nums[i][j] = nums[n-1-i][j];
                nums[n-1-i][j] = q;
            }
        }
        }
                for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
