package Ch4;

import java.util.Scanner;
public class ch4task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass=in.nextInt();
        int nums[]=new int[sizemass];
        for(int i=0; i<sizemass;i++) {
            nums[i] = in.nextInt();
        }
        int n=-1;
        int m=in.nextInt();
        for(int i=0; i<sizemass;i++) {
            if(m==nums[i]){
             n=i;
             break;
            }
        }
        if (n != -1){
            System.out.println("YES");
             System.out.println(n);}
        else {
            System.out.println("NO");
        }
    }
}






