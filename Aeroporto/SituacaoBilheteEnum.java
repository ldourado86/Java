
public class SituacaoBilheteEnum {

	private Long id;
	private String nome;
	
	//valores : 
	// 1.disponivel
	// 2.reservado
	// 3.vendido
		
	public SituacaoBilheteEnum(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
