package projetoThiago;

public class materia {
	
	private String disciplina;
	private double nota;
	private materia proximo;
	

	public materia(String disciplina,double nota2, materia proximo) {
		this.disciplina = disciplina;
		this.nota = nota2;
		this.proximo = proximo;
		
	}
	
	public materia getProximo() {
		return proximo;
	}
	public void setProximo(materia proximo) {
		this.proximo = proximo;
	}

	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}