package model;


public class Professor extends Pessoa implements SistemaEscolar {

	//private Turma turma<List>;

	private String senhaProfessor;

	
	public Professor(Turma turma, String senhaProfessor) {
		super();
		//this.turma = turma; // ???
		setSenhaProfessor (senhaProfessor);
	}


	public String getSenhaProfessor() {
		return senhaProfessor;
	}



	public void setSenhaProfessor(String senhaProfessor) {
		if(!senhaProfessor.isEmpty()){
			this.senhaProfessor = senhaProfessor;
		}else {
			System.out.println (""); // perguntar ao professor jeito correto da javafxthis
	  }
	
	}



	



	public double lancarNotaLancaMedia() {
		return 0;
	}



	public double frequenciaAluno() {
		return 0;
	}

}
