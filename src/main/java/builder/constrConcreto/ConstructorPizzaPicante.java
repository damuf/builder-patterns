package builder.constrConcreto;

import builder.interfaz.Constructor;
import builder.producto.PizzaPicante;

public class ConstructorPizzaPicante implements Constructor {

    Integer porciones = 0;
    private String masa = "";
    private String salsa = "";
    private String toppings = "";

    @Override
    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
    }

    @Override
    public void setMasa(String masa) {
        this.masa = masa;
    }

    @Override
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    @Override
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public PizzaPicante getProducto(){
        return new PizzaPicante(porciones, masa, salsa, toppings);
    }

}
