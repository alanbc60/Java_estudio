package teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1;

public class TextAreaForm extends ElementoForm {
    private int filas;
    private int columnas;
    
    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }


    public TextAreaForm(String nombre, String valor, int filas, int columnas) {
        super(nombre, valor);
        this.filas = filas;
        this.columnas = columnas;
    }

    




    @Override
    public String dibujarHtml() {
        return "<textarea name=\"" + this.getNombre() 
            + "\" rows=\"" + this.filas + "\" cols=\"" 
            + this.columnas + "\">" 
            + this.getValor() + "</textarea>";
    }
    
}
