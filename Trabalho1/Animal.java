package np1;

public class Animal {
    
    // Caracteristicas
    protected String nome;
    protected int comprimento;
    protected int patas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;
    
    // Construtores
    Animal() { }
    
    Animal(String nome, int comprimento, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
    }
    
    Animal(String nome, String cor, int comprimento, double velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }
    
    Animal(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }
    
    // getters
    public String getNome() {
        return nome;
    }
    
    public int getComprimento() {
        return comprimento;
    }
        
    public int getPatas() {
        return patas;
    }
 
    public String getCor() {
        return cor;
    }
    
    public String getAmbiente() {
        return ambiente;
    }
 
    public double getVelocidade() {
        return velocidade;
    }
    
    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
        
    public void setPatas(int patas) {
        this.patas = patas;
    }
 
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
 
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    // function imprimir dados
    public void dados() {
        System.out.println("Dados deste animal: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Patas: " + getPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade: " + getVelocidade());
    }
}
