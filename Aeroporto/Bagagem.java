
public class Bagagem {
	private Long id;
	private double peso;
	
	
	
	public Bagagem(Long id, double peso) {
		super();
		this.id = id;
		this.peso = peso;
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
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
