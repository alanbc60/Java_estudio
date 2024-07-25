package teoria._16_POO.Ejercicios.EjercicioFacturas;

public class ItemFactura {

    private Producto producto;
    private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }


    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularImporte(){
        return producto.getPrecio() * cantidad;
    }


}




