package chapterfive.exercises;

import java.util.HashSet;
import java.util.Set;

public class CollectionsEx {
    public static void main(String[] args) {

        String[] names = {"name", "name", "test", "test", null};
        Set<String> set = new HashSet<>();


        set.add(names[0]);
        set.add(names[1]);
        set.add(names[2]);
        set.add(names[3]);
        set.add(names[4]);

        System.out.println(set);
    }
}
