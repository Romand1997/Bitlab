package Ch4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4task29ThrowStream {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> e=new ArrayList<>();
        int size= in.nextInt();
        for (int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        int first=e.indexOf(0);
        int second=e.lastIndexOf(0);
//        int sum=IntStream.range(first, second)
//                .reduce(0,(a,b)->e.get(a)+e.get(b));
       e.stream()
                .skip((first+1))
                .limit((second-first-1))    //НЕПРАВИЛЬНО РАБОТАЕТ СЧЕТЧИК!!!!
               .forEach(n-> System.out.print(n+" "));
             //  .reduce(0,(a,b)->a+b);
//        System.out.println(first);
//        System.out.println(second);
        //System.out.println(sum);

    }
}
//    Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//        Программа должна вывести сумму всех чисел которые находятся между нулями.