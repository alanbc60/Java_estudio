package teoria._16_POO.Interface.Ejemplos.Ejemplo2;

public class CreditCardPayment implements Payment{
    @Override
    public void crearPayment(){
        System.out.println("El método de pago creado es credit card");
    }

    @Override
    public String obtenerMetodoPago() {
        return "Credit card";
    }
}
