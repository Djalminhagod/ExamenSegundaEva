package examen;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

        ArrayList<Animal> perro = new ArrayList<>();
        ArrayList<Animal> gato = new ArrayList<>();
        perro.add(new Animal("pepe",3,"u332"));
        perro.add(new Animal("luna",13,"u99"));
        perro.add(new Animal("lara",4,"u67"));
        perro.add(new Animal("JOSE",1,"u69"));
        perro.add(new Animal("iker",1,"u0"));
        perro.add(new Animal("nico",4,"u67"));
        Refugio.admitirAnimal(perro);
        Refugio.mostrarAnimales(perro);

    }
}
