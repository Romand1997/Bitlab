package Ch4;

import java.util.Scanner;
public class ch4task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass = in.nextInt();
        int nums[] = new int[sizemass];
        int n = 0;

        for (int i = 0; i < sizemass; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < sizemass; i++) {
            if (nums[i] % 2 == 0) {
                n++;
            }
        }
        int nov[] = new int[n];
        int k = 0;

        for (int i = 0; i < sizemass; i++) {
            if (nums[i] % 2 == 0) {
                nov[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nov[i] + " ");
        }

    }

}
