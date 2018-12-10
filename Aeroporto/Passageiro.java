import java.util.Date;

public class Passageiro extends Pessoa {

	private String documento;
	private String numeroCartao;

	public Passageiro(Long id, String nome, String email, String telefone, Date dataNascimento, String documento,
			String numeroCartao) {
		super(id, nome, email, telefone, dataNascimento);
		this.documento = documento;
		this.numeroCartao = numeroCartao;
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the numeroCartao
	 */
	public String getNumeroCartao() {
		return numeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
}
