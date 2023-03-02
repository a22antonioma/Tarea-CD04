package deposito;

public class Main {
    /**
     * 
     * @author a22antonioma
     * @version 02/03/2023b
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.getSaldo();
        cantidad = 2300;
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, cantidad);
    }

    /**
     * @param cuenta1  objeto sobre el que trabajan los metodos.
     * @param cantidad define el valor a ingresar - retirar
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
