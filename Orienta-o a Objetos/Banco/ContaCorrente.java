package org.istep.javabasico.contacorrente;
import java.util.Arrays;
import java.util.Scanner;

public class ContaCorrente {

	private int indiceProximaMovimentacao;
	private long numero;
	private int digito;
	private double saldo;
	private boolean especial;
	private double limite;
	private Movimentacao[] movimentacoes;
	
	public ContaCorrente(long numero, int digito, boolean especial, double limite) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.especial = especial;
		this.limite = limite;
		this.saldo = 0.0;
		this.movimentacoes = new Movimentacao[1000];
		this.indiceProximaMovimentacao = 0;
	}

	public ContaCorrente() {
		load();
		saldo = 0.0;
		movimentacoes = new Movimentacao[1000];
		this.indiceProximaMovimentacao = 0;
	}

	public void incluirMovimentacao(Movimentacao novaMovimentacao) {
		this.movimentacoes[indiceProximaMovimentacao] = novaMovimentacao;
		indiceProximaMovimentacao++;
		if (novaMovimentacao.debitoCredito == 'D') {
			this.saldo -= novaMovimentacao.valor;
		}else if (novaMovimentacao.debitoCredito == 'C');
		    this.saldo += novaMovimentacao.valor;
	}

	private void load() {
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Numero: ");
		numero = leitorTeclado.nextInt();
		System.out.println("Dígito: ");
		digito = leitorTeclado.nextInt();
		System.out.println("Especial: ");
		especial = leitorTeclado.nextBoolean();
		System.out.println("Limite: ");
		limite = leitorTeclado.nextDouble();

		leitorTeclado.close();
	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "ContaCorrente [indiceProximaMovimentacao=" + indiceProximaMovimentacao + ", numero=" + numero
				+ ", digito=" + digito + ", saldo=" + saldo + ", especial=" + especial + ", limite=" + limite
				+ ", movimentacoes=" + Arrays.toString(movimentacoes) + "]";
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public long getNumero() {
		return numero;
	}

	public int getDigito() {
		return digito;
	}

	public double getSaldo() {
		return saldo;
	}

	public Movimentacao[] getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(Movimentacao[] movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
}
