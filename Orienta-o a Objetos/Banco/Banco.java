package org.istep.javabasico.contacorrente;

public class Banco {

	ContaCorrente conta1;
	ContaCorrente conta2;

	public void criarContaCorrente(int contador, long numero, int digito, double saldo, boolean especial,
			double limite) {
		if (contador == 1) {
			conta1 = new ContaCorrente(numero, digito, especial, limite);
		} else if (contador == 2) {
			conta2 = new ContaCorrente(numero, digito, especial, limite);
		}
	}

	public void excluirContaCorrente(int contador) {
		if (contador == 1) {
			conta1 = null;
		} else if (contador == 2) {
			conta2 = null;
		}
	}

	public void saqueContaCorrente(int contador, double valor) {
		Movimentacao saque = new Movimentacao();
		saque.debitoCredito = 'D';
		saque.descricao = "Saque no Caixa";
		saque.valor = valor;

		if (contador == 1) {
			if (conta1.getSaldo() + conta1.getLimite() >= valor) {
				conta1.incluirMovimentacao(saque);
			} else {
				System.out.println("Saldo inferior");
			}
		} else if (contador == 2) {
			if (conta2.getSaldo() + conta2.getLimite() >= valor) {
				conta2.incluirMovimentacao(saque);
			} else {
				System.out.println("Saldo inferior");
			}
		}
	}

	public void depositoContaCorrente(int contador, double valor) {
		Movimentacao deposito = new Movimentacao();
		deposito.debitoCredito = 'C';
		deposito.descricao = "Deposito no Caixa";
		deposito.valor = valor;

		if (contador == 1) {
			conta1.incluirMovimentacao(deposito);
			System.out.println("Deposito feito com sucesso.");
		} else if (contador == 2) {
			conta2.incluirMovimentacao(deposito);
			System.out.println("Deposito feito com sucesso.");
		}
	}

	public void saldoContaCorrente(int contador) {
		if (contador == 1) {
			conta1.print();
		} else if (contador == 2) {
			conta2.print();
		}
	}

	//public void extratoContaCorrente(int i) {
		
		
	//}
}
