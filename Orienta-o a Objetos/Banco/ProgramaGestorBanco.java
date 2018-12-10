package org.istep.javabasico.contacorrente.principal;

import org.istep.javabasico.contacorrente.Banco;

public class ProgramaGestorBanco {

	public static void main(String[] args) {

		Banco santanderro = new Banco();
		santanderro.criarContaCorrente(1, 332843, 4, 0.00, false, 0.00);
		santanderro.criarContaCorrente(2, 332234, 2, 0.00, true, 1000.00);
		santanderro.depositoContaCorrente(1, 600.00);
		santanderro.depositoContaCorrente(2, 800.00);
		santanderro.saqueContaCorrente(1, 200.00);
		santanderro.saqueContaCorrente(2, 200.00);
		
		santanderro.saldoContaCorrente(1);
		santanderro.saldoContaCorrente(2);
	
	 //   santanderro.extratoContaCorrente(1);
	    
	}

}
