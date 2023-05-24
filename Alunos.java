package ProjetoSGA;

public class Alunos {
	
	private String nome;
	private int ra;
	private int periodo = 1;
	private String curso;
	
	public Alunos(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}
	
	public Alunos(String nome, int ra, int periodo, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.periodo = periodo;
		this.curso = curso;
	}
	
	public void mostrarInfo() {
		System.out.println(nome);
	}

}
