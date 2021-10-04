package builder;

//DEMO CLASS

import builder.constrConcreto.ConstructorPizzaHawaiana;
import builder.constrConcreto.ConstructorPizzaPicante;
import builder.director.Director;
import builder.producto.PizzaHawaiana;
import builder.producto.PizzaPicante;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("\nPIZZERIA____________________________________________\n");

        Director director = new Director();

        ConstructorPizzaHawaiana constrHawaiana = new ConstructorPizzaHawaiana();
        director.prepararPizzaHawaina(constrHawaiana);

        ConstructorPizzaPicante constrPicante = new ConstructorPizzaPicante();
        director.prepararPizzaPicante(constrPicante);

        PizzaHawaiana hawaiana = constrHawaiana.getProducto();
        System.out.println("PIZZA HAWAIANA:\n" + hawaiana.imprimir());

        PizzaPicante picante = constrPicante.getProducto();
        System.out.println("PIZZA PICANTE:\n" + picante.imprimir());

        System.out.println("__________________________________(builder patterns)\n");
    }

}
