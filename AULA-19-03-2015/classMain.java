import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		ArrayList<newAluno> listaDeAlunos = new ArrayList<>();

		int x = 0;
                boolean cont = true;
                while (cont) {
                        System.out.println("Desenha se cadastrar: S/N");
                        String test = leitor.next();
                        
                        if (test == "N") {
                            cont = false;
                        } else {
                            System.out.println("\nCADASTRO ALUNO 1:");
                            leitor.nextLine();
                            
                            System.out.println("Digite seu nome: ");
                            String nome = leitor.nextLine();
                            
                            System.out.println("Digite sua data de nascimento: ");
                            String dataNasc = leitor.nextLine();
                            
                            System.out.println("Digite o ano que iniciou o faculdade: ");
                            int anoEntrada = leitor.nextInt();
                            
                            listaDeAlunos.add(new newAluno(x, nome, dataNasc, anoEntrada));
                            x++;
                        }
                }
		
		System.out.println("\n Quantidade de alunos na sala: " + listaDeAlunos.size() + ". \n");
		
                int y;
                for (y = 0; x <= y; y++) {
			System.out.println("RA: " + listaDeAlunos.get(y).getRA() + ", Aluno: " + listaDeAlunos.get(y).getNome() + ", Data Nascimento: " + listaDeAlunos.get(y).getDataNasc() + ", Ano de Entrada: " + listaDeAlunos.get(y).getAnoEntrada() + ".");
		}
	}    
}
