package be.vdab.cursus;

import java.util.Objects;

public class Cursus implements Comparable<Cursus>{

    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int cursusNr, String cursusNaam, int prijs) {
        setCursusNr(cursusNr);
        setCursusNaam(cursusNaam);
        setPrijs(prijs);
    }

    public int getCursusNr() {
        return cursusNr;
    }

    public final void setCursusNr(int cursusNr) {
        if (cursusNr > 0) {
            this.cursusNr = cursusNr;
        }
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public final void setCursusNaam(String cursusNaam) {
        Objects.requireNonNull(cursusNaam);
        if (!(cursusNaam.trim().isBlank())) {
            this.cursusNaam = cursusNaam;
        }

    }

    public int getPrijs() {
        return prijs;
    }

    public final void setPrijs(int prijs) {
        if (prijs > 0) {
            this.prijs = prijs;
        }
    }

    @Override
    public String toString() {
        return cursusNr + " ; " + cursusNaam + " ; " + prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus cursus)) {
            return false;
        }
        return cursusNr == cursus.cursusNr;
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
    public int compareTo(Cursus c) {
//        return cursusNr - c.getCursusNr();
        if (this.equals(c)) {
            return 0;
        } else {
            return prijs <= c.getPrijs() ? -1 : prijs - c.getPrijs();
        }
    }
}
