package np1;

public class Peixe extends Animal{
    
    // Caracteristicas  
    private String caracteristica;
    
    // Construtores
    Peixe() {}
    
    Peixe(String nome, String caracteristica, int comprimento, double velocidade) {
        super(nome, comprimento, velocidade);    
        this.caracteristica = caracteristica;
    }
    
    // getters  
    public String getCaracteristica() {
        return caracteristica;
    }
    
    // setters
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    // function imprimir dados
    public void dados() {
        System.out.println("Dados deste Peixe: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Caracteristica: " + getCaracteristica());
    }
}
