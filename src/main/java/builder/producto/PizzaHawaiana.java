package builder.producto;

public class PizzaHawaiana {

    //atributos
    private Integer porciones;
    private String masa;
    private String salsa;
    private String toppings;

    //constructor
    public PizzaHawaiana(Integer porciones, String masa, String salsa, String toppings) {
        this.porciones = porciones;
        this.masa = masa;
        this.salsa = salsa;
        this.toppings = toppings;
    }

    //setters
    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    //getters
    public Integer getPorciones() {
        return porciones;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getToppings() {
        return toppings;
    }

    //imprimir datos
    public String imprimir(){
        String info = "";
        info += "Número de porciones: " + porciones + "\n";
        info += "Tipo de masa: " + masa + "\n";
        info += "Tipo de salsa: " + salsa + "\n";
        info += "Toppings: " + toppings + "\n";
        return info;
    }

}
