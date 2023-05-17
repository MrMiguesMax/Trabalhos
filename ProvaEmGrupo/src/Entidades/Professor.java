package Entidades;

public class Professor extends Pessoa{
    private	String especialidade;
	private Disciplinas disciplina;
	private String periodo;
	
	//construtor
	public Professor(String especialidade, Disciplinas disciplina, String periodo, String nome, int cpf) {
		super(cpf, nome);
		this.especialidade = especialidade;
		this.disciplina = disciplina;
		this.periodo = periodo;
	}
	
	//construtor 2
	public Professor(String nome, int cpf) {
		super(cpf, nome);
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public Professor(int cpf, String nome) {
		super(cpf, nome);
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
}
