package teoria._01_variablesTiposDatos.ClasesEnvolventes;

public class ClasesEnvolventes {
    public static void main(String[] args) {
        // Autoboxing
        Integer intObj = 10;  // int a Integer automáticamente
        Double doubleObj = 3.14;  // double a Double automáticamente

        // Unboxing
        int intValue = intObj;  // Integer a int automáticamente
        double doubleValue = doubleObj;  // Double a double automáticamente

        // Métodos de conversión

        //  String a int
        String str = "123";
        int convertedInt = Integer.parseInt(str);  // Convertir String a int

        //  int a String
        int intToConvert = 123;
        String convertedStr = Integer.toString(intToConvert);  // Convertir int a String
        

        //  String a double
        String doubleStr = "3.14";
        double convertedDouble = Double.parseDouble(doubleStr);  // Convertir String a double

        //  double a String
        double doubleToConvert = 3.14;
        String convertedDoubleStr = Double.toString(doubleToConvert);  // Convertir double a String

        // String a boolean
        String boolStr = "true";
        boolean convertedBool = Boolean.parseBoolean(boolStr);  // Convertir String a boolean

        //  boolean a String
        boolean boolToConvert = true;
        String convertedBoolStr = Boolean.toString(boolToConvert);  // Convertir boolean a String


        // Uso de constantes
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Comparación
        int compareResult = Integer.compare(10, 20);

        // Impresión de resultados
        System.out.println("intObj: " + intObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("convertedInt: " + convertedInt);
        System.out.println("convertedStr: " + convertedStr);
        System.out.println("convertedDouble: " + convertedDouble);
        System.out.println("convertedDoubleStr: " + convertedDoubleStr);
        System.out.println("convertedBool: " + convertedBool);
        System.out.println("convertedBoolStr: " + convertedBoolStr);
        System.out.println("maxInt: " + maxInt);
        System.out.println("minInt: " + minInt);
        System.out.println("compareResult: " + compareResult);
    }
}
