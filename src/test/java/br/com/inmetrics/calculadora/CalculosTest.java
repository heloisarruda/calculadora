package br.com.inmetrics.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CalculosTest {
	
	Operacoes operacoes = new Operacoes();
	
	@Before
	public void header(){
		System.out.println("Calculadora Inmetrics");
	}
	
	@Test
	public void testCalcularSoma()  {
		double a = 3.0;
		double b = 4.0;
		boolean hasValue = false;
		
		double resultado = operacoes.somar(a, b);
		
		System.out.println("Operação: " + a + "+" + b + "=" + resultado);
		
		if(hasValue)
		Assert.assertEquals(7.0, resultado, 0);
		
	}
	
	@After
	public void finalize(){
		System.out.println("Essa calculadora foi criada por especialistas");
	}
	
   
}
