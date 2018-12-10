
public class Aviao {
	
	private Long id;
	private String codigo;
	private double carga;
	private int qtdEconomica;
	private int qtdPrimeira;
	private int qtdExecutiva;
	
	public Aviao(Long id, String codigo, double carga, int qtdEconomica, int qtdPrimeira, int qtdExecutiva) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.carga = carga;
		this.qtdEconomica = qtdEconomica;
		this.qtdPrimeira = qtdPrimeira;
		this.qtdExecutiva = qtdExecutiva;
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}
	/**
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	/**
	 * @return the qtdEconomica
	 */
	public int getQtdEconomica() {
		return qtdEconomica;
	}
	/**
	 * @param qtdEconomica the qtdEconomica to set
	 */
	public void setQtdEconomica(int qtdEconomica) {
		this.qtdEconomica = qtdEconomica;
	}
	/**
	 * @return the qtdPrimeira
	 */
	public int getQtdPrimeira() {
		return qtdPrimeira;
	}
	/**
	 * @param qtdPrimeira the qtdPrimeira to set
	 */
	public void setQtdPrimeira(int qtdPrimeira) {
		this.qtdPrimeira = qtdPrimeira;
	}
	/**
	 * @return the qtdExecutiva
	 */
	public int getQtdExecutiva() {
		return qtdExecutiva;
	}
	/**
	 * @param qtdExecutiva the qtdExecutiva to set
	 */
	public void setQtdExecutiva(int qtdExecutiva) {
		this.qtdExecutiva = qtdExecutiva;
	}
	
	
	
	
	
}
