package be.vdab.arraylist;

import java.util.ArrayList;
import java.util.List;

public class VBArrayList {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add("fiets");
        al.add(null);
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");
        al.add("boom");
        al.add("aap");
        System.out.println("4e element is: " + al.get(3));

        System.out.println("Voorbeeld van een ArrayList:");
        for (String woord : al) {
            System.out.println(woord);
        }

        System.out.println("\nWeergave m.b.v. iterator");
        for (var i = al.iterator(); i.hasNext(); ) {
            String woord = i.next();
            System.out.println(woord);
        }
    }
}
