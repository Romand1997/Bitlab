package Ch4;

import java.util.Scanner;
public class ch4task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizemass=in.nextInt();
        int nums[]=new int[sizemass];
        for(int i=0; i<sizemass;i++) {
            nums[i] = in.nextInt();
        }
        int max=nums[0];
        int min=nums[0];
        int n=0;
        int m=0;
    for(int i=0;i<sizemass;i++) {
        if (max<nums[i]){
            max=nums[i];
            n=i;
        }
        if (min>nums[i]){
            min=nums[i];
            m=i;
        }
    }
    for(int i=0;i<sizemass;i++){
        if (nums[i]==max){
            nums[i]=min;
        }
        else if (nums[i]==min) {
            nums[i]=max;
        }
        System.out.print(nums[i]+" ");
    }



    //    System.out.println(nums[i]);}

//        int n=0;
//        int m=in.nextInt();
//        for(int i=0; i<sizemass;i++) {
//            if(m==nums[i]){
//                b = true;
//                n=i;
//            }
//        }
//        if (b==true){
//            System.out.println("YES");
//            System.out.println(n);}
//        else {System.out.println("NO");}
    }
}
