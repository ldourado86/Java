
public abstract class Bilhete {

	private long id;
	private Integer numnero;
	private String assento;
		
	public void reservar(Passageiro Passageiro){
		
	}
	
	public void comprar(){
		
	}

	public void cancelarReserva(){
		
	}
	
	public void checkin(Bagagem Bagagem){
		
	}
	
	protected abstract Integer maximoBagagens();
		

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the numnero
	 */
	public int getNumnero() {
		return numnero;
	}

	/**
	 * @param numnero the numnero to set
	 */
	public void setNumnero(int numnero) {
		this.numnero = numnero;
	}

	/**
	 * @return the assento
	 */
	public String getAssento() {
		return assento;
	}

	/**
	 * @param assento the assento to set
	 */
	public void setAssento(String assento) {
		this.assento = assento;
	}

	
	
	
	
}
