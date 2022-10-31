package Ch1;

import java.util.Scanner;

public class Ch1task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println ((a/100)+((a/10)-(a/100*10))+(a%10));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
