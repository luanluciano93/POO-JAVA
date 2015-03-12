public class Automovel {
    private String marca;
    private String modelo;
    private double motor;
    private int aceleracao;
    private int frenagem;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Automovel() { }
    
    public Automovel(String marca, String modelo, double motor, int aceleracao, int frenagem, int velocidadeMaxima) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setMotor(motor);
        this.setAceleracao(aceleracao);
        this.setFrenagem(frenagem);
        this.setVelocidadeMaxima(velocidadeMaxima);
    }    
    
    public void acelerar() {        
        this.setVelocidadeAtual(this.getVelocidadeAtual() + this.getAceleracao());
    }
    
    public void frear() {
        this.setVelocidadeAtual(this.getVelocidadeAtual() - this.getFrenagem());
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getFrenagem() {
        return frenagem;
    }

    public void setFrenagem(int frenagem) {
        this.frenagem = frenagem;
    }

    public int getVelocidadeAtual() {        
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) { 
        // velocidade Maxima = 200
        // aceleracao = 20
        // velocidade atual anterior 190 (190 + 20 = 210)
        if(velocidadeAtual >= this.getVelocidadeMaxima()) {
            velocidadeAtual = this.getVelocidadeMaxima();
            System.err.println("O carro está na velocidade máxima de " + this.getVelocidadeMaxima() + "km/h!");            
        }
        else if(velocidadeAtual <= 0) {
            velocidadeAtual = 0;
            System.err.println("O carro está parado!");
        }
        else {
            System.out.println("Velocidade atual de " + velocidadeAtual + "km/h...");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
