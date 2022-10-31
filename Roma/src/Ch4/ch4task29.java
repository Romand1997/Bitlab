package Ch4;

import java.util.Scanner;
public class ch4task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass = in.nextInt();
        int nums[] = new int[sizemass];
        for (int i = 0; i < sizemass; i++) {
            nums[i] = in.nextInt();
        }
        int sum = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < sizemass; i++) {
            if (nums[i] == 0) {
                index1 = i;
            }
        }
        System.out.println(index1);
        for (int i = sizemass-1 ; i >=0 ; i=i-1) {
                if (nums[i] == 0) {
                    index2 = i;
                }
            }
        System.out.println(index2);

                for (int i = index2+1; i <= index1-1; i++) {
                    sum+=nums[i];
                }

        System.out.println(sum);
    }
}

