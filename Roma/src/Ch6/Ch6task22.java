package Ch6;

import java.util.Scanner;

public class Ch6task22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))){
                b=b+Character.toLowerCase(a.charAt(i));
            }
            else{
                b=b+Character.toUpperCase(a.charAt(i));
            }
        }
        System.out.println(b);
    }
}
  //  Напишите программу, которая преобразует все заглавные символы строки в нижний регистр.