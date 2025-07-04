package org.lessons.java.animals;

public class Aquila extends Animale implements Volano {

    @Override
    public void verso() {
        System.out.println("Strido");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne cacciando");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }

}
