//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.nextLine();
//        metod(a);
//    }
//    public static void metod(String a) {
//        String c = "";
//        for (int i = a.length()-1; i >=0; i--) {
//            c=c+a.charAt(i);
//        }
//        if(a.equals(c)){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//        metod(s1,s2);
//    }
//    public static void metod(String s1, String s2) {
//        String c = "";
//        if (s1.contains(s2)){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}
//    Напишите метод, который в аргументы принимает две строки s1 и s2.
//        Если s2 содержится внутри слова s1, то программа выводит "YES", иначе "NO".




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("input login");
//        String login = in.nextLine();
//        System.out.println("input password");
//        String password = in.nextLine();
//        metod(login,password);
//    }
//    public static void metod(String login, String password) {
//        String c = "";
//        if (login.equalsIgnoreCase("admin")&&password.equals("qwerty")){
//            System.out.println("Authentication completed");
//        } else {
//            System.out.println("Invalid login or password");
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы логин и пароль.
//        И если данные были введены верно, то мы выводим Authentication completed,
//        иначе Invalid login or password. (Логин должен быть - admin, пароль - qwerty)



//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //System.out.println("input arrive.length");
//        int n = in.nextInt();
//        int a[]=new int[n];
//        //System.out.println("input arrive");
//        for (int i=0;i< a.length;i++) {
//            a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int sum=0;
//        int count=0;
//        for(int i=0;i<a.length;i++){
//            if (a[i]%2==0){
//                sum=sum+a[i];
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println("There is no chetnyh nums");
//        } else {
//            System.out.println((double)sum / count);
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив целостных чисел.
//        Программа должна вывести среднее арифметическое всех четных элементов массива.




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[][]=new int[n][n];
//        for (int i=0;i< a.length;i++) {
//            for (int j=0;j<a.length;j++){
//                a[i][j] = in.nextInt();
//            }
//        }
//        metod(a);
//    }
//    public static void metod(int a[][]) {
//        int c=0;
//        for (int j=0;j< a.length;j++) {
//            c=a[0][j];
//            a[0][j]=a[a.length-1][j];
//            a[a.length-1][j]=c;
//        }
//        for (int i=0;i< a.length;i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
   // Создайте такой метод, который принимает в аргументы двумерный массив размера NxN.
   //     Программа должна заменить первую нулевую строку массива на последнюю строку массива.




//package Ch7;
//
//        import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[]=new int[n];
//        for (int i=0;i< a.length;i++) {
//            a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int c=0;
//        for (int i=0;i< a.length;i++) {
//            if(a[i]%2!=0&&a[i]!=23){
//                System.out.println(a[i]+" ");
//            } if (a[i]==23) {
//                break;
//            }
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив из целых чисел.
//        Программа должна выводить нечетные числа из массива и остановится, если встретит число 23.



//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[]=new int[n];
//        for (int i=0;i< a.length;i++) {
//            a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int sum=0;
//        for (int i=0;i< a.length;i++) {
//            if(a[i]%5!=0){
//                sum+=a[i];
//            }
//        }
//        System.out.println(sum);
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив из целых чисел.
//        Необходимо просуммировать элементы массива не учитывая элементы которые делятся на 5 без остатка.




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        metod(n);
//    }
//    public static void metod(int a) {
//        if(a%2==0){
//            System.out.println("YES");
//            } else {
//                System.out.println("NO");
//        }
//    }
//}
 //   Напишите метод, который проверяет, делится ли число на 2 без остатка или нет.





//package Ch7;
//
//        import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String n = in.nextLine();
//        metod(n);
//    }
//    public static void metod(String a) {
//        String b="";
//        for(int i=0;i<a.length();i++){
//            b+=String.valueOf(a.charAt(i))+String.valueOf(a.charAt(i));
//        }
//        System.out.println(b);
//    }
//}
//    Напишите метод, который в аргументы принимает строку и продублирует все символы.


//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String n = in.nextLine();
//        metod(n);
//    }
//    public static void metod(String a) {
//        int count=0;
//        for(int i=0;i<a.length();i++){
//            if (String.valueOf(a.charAt(i)).equalsIgnoreCase("a")||
//                    String.valueOf(a.charAt(i)).equalsIgnoreCase("e")||
//                    String.valueOf(a.charAt(i)).equalsIgnoreCase("i")||
//                    String.valueOf(a.charAt(i)).equalsIgnoreCase("o")||
//                    String.valueOf(a.charAt(i)).equalsIgnoreCase("u")||
//                    String.valueOf(a.charAt(i)).equalsIgnoreCase("y")){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//    Напишите метод, который в аргументы принимает строку.
//        Нужно посчитать количество гласных букв в строке. (Гласные буквы: a, e, i, o, u, y)



//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int a[]=new int[n];
//        for (int i=0;i< a.length;i++) {
//             a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int count=0;
//        for(int i=0;i<a.length;i++){
//            if (a[i]!=0){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//    Напишите метод, который принимает в аргументах массив целостных чисел,
//    в итоге программа должна вывести количество элементов не равных 0.


//package Ch7;
//
//        import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int a[]=new int[n];
//        for (int i=0;i< a.length;i++) {
//            a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int count=0;
//        for(int i=0;i<a.length;i++){
//            for( int j=0;j<a.length;j++){
//                if (a[i]==a[j]){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.print(a[i]+" ");
//            }
//            count=0;
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив целостных чисел.
//        Метод должен вывести на экран уникальные элементы массива.




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int a[]=new int[n];
//        for (int i=0;i< a.length;i++) {
//            a[i] = in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        int max=a[0];
//        int min=a[0];
//        for(int i=0;i<a.length;i++){
//            if(max<a[i]){
//                max=a[i];
//                }
//            if(min>a[i]){
//                min=a[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив целостных чисел.
//        Выведите минимальный элемент и максимальный элемент массива.




//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a= in.nextInt();
//        int b= in.nextInt();
//        String operator = in.next();
//
//        metod(a,b,operator);
//    }
//    public static void metod(int a, int b, String operator) {
//        switch (operator){
//            case "+":
//                System.out.println(a+b);
//                break;
//            case "-":
//                System.out.println(a-b);
//                break;
//            case "*":
//                System.out.println(a*b);
//                break;
//            case "/":
//                if(b!=0) {
//                    System.out.println(a / b);
//                } else {
//                    System.out.println("ERROR! DELIT NA NULL NELZYA");
//                }
//                break;
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы 2 целостных чисел a и b, также знак оператора.
//        Программа должна вывести результат исходя от  арифметического оператора.





//package Ch7;
//
//import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int m= in.nextInt();
//        int a[][]= new int[n][m];
//        for (int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                a[i][j]= in.nextInt();
//            }
//        }
//        metod(a);
//    }
//    public static void metod(int a[][]) {
//         int max=0;
//        for(int i=0;i<a.length;i++){
//            max=a[i][0];
//            for (int j=0;j<a[i].length;j++){
//                if(max<a[i][j]){
//                    max=a[i][j];
//                }
//            }
//            System.out.println(max);
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы двумерный
//        массив размера NxM. Программа должна вывести максимальный элемент в каждой строке.


//package Ch7;
//
//        import java.util.Scanner;
//
//public class Ch7task {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int a[]= new int[n];
//        for (int i=0;i<n;i++){
//            a[i]= in.nextInt();
//        }
//        metod(a);
//    }
//    public static void metod(int a[]) {
//        for(int i=0;i<a.length;i++){
//            if (a[i]<50&&a[i]%5==0){
//                System.out.println(a[i]);
//            }
//        }
//    }
//}
//    Создайте такой метод, который принимает в аргументы массив из целых чисел.
//        Необходимо вывести элементы, которые одновременно меньше 50 и делятся на 5 без остатка.




package Ch7;

import java.util.Scanner;

public class Ch7task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        metod(a);
    }
    public static void metod(int a) {
        switch (a){
            case 12,1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("it is not a mounth number");
        }
    }
}
//Создайте такой метод, который принимает в аргументы
//        номер месяца и возвращает название сезона. (Winter, Spring, Summer, Autumn)