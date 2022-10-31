import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        int sum = 0;
        int sr;
        int count = 0;
        int k;
        for (int i = 1; i > 0; i++) {
            int n = bb.nextInt();
            sum+=n;
            k=(sum);
            count++;
            if(count==0) {
            }

            if (n == 0) {

                break;
            }
        }
        sr=sum/(count-1);
        System.out.println(sr+" ");
    }
}