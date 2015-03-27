package np1;

public class TesteAnimais {
    
    public static void main(String[] args) {
    
        Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Plantas", 300, 1, 4);
        camelo.dados();
        
        System.out.println("");
        
        Peixe tubarao = new Peixe("Tubarao", "Carnivoro", 150, 5.5);
        tubarao.dados();
        
        System.out.println("");
        
        Mamifero urso = new Mamifero("Urso do Canada", "Marrom", "Mel", 180, 3.2, 4);
        urso.dados();
    }
}
