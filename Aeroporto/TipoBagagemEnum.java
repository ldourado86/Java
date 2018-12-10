
public class TipoBagagemEnum {
	
	private Long id;
	private String nome;
	private double pesoMax;
	
	//Valores : 
	// 1.mao,5.0
	// 2.nacional,23.0
	// 3.internacional,32.0
	
	public TipoBagagemEnum(Long id, String nome, double pesoMax) {
		super();
		this.id = id;
		this.nome = nome;
		this.pesoMax = pesoMax;
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

	/**
	 * @return the pesoMax
	 */
	public double getPesoMax() {
		return pesoMax;
	}

	/**
	 * @param pesoMax the pesoMax to set
	 */
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}
	
	
	
	
}
