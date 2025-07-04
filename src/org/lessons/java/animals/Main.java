package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {

        Aquila aquila = new Aquila();
        Cane cane = new Cane();
        Delfino delfino = new Delfino();
        Passerotto passero = new Passerotto();

        System.out.println("L'aquila: ");
        aquila.dormi();
        aquila.mangia();
        aquila.verso();

        System.out.println();

        System.out.println("Il cane: ");
        cane.dormi();
        cane.mangia();
        cane.verso();

        System.out.println();

        System.out.println("Il delfino: ");
        delfino.dormi();
        delfino.mangia();
        delfino.verso();

        System.out.println();

        System.out.println("Il passerotto: ");
        passero.dormi();
        passero.mangia();
        passero.verso();

    }
}
