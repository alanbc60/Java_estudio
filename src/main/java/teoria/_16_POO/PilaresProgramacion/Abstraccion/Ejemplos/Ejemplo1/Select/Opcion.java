package teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1.Select;

public class Opcion {

    private String valor;
    private String nombre;
    private boolean selected;
    
    public Opcion(String valor, String nombre, boolean selected) {
        this.valor = valor;
        this.nombre = nombre;
        this.selected = selected;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }


    
}
