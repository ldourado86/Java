import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2};
		Integer[] intArray2 = {2,3};	
		
		Vetor<Double> vetores = new Vetor<Double>(new Double[] {2.0, 3.0,1.0}, new Double[]{3.0,4.0,2.0});
		// ou pode ser feito de outra maneira.
		//vetores.setVetor1(new Double[]{2.0,3.0,1.0});
		//vetores.setVetor2(new Double[] {3.0,4.0,1.0});
		
		System.out.println(vetores.produtoEscalar());
		
		
	}

}
