package Other;

import java.util.Scanner;

public class Other6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int na=in.nextInt();
        int nb=in.nextInt();
        int nc=in.nextInt();
        int nd=na+nb+nc;
        int a[]=new int[na];
        int b[]=new int[nb];
        int c[]=new int[nc];
        int d[]=new int[nd];
        for(int i=0;i<na;i++){
         a[i]=in.nextInt();
        }
        for(int i=0;i<nb;i++){
            b[i]=in.nextInt();
        }
        for(int i=0;i<nc;i++){
            c[i]=in.nextInt();
        }
        for(int i=0;i<na;i++){
            d[i]=a[i];
        }
        for(int i=0; i<nb;i++){
            d[i+na]=b[i];
        }
        for(int i=0; i<nc;i++){
            d[i+na+nb]=c[i];
        }
        int min=0;
        for(int i=0;i<nd;i++){
            for(int j=0;j<nd-1;j++){
                if (d[j] < d[j+1]){
                    min=d[j];
                    d[j]=d[j+1];
                    d[j+1]=min;
                }
            }
        }
        for(int i=0;i<nd;i++){
            System.out.print(d[i]+" ");
        }
    }
}

//    Даны три целочисленных массива A, B и C размера NA, NB, NC
//        соответственно, элементы которых упорядочены по убыванию.
//        Объединить эти массивы так, чтобы результирующий целочисленный массив D
//        (размера NA + NB + NC) остался упорядоченным по убыванию.
//        3
//        3
//        3
//        7 5 3
//        9 6 5
//        4 3 2