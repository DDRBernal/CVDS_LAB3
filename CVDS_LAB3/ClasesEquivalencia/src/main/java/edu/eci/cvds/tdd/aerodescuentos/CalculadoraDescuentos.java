package edu.eci.cvds.tdd.aerodescuentos;
//import edu.eci.cvds.tdd.registry.*;

/**
 * Hello world!
 *
 */
public class CalculadoraDescuentos
{
	
    public CalculadoraDescuentos(){
		
	}
	
	public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad) throws ExcepcionParametrosInvalidos{
		if (tarifaBase<=0) throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.TARIFA_INVALIDA);
		if (diasAntelacion<0) throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.DIAS_INVALIDOS);
		if (edad<0 || edad>100) throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.EDAD_INVALIDA);
		if (diasAntelacion>20) tarifaBase-=(tarifaBase*0.15);
		if (edad<18) tarifaBase-=(tarifaBase*0.05);
		if (edad>65) tarifaBase-=(tarifaBase*0.08);
		return tarifaBase;
		
	}
}

