public class Caminhao extends Automovel {
	
	private int capacidadeCarga;
	private int quantidadeEixos;
	private double comprimento;
	private double altura;
	private String classificacaoCarga;

	public Caminhao() {}

	public Caminhao(String m, String m2, double m3, int a, int f, int vM, int cC, int qE, double c, double a2, String cC2) {
		super(m, m2, m3, a, f, vM);
		this.setCapacidadeCarga(cC);
		this.setQuantidadeEixos(qE);
		this.setComprimento(c);
		this.setAltura(a2);
		this.setClassificacaoCarga(cC2);
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return this.capacidadeCarga;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}

	public int getQuantidadeEixos() {
		return this.quantidadeEixos;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getComprimento() {
		return this.comprimento;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setClassificacaoCarga(String classificacaoCarga) {
		this.classificacaoCarga = classificacaoCarga;
	}

	public String getClassificacaoCarga() {
		return this.classificacaoCarga;
	}
}
