package Ch6;
import java.util.Scanner;
public class Ch6task29Miras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();

        String newString="";

        while(s.indexOf("*")!=-1 || s.indexOf("/")!=-1){
            String[] words=s.split(" ");
            newString="";
            for(int i=0;i<words.length;i++){

                //words[i]  left operand
                //words[i+1] == * or /
                //words[i+2] right operand
                //words[i+3] next operator
                if(words[i+1].equals("*") || words[i+1].equals("/")){
                    int num=0;
                    if(words[i+1].equals("*")){
                        num=Integer.parseInt(words[i])*Integer.parseInt(words[i+2]);
                        System.out.println(num);
                    }
                    else{
                        num=Integer.parseInt(words[i])/Integer.parseInt(words[i+2]);
                    }
                    newString = newString + String.valueOf(num)+" ";
                    for(int j=i+3;j<words.length;j++){
                        newString=newString+words[j]+" ";
                    }
                    s=newString;
                    //System.out.println(s);
                    break;
                }
                else{
                    // adds word to string newString
                    newString=newString+words[i]+" ";
                }
            }
        }
        int result=0;
        String[] a = s.split(" ");
        for(int i=0;i<a.length;i++){
            if(i==0) result=result+Integer.parseInt(a[0]);
            else {
                if(a[i-1].equals("+")) result = result+ Integer.parseInt(a[i]);
                if(a[i-1].equals("-")) result = result- Integer.parseInt(a[i]);
            }
        }
        //System.out.println("Final res: "+ result);
        System.out.println(result);
    }
}

