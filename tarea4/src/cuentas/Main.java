package cuentas;
public class Main {

	/**
	 * Inicia el metodo operativa_cuenta con el valor de 2500
	 * @param args
	 */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

    /**
     * 
     * @param cantidad
     */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        /**
         *  @param cuenta1 substituye CCuenta y se agregan los valores actuales y informaciones.
         *  @param nom = "Antonio López"
         *  @param cue = 1000-2365-85-1230456789
         *  @param sal = cantidad
         *  @param tipo = 0
         */
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        /**
         * Se muestra en la consola el mensaje "El saldo actual es" seguido del saldo actual.
         */
        System.out.println("El saldo actual es"+ saldoActual );
        
        /**
         * Se intenta retirar 2300 de la cuenta usando el método retirar del objeto cuenta1. 
         * Si se produce una excepción (por ejemplo, si el saldo es insuficiente), se imprime "Fallo al retirar".
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        /**
         * Se intenta ingresar 695 en la cuenta usando el método ingresar del objeto cuenta1.
         * Si se produce una excepción (por ejemplo, si la cantidad es negativa), se imprime "Fallo al ingresar".
         */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
	}
}
