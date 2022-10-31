package Other;

import java.util.Scanner;

public class Other3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int z = 0;
        int x = c;
        if(c>a||c>b){
            System.out.println("Error");
        }
        else {
            while (a >= x) {
                System.out.println("cycle 1");
                x = x + c;
                System.out.println("z=" + z);
                System.out.println("x=" + x);
                int p = c;
                while (b>= p){
                    System.out.println("cycle 2");
                    p = p + c;
                    z++;
                    System.out.println("z=" + z);
                    System.out.println("p=" + p);
                }
            }
            System.out.println(z);
        }
    }
}




//    Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено максимально возможное количество квадратов со
//        стороной C (без наложений). Найти количество квадратов, размещенных
//        на прямоугольнике. Операции умножения и деления не использовать.
