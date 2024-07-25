package teoria._16_POO.Interface.Ejemplos.Ejemplo2;

public class PayPalPayment implements Payment {

    @Override
    public void crearPayment(){
        System.out.println("El método de pago creado es PayPal");
    }

    @Override
    public String obtenerMetodoPago() {
        return "Paypal";
    }
}
