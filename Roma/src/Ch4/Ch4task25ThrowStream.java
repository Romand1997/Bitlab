package Ch4;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Ch4task25ThrowStream {
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
        int m= in.nextInt();
        Double ma=e.stream()
                .filter(n->n>m)
                .mapToDouble(n->n)
                .average()
                .getAsDouble();
        System.out.println(ma);
//        min=e.stream()
//                .min(Integer::compareTo)
//                .get();
//        System.out.println(max-min);
    }
}
//    Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Затем мы вводим число m.
//        Программа должна вывести среднее значение всех элементов, которые больше m.