package Ch4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Ch4task28ThrowStream {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Integer>e=new ArrayList<>();
        int size= in.nextInt();
        for (int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        ArrayList<Integer>result =e.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
                result.forEach(m->System.out.print(m+" "));
//НАДО СОЗДАТЬ МАССИВ С ЭТИМИ ЗНАЧЕНИЯМИ
    }
}
