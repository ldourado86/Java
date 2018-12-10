import java.util.Date;

public class Horario {

	private Long id;
	private Date partida;
	private Date chegada;
	private Integer qtdEconomnica;
	private Integer qtdPrimeira;
	private Integer qtdExecutiva;
	
	
	public Horario(Long id, Date partida, Date chegada, Integer qtdEconomnica, Integer qtdPrimeira,
			Integer qtdExecutiva) {
		super();
		this.id = id;
		this.partida = partida;
		this.chegada = chegada;
		this.qtdEconomnica = qtdEconomnica;
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
	 * @return the partida
	 */
	public Date getPartida() {
		return partida;
	}
	/**
	 * @param partida the partida to set
	 */
	public void setPartida(Date partida) {
		this.partida = partida;
	}
	/**
	 * @return the chegada
	 */
	public Date getChegada() {
		return chegada;
	}
	/**
	 * @param chegada the chegada to set
	 */
	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}
	/**
	 * @return the qtdEconomnica
	 */
	public int getQtdEconomnica() {
		return qtdEconomnica;
	}
	/**
	 * @param qtdEconomnica the qtdEconomnica to set
	 */
	public void setQtdEconomnica(int qtdEconomnica) {
		this.qtdEconomnica = qtdEconomnica;
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
