package Ch6;

import java.util.Scanner;

public class Ch6task15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();

        int count=0;

        for(int i=0;i<s1.length();i++) {
            if ((String.valueOf(s1.charAt(i))).equalsIgnoreCase("a")||
                    (String.valueOf(s1.charAt(i))).equalsIgnoreCase("e")||
                    (String.valueOf(s1.charAt(i))).equalsIgnoreCase("i")||
                    (String.valueOf(s1.charAt(i))).equalsIgnoreCase("o")||
                    (String.valueOf(s1.charAt(i))).equalsIgnoreCase("y")||
                    (String.valueOf(s1.charAt(i))).equalsIgnoreCase("u")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
  //  Мы вводим строку (текст) в нашу программу. Программа должна вывести количество гласных букв. (Гласные буквы: a, e, i, o, u)