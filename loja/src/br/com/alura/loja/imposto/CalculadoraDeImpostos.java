package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.*;

public class CalculadoraDeImpostos {
	BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return  imposto.calcular(orcamento);
		
	}
}
