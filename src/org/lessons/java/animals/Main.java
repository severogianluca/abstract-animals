package org.lessons.java.animals;

public class Main {

    public static void faiVolare(Volano animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotano animale) {
        animale.nuota();
    }

    public static void main(String[] args) {

        Aquila aquila = new Aquila();
        Cane cane = new Cane();
        Delfino delfino = new Delfino();
        Passerotto passero = new Passerotto();

        // richiamo i metodi degli oggetti
        System.out.println("L'aquila: ");
        aquila.dormi();
        aquila.mangia();
        aquila.verso();
        aquila.vola();

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
        delfino.nuota();

        System.out.println();

        System.out.println("Il passerotto: ");
        passero.dormi();
        passero.mangia();
        passero.verso();
        passero.vola();

        System.out.println();
        // richiamo i metodi passati come parametri le interfacce
        System.out.println("Aquila che fai?");
        faiVolare(aquila);
        System.out.println("passero che fai?");
        faiVolare(passero);
        System.out.println("delfino che fai?");
        faiNuotare(delfino);

    }
}
