package teoria._16_POO.PilaresProgramacion.Herencia.Ejercicios.Ejercicio1PersonasCompañia;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoid, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoid);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    };


    @Override
    public String toString() {        
        return super.toString() + "presupuesto: "+ presupuesto;
    }
}
