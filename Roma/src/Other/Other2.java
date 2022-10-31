package Other;

import java.util.Scanner;

public class Other2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b= in.nextInt();
        int z=1;
        System.out.println(a);
        for (int i=2;i<=b;i++){
            z++;
            a++;
            for (int j = 1; j <=z; j++) {
                System.out.println(a);
            }
        }
    }
}
//Даны целые числа A и B (A < B). Вывести все целые числа от A до B
//        включительно; при этом число A должно выводиться 1 раз, число A + 1
//        должно выводиться 2 раза и т. д