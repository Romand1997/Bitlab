package Other;

import java.util.Scanner;

public class other4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ax= in.nextInt();
        int ay= in.nextInt();
        int bx= in.nextInt();
        int by= in.nextInt();
        int cx= in.nextInt();
        int cy= in.nextInt();
        int dx= in.nextInt();
        int dy= in.nextInt();
        double ab, ac, ad;
        System.out.println(Math.abs(Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2))));
        System.out.println(Math.abs(Math.sqrt(Math.pow((ax-cx),2)+Math.pow((ay-cy),2))));
        System.out.println(Math.abs(Math.sqrt(Math.pow((ax-dx),2)+Math.pow((ay-dy),2))));
    }
}
//    Описать функцию Leng(xA, yA, xB, yB) вещественного типа, находящую длину отрезка AB на плоскости по координатам его концов:
//        |AB| = sqrt((xA − xB)^2 + (yA − yB)^2)
//        (xA, yA, xB, yB — вещественные параметры). С помощью этой функции
//        найти длины отрезков AB, AC, AD, если даны координаты точек A, B, C, D.
