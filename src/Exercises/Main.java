package Exercises;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        for (String s : tree){
            System.out.println(s);
        }
    }


}
