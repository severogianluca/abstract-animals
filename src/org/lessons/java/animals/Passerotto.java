package org.lessons.java.animals;

public class Passerotto extends Animale implements Volano {

    @Override
    public void verso() {
        System.out.println("Cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia piccoli insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
