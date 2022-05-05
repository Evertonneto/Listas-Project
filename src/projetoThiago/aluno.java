package projetoThiago;

public class aluno {

	private int rgm;
	private String nome;
	private listaEncadeada disciplina;
	
	public aluno(String nome, int rgm, listaEncadeada diciplina){
		listaEncadeada materias = new listaEncadeada();
		materias = diciplina;
		setNome(nome); // recebe o nome de "Principal - new aluno" e armazena na estrutura 
		setRgm(rgm); // recebe o rgm de "Principal - new aluno" e armazena na estrutura 
		setDisciplina(materias);
	}
	
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public listaEncadeada getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(listaEncadeada materias) {
		this.disciplina = materias;
	}
	

}




