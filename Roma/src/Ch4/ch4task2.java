package Ch4;

import java.util.Scanner;

public class ch4task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass=in.nextInt();
        int nums[]=new int[sizemass];
        for(int i=0; i<sizemass;i++) {
            nums[i] = in.nextInt();}
          for(int i=0; i<sizemass;i++) {
              System.out.println (nums[i]);}

          }
}