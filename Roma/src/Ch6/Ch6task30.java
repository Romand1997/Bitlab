package Ch6;

import java.util.Scanner;

public class Ch6task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b="";
        String c="";
        String arr[]=a.split("\\s");
        for (int i=0;i<arr.length;i++){
            for (int j=arr[i].length()-1; j<=0;j++){
                b+=a.charAt(i);
            }
            c+=b;
        }
        System.out.println(c);
    }
}

  //  Напишите программу которая прописывает каждое слово в тексте в обратном порядке.