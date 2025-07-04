package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotano {

    @Override
    public void verso() {
        System.out.println("Frigge");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia i pesciolini");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }

}
