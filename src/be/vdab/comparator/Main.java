package be.vdab.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> fruit = new TreeSet<>(new DescendingComparator());
        fruit.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for (String stukFruit : fruit) {
            System.out.print(stukFruit + " ");
        }

        System.out.println();
        List<String> fruit2 = new ArrayList<>(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        fruit2.sort(new DescendingComparator());
        for (String stukfruit : fruit2) {
            System.out.println(stukfruit);
        }
    }
}
