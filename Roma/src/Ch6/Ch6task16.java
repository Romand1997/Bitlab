package Ch6;

import java.util.Scanner;

public class Ch6task16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int sum=0;
        for(int i=0;i<a.length();i++) {
            if (Character.isDigit(a.charAt(i))) {
                sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
 //   Напишите программу которая выводит сумму всех цифр в тексте.