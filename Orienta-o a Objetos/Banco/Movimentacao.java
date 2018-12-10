package org.istep.javabasico.contacorrente;

public class Movimentacao {

	String descricao;
	double valor;
	char debitoCredito;

	public Movimentacao() {
	}

	@Override
	public String toString() {
		return "Movimentacao [descricao=" + descricao + ", valor=" + valor + ", debitoCredito=" + debitoCredito + "]";
	}

    
}
