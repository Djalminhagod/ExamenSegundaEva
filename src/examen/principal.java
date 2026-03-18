package examen;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("pepe",3,"u332","pitbull"));
        animales.add(new Gato("luna",13,"u99",true));
        animales.add(new Perro("lara",4,"u67","chiguagua"));
        animales.add(new Perro("JOSE",1,"u69","labrador"));
        animales.add(new Gato("iker",1,"u0",false));
        animales.add(new Perro("nico",4,"u67","caniche"));
        Refugio.admitirAnimal(animales);
        Refugio.mostrarAnimales(animales);
        Refugio.hacerConcierto(animales);


    }
}
