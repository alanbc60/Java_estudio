package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoPrivateEnClaseAbstracta;

public class Cuadrado extends Figura {
    
    private String color;

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }


    @Override 
    public double calcularPerimetro() {
        if( getBase() != getAltura()){
            return -1;
        }
        else{
            return ( getBase() * 4);
        }
    }
    
    @Override
    public double calcularArea() {
        if( getBase() != getAltura()){
            return -1;
        }
        else{
            return ( getBase() * getBase());
        }
    }

    // metodo propio de la clase Cuadrado
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }



    @Override
    public String toString() {  
        return "Cuadrado [base=" + getBase() + ", altura=" + getAltura() + ", color=" + getColor() + "]";
    }
}
