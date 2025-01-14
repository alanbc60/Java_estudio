package teoria._16_POO.Ejercicios.EjercicioFacturas;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura[] items;
    private int folio;
    private String descripcion;
    private Date fecha;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public ItemFactura[] getItems() {
        return items;   
    }

    public void setItems(ItemFactura[] items) {
        this.items = items;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double calcularTotal(){

    }

    public String verDetalle(){
        return "Cliente: " + cliente.getNombre()
        + "folio: " + this.folio 
    }
}
