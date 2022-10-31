package Ch2;

import java.util.Scanner;

public class ch2task10 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max;
        if(a>b&&a>c&&a>d) {
            max = a;
        }
else {
            if (b > c && b > d) {
                max = b;
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }
if(max%2==0){
    System.out.println (max);
    }
else{
    System.out.println ("Not found");
}
        }
    }






