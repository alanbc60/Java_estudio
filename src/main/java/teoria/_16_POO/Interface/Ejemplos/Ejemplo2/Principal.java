package teoria._16_POO.Interface.Ejemplos.Ejemplo2;

public class Principal {

    public static void main(String[] args) {
        Payment paypal = new PayPalPayment();
        Payment creditCard = new CreditCardPayment();
        procesarPayment(paypal);
    }

    static void procesarPayment(Payment payment){
        System.out.println(payment.obtenerMetodoPago());
        payment.crearPayment();
    }

}
