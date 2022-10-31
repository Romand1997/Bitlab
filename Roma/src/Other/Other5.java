package Other;

import java.util.Scanner;

public class Other5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int count=0;
        int j=n-1;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"первый ");
            if (i % 2 != 0) {
                for (j=j;j>=0;j--) {
                   System.out.print(a[j]+"второй ");

                //    System.out.print("j="+j+" ");
                    if (j%2==0){
                        j--;
                        break;

                    }
                }
            }
        }
    }
}
//    Дан массив A размера N. Вывести его элементы в следующем порядке:
//        A1, A2, AN , AN−1, A3, A4, AN−2, AN−3, . . . .