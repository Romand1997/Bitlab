package Ch5;
import java.util.Scanner;

public class Ch5task14_15 {
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
        int k = in.nextInt();
        int min=nums[0][0];
        int max=nums[0][0];
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(nums[i][j]%k==0){
                        nums[i][j]=nums[i][j]/k;
                    }
                }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(nums[i][j]==max){
//                    nums[i][j]=min;}
//                else if(nums[i][j]==min){
//                    nums[i][j]=max;
//                }
//            }
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

