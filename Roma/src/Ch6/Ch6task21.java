package Ch6;

import java.util.Scanner;

public class Ch6task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int count = 0;
        a = a.replaceAll("\\s+","");
        char[] array_char = a.toCharArray();
        for (int i = 0; i < a.length(); i++)
            if (!Character.isDigit(a.charAt(i))) {
                count = i;
            }
        String operator = new String(array_char,count,1);
        String b = new String(array_char,0, count);
        String c = new String(array_char, count+1, a.length()-count-1);
        int b1=Integer.parseInt(b);
        int c1 = Integer.parseInt(c);
        int itog = 0;
        switch (operator) {
            case "+":
                itog = b1 + c1;
                break;
            case "-":
                itog = b1 - c1;
                break;
            case "/":
                itog = b1 / c1;
                break;
            case "*":
                itog = b1 * c1;
                break;
        }
        System.out.println(itog);
    }
}
//    Сделайте некое подобие калькулятора который принимает два числа
//    и оператор(+, -, * , /) между ними в виде текста. Выведите на экран результат операции.