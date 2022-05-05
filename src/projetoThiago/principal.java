package projetoThiago;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		aluno alunoNovo = new aluno(null, 0, null);
		listaSequencial lista = new listaSequencial();
		String disciplina;
		
		
		int opcao = 1;
		
		do {
			
			System.out.println("|--------------------|");
			System.out.println("|\t MENU\t     |");
			System.out.println("|--------------------|");
			System.out.println(" 1 - Inserir Aluno");
			System.out.println(" 2 - Buscar Aluno");
			System.out.println(" 3 - Exibir Alunos");
			System.out.println(" 4 - Excluir Aluno");
			System.out.println(" 5 - Sair");
			Scanner teclado = new Scanner (System.in);
			int escolha = teclado.nextInt();
			teclado.nextLine();
			
			switch(escolha) {
			case 1:// recebe nome,rgm, disciplinas e notas.
				System.out.println("Digite o nome do aluno ");
				String nome = teclado.nextLine();
				
				System.out.println("Digite o rgm do aluno ");
				int rgm = teclado.nextInt();
				
				listaEncadeada listaDisciplina = new listaEncadeada();
				String escolhaoutra = "";
				while(!escolhaoutra.equals("2")){
					
					System.out.println("Digite a disciplina ");
					disciplina = teclado.next();
					System.out.println("Digite a nota: ");
					double nota = teclado.nextDouble();
					
					listaDisciplina.adicionaNoComecoMateria(disciplina, nota);
					
					System.out.println("Deseja inserir outra materia? Sim [1] Não [2]");
					escolhaoutra = teclado.next();
					
					
				}
				
				alunoNovo = new aluno(nome, rgm, listaDisciplina);//armazena na variavel alunoNovo os dados inseridos pelo usuário;
				lista.inserirAluno(alunoNovo);// em seguida adiciona o aluno na lista sequencial;
				lista.mostraAluno();// metodo para exibir informações do aluno inserido
		
				break;
			
			case 2://Recebe rgm buscado pelo aluno e exibe informações do aluno, por meio do metodo buscaRGM();

				System.out.println("Digite o rgm do aluno que deseja buscar: ");
				int chave = teclado.nextInt();
				lista.buscaRGM(chave);
				
				
				break;
			case 3:// Utiliza do metodo mostraAlunos para exibir todos alunos e suas respectivas informações(nome,rgm,disciplinas e notas);

				lista.mostraAlunos();
				
				break;
			case 4:// Exclui aluno específico de acordo com rgm digitado, utiliza do metodo excluirAluno();

				System.out.println("Digite o rgm do aluno que deseja excluir: ");
				chave = teclado.nextInt();
				lista.excluirAluno(chave);
				
				break;
			case 5:// finaliza o while , logo finaliza o progama;
				opcao = 2;
				teclado.close();
				break;
			default:
				break;
				
			
			
			
			}
			
			
			
		}while(opcao == 1);	

	}

}
