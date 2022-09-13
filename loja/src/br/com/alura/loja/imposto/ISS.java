package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.*;

public class ISS implements Imposto {
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
		
	}
}
