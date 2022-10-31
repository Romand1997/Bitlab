package Ch4;

import java.util.Scanner;
public class ch4task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass = in.nextInt();
        int nums[] = new int[sizemass];
        for (int i = 0; i < sizemass; i++) {
            nums[i] = in.nextInt();
        }
        int x=1;
        for (int i = 1; i < sizemass; i = i + 1) {
            if (nums[i] > 0 && nums[i - 1] < 0 || nums[i] < 0 && nums[i - 1] > 0) {
            x=x+1;
            }
        }
            if (x==sizemass){
        System.out.println("YES");}
        else{
            System.out.println("NO");
            }

    }
}





