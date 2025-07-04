package org.lessons.java.animals;

public class Passerotto extends Animale{

    @Override
    public void verso() {
        System.out.println("Cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia piccoli insetti");
    }

}
