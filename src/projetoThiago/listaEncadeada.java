package projetoThiago;


public class listaEncadeada {
	
	
	private materia primeiraMateria = null;
	private materia ultimaMateria = null;
	
	private int totalDeElementos = 0;
	
	
	public void adicionaNoComecoMateria(String disciplina, double nota) {
		
		materia nova = new materia(disciplina,nota, primeiraMateria);
		nova.setDisciplina(disciplina);
		nova.setNota(nota);
		this.primeiraMateria = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultimaMateria = this.primeiraMateria;
		}
		
		this.totalDeElementos++;	
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		
		materia atual = primeiraMateria;
		//Nota atual2 = primeiraMateria;
		
		
		StringBuilder builder = new StringBuilder("");
		
		for(int i = 0; i < totalDeElementos; i++) 
		{
			
			
			builder.append("-Disciplina: ");
			builder.append(atual.getDisciplina());
			builder.append(" | ");
			builder.append("Nota: ");
			builder.append(atual.getNota());
			builder.append("\n");
			
			
			atual = atual.getProximo();
			

		}
		builder.append("");
		
		return builder.toString();
	}
	
	public void adiciona(String disciplina, double nota) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComecoMateria(disciplina,nota);
		}
		else {
			materia nova = new materia(disciplina,nota, null);
			this.ultimaMateria.setProximo(nova);
			this.ultimaMateria = nova;
			this.totalDeElementos++;
		}
	}
	
	public void removeDoComeco() {
	    if(this.totalDeElementos == 0) {
	        throw new IllegalArgumentException("lista vazia");
	    }

	    this.primeiraMateria = this.primeiraMateria.getProximo();
	    this.totalDeElementos--;

	    if(this.totalDeElementos == 0) {
	        this.ultimaMateria = null;
	    }
	}
	

	/*public String getMateriadealuno() {
		return materiadealuno;
	}

	public void setMateriadealuno(String materiadealuno) {
		this.materiadealuno = materiadealuno;
	}*/

	
	
}
