package Ch4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4task24ThrowStream {
    static Boolean x;
    static int count;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>e= new ArrayList<>();
        int size=in.nextInt();

        for (int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        int m=in.nextInt();
        x = false;
        count=0;
        IntStream.range(0,size)
                .forEach(n->{
                    if(e.get(n)==m){
                        x = true;
                        count=n;
                    }
                });
        if (x) {
            System.out.println("YES");
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
       // int k=in.nextInt();

//               .max(Integer::compareTo).get();
//        System.out.println(x*x);



        // .forEach(n->System.out.print(n+" "));
       // static int x=1;
//        OptionalDouble sum = e.stream()
//                .mapToDouble((s) -> s)
//                .average();
//        Double xsum=sum.getAsDouble();
//        int result=e.stream()
//                .filter(s->s!=0)
//                .reduce(1,(a,b)->a*b);
//        System.out.println(result);

        //System.out.println((int)sum.getAsDouble());
//        OptionalDouble r= OptionalDouble.of(9.9);
//        System.out.println(r);
//        size=0;
//        int count=0;
//        for(int i:e){
//            size+=i;
//            count++;
//        }
//        System.out.println(size+" "+(double)size/count);
       // e.get(in.nextInt());

//        e.stream().
//                .forEach(System.out.print(n));

    }
}

 //  Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//  Программа должна вывести умножение элементов не равных 0 и c четным индексом.

