package Ch6;

import java.util.Scanner;

public class Ch6task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String text = in.nextLine();
        String s1 = in.next();
        String s2 = in.next();
        String novText = "";
        int count = 0;
        //     System.out.println(s1.substring(0,(0+s2.length())));
        for (int i = 0; i < text.length() - s1.length() +1; i++) {
            if ((text.substring(i, (i + s1.length()))).equalsIgnoreCase(s1)) {
                text = text.replace((text.substring(i, (i + s1.length()))), s2);
               // text = novText;
            }
            //text = novText;
        }
        System.out.println(text);
    }
}











//        String text=in.nextLine();
//        String a=in.nextLine();
//        String b=in.nextLine();
//        String c="";
//        text=text.replace(c,b);
//        System.out.println(text);
//    }
//}
//    Напишите программу которая принимает длинный текст(String text) и два отдельных слова (String S1 и String S2).
//        Программа должна заменить первое слово(S1) везде где оно встречается на второе слово (S2).