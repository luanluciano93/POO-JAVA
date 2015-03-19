public class newAluno {

	private int ra;
	private String nome;
	private String dataNasc;
	private int anoEntrada;

	public newAluno() {}

	public newAluno(int ra, String nome, String dataNasc, int anoEntrada) {
		this.ra = ra;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.anoEntrada = anoEntrada;
	}

	public int getRA() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setRA(int newRA) {
		ra = newRA;
	}

	public void setNome(String newNome) {
		nome = newNome;
	}

	public void setDataNasc(String newDataNasc) {
		dataNasc = newDataNasc;
	}

	public void setAnoEntrada(int newAnoEntrada) {
		anoEntrada = newAnoEntrada;
	}
}
