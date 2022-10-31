package Ch6;

import java.util.Scanner;

public class Ch6task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "HELLO WORLD";
        String b = new String();
        char c='h';
        a=a.replace("H","E");
//        b = String.valueOf(a.charAt(0)).toLowerCase();
//        a = a.replace(String.valueOf(a.charAt(a.indexOf("E"))), "p");
        System.out.println(a);
    }
}
  //  String toLowerCase(Locale l)