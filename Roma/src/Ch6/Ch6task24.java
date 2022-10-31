package Ch6;

import java.util.Scanner;

public class Ch6task24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                count++;
            }

        }
        System.out.println(count);
    }
}

//    Сделайте счетчик который считает количество букв в тексте исключая цифры и символы.