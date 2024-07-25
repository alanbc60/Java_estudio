package teoria._16_POO.PilaresProgramacion.Herencia.Ejercicios.Ejercicio1PersonasCompañia;

public class Cliente extends Persona{
    private int clienteID;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteID ){
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteID = clienteID;
    }

    public int getClienteID() {
        return clienteID;
    }
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    @Override
    public String toString() {        
        return super.toString() + "ID Cliente: "+ clienteID;
    }

}
