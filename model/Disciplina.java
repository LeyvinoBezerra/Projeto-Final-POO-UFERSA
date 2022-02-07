package model;


public class Disciplina implements SistemaEscolar {

	private String nomeDisciplina;

	private String codigoDisciplina;

	
	
	public Disciplina(String nomeDisciplina, String codigoDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		if(!nomeDisciplina.isEmpty()){
			this.nomeDisciplina = nomeDisciplina;
		}else {
			System.out.println (""); // perguntar ao professor jeito correto da javafxthis
	  }
	
	}
	

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		if(!codigoDisciplina.isEmpty()){
			this.codigoDisciplina = codigoDisciplina;
		}else {
			System.out.println (""); // perguntar ao professor jeito correto da javafxthis
	  }
	
	}
	}


