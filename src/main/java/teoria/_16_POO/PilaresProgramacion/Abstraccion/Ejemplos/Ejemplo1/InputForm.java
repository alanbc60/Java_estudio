package teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1;

public class InputForm extends ElementoForm{
    
    private final String tipo = "input";     

    public InputForm(String nombre){
        super(nombre);
    }

    public InputForm(String nombre, String valor ) {
        super(nombre, valor);
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String dibujarHtml(){
        StringBuilder sb = new StringBuilder("<input");
        sb.append(" type=\"").append(this.getTipo()).append("\"");
        sb.append(" name=\"").append(this.getNombre()).append("\"");
        sb.append(" value=\"").append(this.getValor()).append("\"");
        sb.append("/>");
        return sb.toString();        
    }


}
