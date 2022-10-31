package Ch16_Stream;
import java.util.ArrayList;

import java.util.Collections;

import java.util.stream.Stream;
public class Ch16_Stream_task_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        Collections.addAll(names, "Ilyas", "Aybek", "Amanzhan", "Assylkhan", "Azamat");

        Stream<String> namesStream = names.stream();

        namesStream = namesStream.filter(s -> s.length() > 5);
    }
}




