import java.util.Date;

public class Funcionario extends Pessoa {

	private String codigo;
	private String contaCorrente;
	
	public Funcionario(Long id, String nome, String email, String telefone, Date dataNascimento, String codigo,
			String contaCorrente) {
		super(id, nome, email, telefone, dataNascimento);
		this.codigo = codigo;
		this.contaCorrente = contaCorrente;
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
	 * @return the contaCorrente
	 */
	public String getContaCorrente() {
		return contaCorrente;
	}
	/**
	 * @param contaCorrente the contaCorrente to set
	 */
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	
}
