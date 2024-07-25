package teoria._06_usoDeString.Ejercicios;

//Insertar una Subcadena en una Posición Específica
public class InsertarSubcadena {

//    public static void insertarSubcadena(String cadena, String subcadena, int pos){
//        String cadenaAux = "";
//        for (int i = 0; i < cadena.length() ; i++) {
//            if (i != pos){
//                cadenaAux+=cadena.charAt(i);
//            }
//            else{
//                cadenaAux += cadena.charAt(i);
//            }
//
//        }
//    }


    public static void main(String[] args) {

        StringBuffer stringBuffer =  new StringBuffer("Hola chavales");
        stringBuffer.insert( stringBuffer.length() , " como");
        stringBuffer.insert( stringBuffer.length() , " estan");
        System.out.println("Cadena: "+stringBuffer);
    }


}
