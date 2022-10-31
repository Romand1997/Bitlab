package Ch4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch4task23ThrowStream {
    static int max;
    static int min;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size= in.nextInt();
        max=0;
        min=0;

        ArrayList<Integer> e=new ArrayList<>();
        for(int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        max=e.stream().max(Integer::compareTo).get();
        min=e.stream().min(Integer::compareTo).get();

        double x=e.stream()
                .filter(n->n!=max&&n!=min)
                .reduce(0,(a,b)->a+b);
        System.out.println((int)x);

    }
}
//    Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//        Выведите в конце максимальный элемент и его индекс.