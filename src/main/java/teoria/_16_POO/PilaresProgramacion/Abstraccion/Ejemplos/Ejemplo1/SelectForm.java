package teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1;

import java.util.List;

import teoria._16_POO.PilaresProgramacion.Abstraccion.Ejemplos.Ejemplo1.Select.Opcion;


public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre, String valor, List<Opcion> opciones) {
        super(nombre, valor);
        this.opciones = opciones;
    }

    public SelectForm(String nombre){
        super(nombre);
    }


    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }


    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("");

        sb.append("<select name=\"").append(this.getNombre()).append("\">");
        for(Opcion opcion:  this.opciones){
            sb.append("<option: ")
            .append("value=").append(this.getValor());
            if(opcion.isSelected())
                sb.append(" selected ");

            sb.append(">")
                //contenido de la opcion
                .append(opcion.getNombre())
            .append("</option>");
            
        }
        sb.append("</select>");
        return sb.toString();
        
    }
}
