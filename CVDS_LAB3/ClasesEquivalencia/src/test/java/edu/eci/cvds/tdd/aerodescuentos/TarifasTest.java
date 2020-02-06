package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class TarifasTest 
{
    private CalculadoraDescuentos calculadora = new CalculadoraDescuentos();
	
    @Test
    public void ValidPrice(){
        long valor=0;
		try{
			valor = calculadora.calculoTarifa(2000,2,15);
		}catch (ExcepcionParametrosInvalidos e){
			
		}long rta = 1900;
		Assert.assertEquals(valor,rta);
    }
	
	@Test
	public void validAge65(){
		long valor = 0;
		try{
			valor = calculadora.calculoTarifa(2000,2,68);
		}catch(ExcepcionParametrosInvalidos e){
			
		}
		long rta = 1840;
		Assert.assertEquals(valor,rta);
	}
	
	@Test
	public void validAge18AndDays(){
		long valor = 0; 
		try{
			valor = calculadora.calculoTarifa(2000,20,20);
		} catch(ExcepcionParametrosInvalidos e){
			
		}
		long rta = 2000;
		Assert.assertEquals(valor,rta);
	}
	
	@Test
	public void notValidAge(){
		long valor = 0; 
		try{
			valor = calculadora.calculoTarifa(2000,20,-20);
		} catch(ExcepcionParametrosInvalidos e){
			valor=-1;
		}
		long rta = -1;
		Assert.assertEquals(valor,rta);
	}
	
	@Test
	public void notValidTarifa(){
		long valor = 0; 
		try{
			valor = calculadora.calculoTarifa(-2000,20,20);
		} catch(ExcepcionParametrosInvalidos e){
			valor=-2;
		}
		long rta = -2;
		Assert.assertEquals(valor,rta);
	}
	
	@Test
	public void notValidDays(){
		long valor = 0; 
		try{
			valor = calculadora.calculoTarifa(2000,-20,20);
		} catch(ExcepcionParametrosInvalidos e){
			valor=-3;
		}
		long rta = -3;
		Assert.assertEquals(valor,rta);
	}
	
}
