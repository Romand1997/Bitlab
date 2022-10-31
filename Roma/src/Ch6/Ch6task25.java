package Ch6;

import java.util.Scanner;

public class Ch6task25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int count=0;
        String b = "";
        for(int i=0;i<a.length();i++) {

            if (Character.isLetter(a.charAt(i))) {
                b+=Character.toUpperCase(a.charAt(i));
                break;
            } else {
                b=b+a.charAt(i);
                count++;
            }
        }
        b=b+a.charAt(count+1);

        for(int i=count+1;i<a.length()-1;i++){
            if(Character.isSpaceChar(a.charAt(i))&&Character.isLetter(a.charAt(i+1))){
               // b+=a.charAt(i);
                b+=Character.toUpperCase(a.charAt(i+1));
            } else {
                b=b+a.charAt(i+1);
            }
        }
        System.out.println(b);
    }
}
  //  Напишите программу которая переписывает текст так чтобы каждое слово начиналось с заглавной буквы.