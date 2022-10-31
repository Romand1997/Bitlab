package Ch6;

import java.util.Scanner;

public class Ch6task23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        char b='a';
        //String b="";
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                a=a.replace(a.charAt(i),'0');
            }

        }
        System.out.println(a);
    }
}
 //   Программа должна приравнять все цифры в тексте к значению 0.