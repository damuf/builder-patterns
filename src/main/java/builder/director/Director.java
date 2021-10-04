package builder.director;

import builder.interfaz.Constructor;

public class Director {

    public void prepararPizzaHawaina(Constructor constructor){
        constructor.setPorciones(8);
        constructor.setMasa("tradicional");
        constructor.setSalsa("napolitana");
        constructor.setToppings("piña + jamón + mozzarella + orégano");
    }

    public void prepararPizzaPicante(Constructor constructor){
        constructor.setPorciones(4);
        constructor.setMasa("delgada");
        constructor.setSalsa("extra picante");
        constructor.setToppings("chile verde + parmesano + cebolla + hongos");
    }

}
