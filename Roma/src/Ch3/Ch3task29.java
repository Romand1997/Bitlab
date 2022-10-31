package Ch3;
import java.util.Scanner;
public class Ch3task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pr=0;
        for (int i=1;i<=n;i++){
            pr=pr+(i*i);
            }
        System.out.println(pr);
        }
}