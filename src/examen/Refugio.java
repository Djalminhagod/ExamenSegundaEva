package examen;

import java.util.ArrayList;

public class Refugio {
    private ArrayList<Animal> animales;
    private static int capacidadMaxima=5;

    public Refugio(ArrayList<Animal> animales, int capacidadMaxima) {
        Refugio.capacidadMaxima = 5;
        Animal animal = new Animal();
    }


    public static void admitirAnimal(ArrayList<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            if (i < capacidadMaxima){
                Animal animal = animales.get(i);
                System.out.println("se añade animal "+animal.getNombre());
            }else{

                System.out.println("Capacidad agotada no se puede admitir a "+animales.get(i).getNombre());
            }

        }
    }
    public static void mostrarAnimales(ArrayList<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println("Animal: "+animales.get(i).getNombre()+" "+animales.get(i).getChip()+" "+animales.get(i).getChip());
        }
    }
    public static void hacerConcierto(ArrayList<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            animal.hacerSonido();

        }
    }
    public static void buscarPorEspecie(Animal animalReferencia) {

    }





}
