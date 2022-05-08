package projetoThiago;

public class rgm {
	 private String aluno;

	    public rgm (String i) {
	        this.aluno = i;
	    }


	    public String getAluno() {
	        return aluno;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        rgm outro = (rgm) obj;
	        return outro.getAluno().equals(this.aluno);
	    }

	    @Override
	    public String toString() {
	        return aluno;
	    }
}
