//package Ch5;
//import java.util.Scanner;
//
//public class Ch5task18 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int nums[][] = new int[n][m];
//                for (int i = 0; i < n; i++) {                 ВЫВЕСТИ МАКСИМАЛЬНОЕ ЧИСЛО В КАЖДОМ СТОЛБЦЕ
//            for (int j = 0; j < m; j++) {
//                nums[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            int max= nums[0][i];
//            for (int j = 0; j < n; j++) {
//                if (max<nums[j][i]) {
//                    max = nums[j][i];
//                }
//            }
//            System.out.println(max);
//        }
//       }
//    }
