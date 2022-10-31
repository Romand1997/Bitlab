package Ch6;

import java.util.Scanner;

public class Ch6task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int b = 2 * (Integer.parseInt(String.valueOf(a.charAt(0))));
        a = a + b;
        for(int i=1;i<a.length();i++) {
            System.out.print(a.charAt(i));
        }
    }
}







//        String c = in.nextLine();
//        String b = "";
//        int sum = 0;
//        for(int i=a.length()-1;i>=0;i--) {
//            b += a.charAt(i);
//        }
//          if (a.length() % 2 == 0) {
//        if (a.substring(0, (a.length() / 2)).equals(b.substring(0, (b.length() / 2)))) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        } else {
//            if (a.substring(0, (a.length() / 2)).equals(b.substring(0, (b.length() / 2)))) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }
//        b=a.substring((a.length() / 2 + 1), a.length());
//        System.out.println(b);
//    }
//}
//    Программа должна принимать текст из двух символов где первый символ цифра, а вторая буква.
//        Поменяйте местами цифру и букву, а также умножьте цифру на 2.