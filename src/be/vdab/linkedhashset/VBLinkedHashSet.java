package be.vdab.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class VBLinkedHashSet {
    public static void main(String[] args) {

        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("fiets");
        lhs.add("even");
        lhs.add("dak"); lhs.add("citroen");
        lhs.add("boom");
        lhs.add("aap");
        lhs.add(null);
        lhs.add("dak");

        System.out.println("Voorbeeld van een LinkedHashSet: ");
        for (String woord : lhs) {
            System.out.println(woord);
        }

    }
}
