import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//A classe mais rapida � a HashSet, pois ultiliza Hashtable, por�m seus elementos n�o s�o ordenados.
//Isso faz com que essa classe s� seja indicada se voc� precisa apenas garantir a alta performance do programa,
//sem se importar  com a ordem dos elementos.

//List - Possui indexa��o, possui elementos repetidos 
//Set - N�o possui elementos repetidos,"equals". N�o possui indexa��o.
//ArrayList- Baixo desempenho em inser��o de elementos em posi��es espec�ficas.
//LinkedList-Melhor desempenho em inser��o de elementos em posi��es espec�ficas. 
//TreeSet -Organizado por compara��es definidas pelo programador ou default em caso de objetos do tipo String ou Integer, por exemplo.
//HashSet- � organizado por tabela de espalhamento,"hashcode".

public class ProgramaTeste_1528417070 {
	public static void main(String[] args) {
		Collection<Integer> colecao = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 10000;
		for (int i = 0; i < total; i++) {
			colecao.add(i);
		}
		for (int i = 0; i < total; i++) {
			if (!colecao.contains(i)) {
				System.out.println("ERRO");
			}
		}
		Iterator<Integer> iterador = colecao.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
		
	}
}
