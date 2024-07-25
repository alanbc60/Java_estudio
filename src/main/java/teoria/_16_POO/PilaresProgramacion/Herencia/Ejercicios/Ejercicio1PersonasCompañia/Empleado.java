package teoria._16_POO.PilaresProgramacion.Herencia.Ejercicios.Ejercicio1PersonasCompañia;

public class Empleado extends Persona{
    
    private double remuneracion;
    private int empleadoid;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoid ){
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoid = empleadoid;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;
    }


    public void  aumentarRemuneracion(int porcentaje){
        double aumento = this.remuneracion * porcentaje;
        this.remuneracion = remuneracion + aumento;
    }

    @Override
    public String toString() {
        
        return super.toString() + "ID empleado: "+ empleadoid + "remuneracion: " +remuneracion ;
    }


}
