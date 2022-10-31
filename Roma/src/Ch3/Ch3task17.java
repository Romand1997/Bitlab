package Ch3;
import java.util.Scanner;
public class Ch3task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        a=a*2-1;

        for(int i=1;i<=a;i=i+2){
            sum=sum+i;

        }
        System.out.println (sum);


    }
}