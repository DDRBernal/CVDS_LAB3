package edu.eci.cvds.tdd.aerodescuentos;

/**
 * Hello world!
 *
 */
public class ExcepcionParametrosInvalidos extends Exception 
{
	
	public static final String EDAD_INVALIDA="La edad no puede ser negativa o mayor a 100";
	public static final String TARIFA_INVALIDA="La tarifa no puede ser 0 o negativa";
	public static final String DIAS_INVALIDOS="Los dias no pueden ser negativos";
	
    public ExcepcionParametrosInvalidos(String message){
		super(message);
	}
}
