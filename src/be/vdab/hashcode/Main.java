package be.vdab.hashcode;

public class Main {
    public static void main(String[] args) {

        String tekst = "auto";
        System.out.println(tekst + "hashcode: " + tekst.hashCode());

        tekst = "huis";
        System.out.println(tekst + "hashcode: " + tekst.hashCode());
    }
}
