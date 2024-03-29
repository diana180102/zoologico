package app;

import modelClass.Mamifero;
import modelClass.caninos.Lobo;
import modelClass.caninos.Perro;
import modelClass.felinos.Guepardo;
import modelClass.felinos.Leon;
import modelClass.felinos.Tigre;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        Leon leon = new Leon(
                "Sabana y llanuras herbáceas",
                2F,
                160,
                125,
                "guepardo negro",
                1,
                60,
                15,
                2.5F);

        Guepardo guepardo = new Guepardo(
                "Bosques secos, matorrales",
                1.5F,
                65,
                75,
                "Acinonyx jubatus",
                3,
                70);

        Tigre tigre = new Tigre(
                "Bosques tropicales",
                2.30F,
                100F,
                110F,
                "Panthera tigris sumatrae",
                5,
                90,
                "Sumatra" );

        Lobo lobo = new Lobo(
                "Bosque",
                2F,
                130F,
                50F,
                "Canis lupus signatus",
                "manchas oscuras en sus patas delanteras ",
                4F,
                6,
                "LOBO IBÉRICO");

        Perro perro = new Perro(
                "Se encuentra en cualquier lugar",
                1.5F,
                50F,
                50F,
                "Canis lupus familiaris",
                "hay de variedad de colores",
                2F,
                32);




        List<Mamifero> animales = Arrays.asList(leon, guepardo, tigre,lobo);


           for (Mamifero m : animales){
               System.out.println(m.imprimir());
           }

    }
}
