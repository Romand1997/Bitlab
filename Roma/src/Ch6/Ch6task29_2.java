package Ch6;

import java.util.Scanner;

public class Ch6task29_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        a=a+" + ";
        String a1[]=a.split("\\s");
        boolean flag= false;
        int itog = 0;
        String otvet="";
        for(int i=1;i<a1.length-1;i++){
            if (a1[i].equals("/")){
                if(flag){
                    itog=itog/Integer.parseInt(a1[i+1]);
                }
                else {
                    itog=Integer.parseInt(a1[i-1])/Integer.parseInt(a1[i+1]);
                    flag=true;
                }
            } else if (a1[i].equals("*")){
                if(flag){
                    itog=itog*Integer.parseInt(a1[i+1]);
                }
                else {
                    itog=Integer.parseInt(a1[i-1])*Integer.parseInt(a1[i+1]);
                    flag=true;
                }
            }
            else if (a1[i].equals("+")||a1[i].equals("-")){
                if(!flag){
                    otvet=otvet+a1[i-1]+" "+a1[i]+" ";
                } else{
                    otvet=otvet+String.valueOf(itog)+" "+a1[i]+" ";
                    flag=false;
                }
            }
        }
        if (a1[a1.length-1].equals("+")||a1[a1.length-1].equals("-")) {
            if (!flag) {
                otvet = otvet + a1[a1.length - 2]+" ";
            } else {
                otvet = otvet + String.valueOf(itog)+" ";
            }
        }
        System.out.println(otvet);
    }
}
