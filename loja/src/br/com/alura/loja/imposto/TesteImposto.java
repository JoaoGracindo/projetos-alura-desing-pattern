package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.*;

public class TesteImposto {

	public static void main(String[] args) {
		Orcamento o = new Orcamento(new BigDecimal("100"));
		BigDecimal valorImposto = new ICMS().calcular(o);
		
		System.out.println(valorImposto);

		BigDecimal valorISS = new ISS().calcular(o);
		
		System.out.println(valorISS);
	}

}
