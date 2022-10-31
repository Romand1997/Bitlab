package Ch4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4task26TrowStream {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer>e=new ArrayList<>();
        int size=in.nextInt();
        for(int i=0;i<size;i++){
            e.add(in.nextInt());
        }
        IntStream.range(0,size)
                .forEach(n-> System.out.print(e.get(size-n-1)+" "));
    }
}
