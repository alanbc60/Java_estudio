package teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1;

public abstract class ElementoForm {

    public ElementoForm(String nombre, String valor) {   
        this.nombre = nombre;
        this.valor = valor;
        // this.validadores = new ArrayList<>();
        // this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre){
        this.nombre = nombre;
    }


    private String nombre;     
    private String valor;     
    // private List<String> validadores;
    // private List<String> errores;


    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }



    public abstract String dibujarHtml();
}
