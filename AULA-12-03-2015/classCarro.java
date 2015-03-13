public class Carro extends Automovel {
	private int quantidadePortas;
	
	public Carro() { }
		
	public Carro(String marca, String modelo, double motor, int aceleracao, int frenagem, int velocidadeMaxima, int quantidadePortas) {
		super(marca, modelo, motor, aceleracao, frenagem, velocidadeMaxima);
		this.setQuantidadePortas(quantidadePortas);
	}
	
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}
}
