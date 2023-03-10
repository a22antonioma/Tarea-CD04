package deposito;

/**
 * 
 * Esta clase define CCuenta y los metodos para operar con los datos de la misma
 * 
 * @author: a22antonioma
 * 
 * @version: 02/03/2023b
 * 
 * @see <https://github.com/a22antonioma</a>
 * 
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return double
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInteres
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * constructor generico de CCuenta
     */
    public CCuenta() {
    }

    /**
     * constructor con parametros para CCuenta.
     * 
     * @param nom  indica el nombre de la cuenta.
     * @param cue  indica el numero de cuenta.
     * @param sal  incida el saldo.
     * @param tipo indica el tipo de interes.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;

    }

    /**
     * @deprecated metodo redundante con getSaldo
     *             será borrado en la siguiente version.
     */
    @Deprecated(forRemoval = true)
    public double estado() {
        return saldo;
    }

    /**
     * ingresa una cantidad en el saldo
     * 
     * @param cantidad valor para retirar.
     * @throws Exception error si la varaiable cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retira una cantidad en el saldo
     * 
     * @param cantidad
     * @throws Exception da error si la cantidad introducida es negativa
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
