package Ch6;

import java.util.Scanner;

public class Ch6task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        //String c = in.nextLine();
        String b = "";
        int sum = 0;
        for(int i=a.length()-1;i>=0;i--) {
            b += a.charAt(i);
        }
      //  if (a.length() % 2 == 0) {
            if (a.substring(0, (a.length() / 2)).equals(b.substring(0, (b.length() / 2)))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
//        } else {
//            if (a.substring(0, (a.length() / 2)).equals(b.substring(0, (b.length() / 2)))) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }
//        b=a.substring((a.length() / 2 + 1), a.length());
//        System.out.println(b);
    }
}


//    Мы вводим строку (текст) в нашу программу. Программа должна определить, является ли наш текст "Палиндром"-ом или нет.
//        Палиндром - это когда текст читается так же одинаково если ее читать в обратном порядке.