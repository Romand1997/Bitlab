package Other;

import java.util.Scanner;

public class Other7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int count=1;
        int k = 0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                b[k] = count;
                c[k] = a[i];
                count = 1;
                k++;
            }
        }
        c[k] = a[n-1];
        b[k] = count;
        for(int i=0;i<n;i++) {
        //    if(b[i] != 0)
            System.out.print(b[i]+" ");
        }
        System.out.println("<-----massiv b ");
        for(int i=0;i<n;i++) {
         //   if(c[i] != 0)
                System.out.print(c[i]+" ");
        }
        System.out.println("<-----massiv c ");
    }
}

//    Дан целочисленный массив A размера N. Назовем серией группу
//        подряд идущих одинаковых элементов, а длиной серии — количество этих
//        элементов (длина серии может быть равна 1). Сформировать два новых
//        целочисленных массива B и C одинакового размера, записав в массив B
//        длины всех серий исходного массива, а в массив C — значения элементов,
//        образующих эти серии.
