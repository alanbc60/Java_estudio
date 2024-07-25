package teoria._16_POO.Interface.Ejemplos.Ejemplo1;

public class Servicio implements Tributable{

    private String descripcion;
    private double valor;
    private double cuotaJubilacion;

    


    @Override
    public double getValorImpuesto() {
        return this.valor * this.cuotaJubilacion / 100;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCuotaJubilacion() {
        return cuotaJubilacion;
    }


    public void setCuotaJubilacion(double cuotaJubilacion) {
        this.cuotaJubilacion = cuotaJubilacion;
    }

    //getters y setters
}