package Ch6;

import java.util.Scanner;

public class Ch6task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(a.contains("zero")){
            a=a.replace("zero","0");
        }
        if(a.contains("one")){
            a=a.replace("one","1");
        }
        if(a.contains("two")){
            a=a.replace("two","2");
        }
        if(a.contains("three")){
            a=a.replace("three","3");
        }
        if(a.contains("four")){
            a=a.replace("four","4");
        }
        if(a.contains("five")){
            a=a.replace("five","5");
        }
        if(a.contains("six")){
            a=a.replace("six","6");
        }
        if(a.contains("seven")){
            a=a.replace("seven","7");
        } if(a.contains("eight")){
            a=a.replace("eight","8");
        } if(a.contains("nine")){
            a=a.replace("nine","9");
        }
        if(a.contains("Zero")){
            a=a.replace("Zero","0");
        }
        if(a.contains("One")){
            a=a.replace("One","1");
        }
        if(a.contains("Two")){
            a=a.replace("Two","2");
        }
        if(a.contains("Three")){
            a=a.replace("Three","3");
        }
        if(a.contains("Four")){
            a=a.replace("Four","4");
        }
        if(a.contains("Five")){
            a=a.replace("Five","5");
        }
        if(a.contains("Six")){
            a=a.replace("Six","6");
        }
        if(a.contains("Seven")){
            a=a.replace("Seven","7");
        } if(a.contains("Eight")){
            a=a.replace("Eight","8");
        } if(a.contains("Nine")){
            a=a.replace("Nine","9");
        }
        System.out.println(a);
    }
}
 //   Напишите программу которая заменяет цифры прописанные в текстовом виде на числовой формат.