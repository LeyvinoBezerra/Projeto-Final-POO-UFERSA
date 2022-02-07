package model;


public class Aluno extends Pessoa implements SistemaEscolar {

	private String rgAluno;

	private String matricula;

	// private Disciplina disciplina<List>;

	private String senhaAluno;

	public Aluno(String rgAluno, String matricula, String senhaAluno) {
		super();
		setRgAluno (rgAluno);
		setMatricula (matricula);
		setSenhaAluno (senhaAluno);
	}

	public String getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(String rgAluno) {
		if(!rgAluno.isEmpty()){
			this.rgAluno = rgAluno;
		}else {
			System.out.println(""); // perguntar ao professor jeito correto da javafx
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if(!matricula.isEmpty()){
			this.matricula = matricula;;
		}else {
			System.out.println(""); // perguntar ao professor jeito correto da javafxthis.
	}

	public String getSenha() {
		return senhaAluno;
	}

	public void setSenhaAluno(String senhaAluno) {
		if(!senhaAluno.isEmpty()){
			this.senhaAluno = senhaAluno;
		}else {
			System.out.println (""); // perguntar ao professor jeito correto da javafxthis
	  }
	
	}
}
