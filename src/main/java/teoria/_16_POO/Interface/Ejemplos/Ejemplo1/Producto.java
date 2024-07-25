package teoria._16_POO.Interface.Ejemplos.Ejemplo1;

public class Producto implements Tributable{

    private String nombre;
    private double valor;

    @Override
    public double getValorImpuesto() {
        return this.valor * 0.1;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {  
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}