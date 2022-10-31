package Other;

import java.util.ArrayList;

public class Other8 {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");
        list.stream()
                .map(element-> element.length())
                .forEach(s-> System.out.println(s));
    }
}
