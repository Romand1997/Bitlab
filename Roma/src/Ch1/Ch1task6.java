package Ch1;

import java.util.Scanner;
public class Ch1task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println ("a+b+c="+(a+b+c));
        System.out.println ("a+b+c="+(a-b-c));

        System.out.println ("a+b+c="+a*b*c);
    }
}
