package Ch4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch4task30TrowStream {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>e=new ArrayList<>();
        int size = in.nextInt();
        for (int i=0;i<size;i++){
            e.add(in.nextInt());
        }
                ArrayList<String>e1=e.stream()
                                .map(n->String.valueOf(n))
                                .collect(Collectors.toCollection(ArrayList::new));
                        String itog =e1.stream()
                        .reduce("",(a,b)->{
                            if(a.contains("-")&&!b.contains("-")||!a.contains("-")&&b.contains("-")){
                                return b;
                            } else return "NO";
                        });
        if (itog.equals("NO")){
        System.out.println(itog);
        }else System.out.println("YES");
    }
}
//    Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//        Программа должна проверить чередуются ли в нем положительные и отрицательные числа.
//        Если чередуются, то вывести YES, иначе NO.