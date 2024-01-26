package be.vdab.hashset;

import java.util.HashSet;
import java.util.Set;

public class VBSet {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("fiets");
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
        hs.add("aap");
        hs.add(null);
        hs.add("dak");

        System.out.println("Voorbeelden van een HashSet:");
        for (String woord : hs) {
//            System.out.println(woord + "\t" + woord.hashCode());
            System.out.println(woord);
        }

    }
}
