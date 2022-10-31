package Ch6;

import java.util.Scanner;

public class Ch6task17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String c=in.nextLine();
        String b="";
        int sum=0;
        for(int i=a.length()-1;i>=0;i--) {
            b+=a.charAt(i);
        }
        //System.out.println(b);

        if(b.equals(c)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
//    Вводим строки s1 и s2 в программу.
//        Программа должна вывести "Yes", если s2 является
//        противоположным (в обратном чтении) s1. Иначе "No".