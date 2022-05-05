package projetoThiago;


public class listaSequencial {
	

	aluno [] estudante = new aluno[60];
	int tamanho = 0;
	
	
	
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	
	public boolean estaCheia() {
		return (tamanho == estudante.length);
	}
	public void mostraAluno() {
		if ( estaVazia() )
			System.out.println("Não há nomes na lista");
		else {
			System.out.println("|--------------------|");
			System.out.println("|   ALUNO INSERIDO   |");
			System.out.println("|--------------------|");
			
			System.out.println("\tRGM:" + estudante[tamanho-1].getRgm());
			System.out.println("\tNome:" + estudante[tamanho-1].getNome());
			System.out.println(estudante[tamanho-1].getDisciplina() + "\n");
				
			}
		}
	
	public void mostraAlunos() {
		
		if ( estaVazia() )
			System.out.println("Não há nomes na lista");
		else {
			System.out.println("|--------------------|");
			System.out.println("|\tALUNOS\t     |");
			System.out.println("|--------------------|");
			for (int i = 0; i < tamanho; i++) {
				System.out.println("\tRGM:" + estudante[i].getRgm());
				System.out.println("\tNome:" + estudante[i].getNome());
				System.out.println(estudante[i].getDisciplina() + "\n");
				
			}
		}
	}

	
	void inserirAluno(aluno novoAluno ) {
		
		if ( estaCheia()) {
			System.out.println("A lista está cheia");
		
		}
		else{
			
			this.estudante[tamanho] = novoAluno;
			tamanho++;
			System.out.println("Aluno cadastrado!\n\n");
		}
	}
	
	
	
		
	
	public void excluirAluno(int chave) {
		for(int i = 0; i < tamanho; i++) {
 			if(estudante[i].getRgm() == chave) {
 				
 			int posicao = i;
 				for( i = posicao;i<tamanho; i++) {
			this.estudante[i]=this.estudante[i+1];
 				}
		}
		}
		tamanho--;
		System.out.println("Aluno excluido!");

	}

 	public void buscaRGM(int chave) {

 		for(int i = 0; i < tamanho; i++) {
 			if(estudante[i].getRgm() == chave) {
 				System.out.println("|--------------------|");
 				System.out.println("|  ALUNO ENCONTRADO  |");
 				System.out.println("|--------------------|");
 				System.out.println("\nNome:\t" + estudante[i].getNome() + "\n");
 				System.out.println(estudante[i].getDisciplina() + "\n");
 				return;
 			}
 		}
 		System.out.println("Aluno não existe\n");
 	}
	
	
	
	
}
