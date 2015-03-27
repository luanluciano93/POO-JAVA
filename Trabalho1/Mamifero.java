package np1;

public class Mamifero extends Animal{
    
    // Caracteristicas  
    private String alimento;

    // Construtores
    Mamifero() {}
    
    Mamifero(String nome, String cor, String alimento, int comprimento, double velocidade, int patas) {
        super(nome, cor, comprimento, velocidade, patas);    
        this.alimento = alimento;
    }
    
    // getters  
    public String getAlimento() {
        return alimento;
    }
    
    // setters
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    // function imprimir dados
    public void dados() {
        System.out.println("Dados deste Mamifero: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Patas: " + getPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Alimento: " + getAlimento());
    }
}
