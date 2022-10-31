package Ch4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch4task27ThrowStream {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Integer> e=new ArrayList<>();
        int size= in.nextInt();
        for (int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        int max=0;
        int min=0;
        max=e.stream().max(Integer::compareTo).get();
        min=e.stream().min(Integer::compareTo).get();
        int index=e.indexOf(min);
        e.set(e.indexOf(max),min);
        e.set(index,max);
        for(int i=0;i<size;i++) {
            System.out.print(e.get(i)+" ");
        }

       // e.stream().iterator(size-1, )
      //  IntStream.range(0,size)
//        Stream<Integer> reverse = e.remove();
//        reverse.forEach(System.out::println);
    }
}
//    Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//        Выведите в конце все элементы в обратном порядке.
//Stream.iterate(1, m -> m + 1