package Ch4;

import java.util.Scanner;

public class ch4task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass=in.nextInt();
        int nums[]=new int[sizemass];
        for(int i=0; i<sizemass;i++) {
            nums[i] = in.nextInt();
        }
        int max=nums[0];
        for(int i=0; i<sizemass;i++){
            if (max<nums[i]) {
             max=nums[i];
            }}
            System.out.print(max);
    }
    }
