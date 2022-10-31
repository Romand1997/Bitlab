//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a=in.next();
//        System.out.println(a.charAt(0));
//    }
//}
  //  Программа должна запрашивать текст и выводить на экран первый символ(букву) текста.


//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a=in.next();
//        if(a.equals("BITLAB")){
//            System.out.println("YES");
//        } else{
//            System.out.println("NO");
//        }
//    }
//}
 //   Принимайте с консоли некий текст и сравните его со словом "BITLAB".
//   Если они абсолютно идентичны, выведите на экран "YES", иначе "NO".




//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a=in.next();
//        String b=in.next();
//        if(a.toLowerCase().equals(b.toLowerCase())){
//            System.out.println("THEY ARE EQUAL");
//        } else {
//            System.out.println("THEY ARE NOT EQUAL");
//        }
//    }
//}

//    Программа запрашивает два слова и сравнивает их без учета регистров (заглавные и строчные буквы).
//        Выведите на экран "THEY ARE EQUAL" если оны равны, и "THEY ARE NOT EQUAL" в противном случае.




//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a=in.next();
//        char b=in.next().charAt(0);
//        int count=0;
//        for (int i=0;i<a.length();i++) {
//            if (a.charAt(i) == b) {
//                System.out.println(i);
//                count++;
//            }
//        }
//        if (count!=0){
//            System.out.println("THERE IS NO SUCH LETTER");
//        }
//    }
//}
//        Напишите программу которая принимает одно слово и одну букву. Выведите индекс буквы
//        в слове если она там присутствует, и "THERE IS NO SUCH LETTER" если в слове буквы не окажется.




//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a=in.next();
//        String zero="zero";
//        String one="one";
//        String two="two";
//        String three="three";
//        String four="four";
//        String five="five";
//        String six="six";
//        String seven="seven";
//        String eight="eight";
//        String nine="nine";
//        if (a.equals(zero)){
//            System.out.println(0);
//        } else if(a.equals(one)){
//            System.out.println(1);
//        }else if(a.equals(two)){
//            System.out.println(2);
//        }else if(a.equals(three)){
//            System.out.println(3);
//        }else if(a.equals(four)){
//            System.out.println(4);
//        }else if(a.equals(five)){
//            System.out.println(5);
//        }else if(a.equals(six)){
//            System.out.println(6);
//        }else if(a.equals(seven)){
//            System.out.println(7);
//        }else if(a.equals(eight)){
//            System.out.println(8);
//        }else if(a.equals(nine)) {
//            System.out.println(9);
//        }
//    }
//}
//        Напишите программу которая принимает число(В интервале от 0 до 9)
//        в текством формате и показывает на экране в виде цифры.



//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a= in.nextLine();
//        for (int i=0;i<a.length();i++){
//            System.out.println(a.charAt(i));
//            System.out.println(a.charAt(i));
//        }
//    }
//}
////Напишите программу которая принимает слово и выводит каждый символ этого слова в отдельной строке.




//package Ch6;
//
//import java.util.Scanner;
//
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a= in.nextLine();
//        String b= in.nextLine();
//        int count=0;
//        for(int i=0;i<a.length();i++){
//            if((String.valueOf(a.charAt(i)).equalsIgnoreCase(b))){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
  //  Программа должна принимать текст и букву, затем подсчитать сколько раз буква встречается в тексте.


//package Ch6;
//import java.util.Scanner;
//public class Ch6task1 {
//    public static void main(String[]args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.nextLine();
//        System.out.println(a.replace("a","o"));
//    }
//}
//Напишите программу которая заменяет в тексте все буквы 'a' ну букву 'о'.

//package Ch6;
//import java.util.Scanner;
//public class Ch6task1 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String a = in.nextLine();
//        String b= "";
//        for(int i=a.length()-1;i>=0;i--){
//            b+=a.charAt(i);
//        }
//        System.out.println(b);
//    }
//}
//Напишите программу которая показывает принятый текст в обратном порядке.


package Ch6;

import java.util.Scanner;

public class Ch6task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        int count=0;
   //     System.out.println(s1.substring(0,(0+s2.length())));
        for(int i=0;i<s1.length()-s2.length()+1;i++) {
            if ((s1.substring(i, (i + s2.length()))).equals(s2)) {
                count++;
            }
        }
            if (count!=0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
}

//Вводим в программу две строки s1 и s2. Если s2 содержится внутри слова s1, то программа выводит "Yes", иначе "No".