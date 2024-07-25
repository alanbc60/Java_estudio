package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoProtectedEnClaseAbstracta;

public class Cuadrado extends Figura {
    
    public Cuadrado(double base, double altura) {
        super(base, altura);
    }


    @Override 
    public double calcularPerimetro() {
        if(base != altura){
            return -1;
        }
        else{
            return (base * 4);
        }
    }
    
    @Override
    public double calcularArea() {
        if(base != altura){
            return -1;
        }
        else{
            return (base * base);
        }
    }
}
