package teoria._16_POO;

public class ReferenciaMismoObjeto {

    private double saldo;

    public static void main(String[] args) {

        ReferenciaMismoObjeto per1 = new ReferenciaMismoObjeto();
        per1.saldo = 100;

        ReferenciaMismoObjeto per2 = per1;
        per2.saldo = 200;

        // ambos hacen referencia al mismo objeto en la memoria

        System.out.println("Primera cuenta --> saldo: "+per1.saldo);
        System.out.println("Primera cuenta --> saldo: "+per2.saldo);
        per2.saldo+=400;

        System.out.println("Primera cuenta --> saldo: "+per1.saldo);
        System.out.println("Primera cuenta --> saldo: "+per2.saldo);
    }
}
