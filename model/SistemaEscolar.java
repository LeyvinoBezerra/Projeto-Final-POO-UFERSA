package model;
public interface SistemaEscolar {

	public abstract void cadstrarAluno();

	public abstract void cadstrarProfessor();

	public abstract void cadastrarTurma();

	public abstract void cadastrarDisciplina();

	public abstract String buscarAluno();

	public abstract String buscarProfessor();

	public abstract String buscarDisciplina();

	public abstract Professor BuscarTurma();

	public abstract void mostarDisciplinaConcluídaPorAluno();

	public abstract double lancarNotaLancaMedia();

	public abstract double frequenciaAluno();

}
