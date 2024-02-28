package cuentas;

/**
 * Clase de una Cuenta Bancaria
 * @author eduar
 */
public class CCuenta {

	/**
	 * Las Variables declaradas
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    
    /**
     * 
     * @param nom Significado Nombre del dueño de la cuenta
     * @param cue Significado Identificado de la cuenta
     * @param sal Significado Saldo de la cuenta
     * @param tipo Significado Tipo de Interés
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Todos los atributos encapsulados
     * @return
     */
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCuenta() {
		return cuenta;
	}



	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getTipoInterés() {
		return tipoInterés;
	}



	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}



	public double estado()
    {
        return saldo;
    }

	/**
	 * La barrera para impedir que se pueda ingresar menos que 0
	 * @param cantidad 
	 * @throws Exception la cantidad no puede ser negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Aqui para que no se pueda retirar una cantidad negativa y tampoco si no tenga saldo positivo.
     * @param cantidad
     * @throws Exception la cantidad de saldo tiene que ser positiva si la hay y cantidad a retirar mayor que 0 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
