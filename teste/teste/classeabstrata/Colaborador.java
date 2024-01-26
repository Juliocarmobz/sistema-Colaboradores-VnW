package teste.teste.classeabstrata;

import java.util.Date;
import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private double salario;
	private boolean isAtivo = true;
	private String data;
	private String tech;

	public Colaborador(String nome, String cpf, double salario, String tech) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.tech = tech;
		this.data = obterDataAdmissao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	// Métodos
	public String vizualizar() {
		return "[ Nome: " + this.nome + ", CPF: " + this.cpf + " ]" + "\nSalário: " + this.salario + "\nEstá ativo? "
				+ this.isAtivo + "\nData de Admissão: " + this.data;
	}

	private String obterDataAdmissao() {
		Date datasistema = new Date();
		return datasistema.toString();
	}

	private void resetAtributos() {
		this.salario = 0.0;
		this.isAtivo = false;
		this.data = null;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular o " + this.nome + "\n[S]/[N]");
		Character resposta = sc.next().toLowerCase().charAt(0);
		if (resposta.equals('s')) {
			this.isAtivo = false;
			System.out.println("Este colaborador foi desvinculado.");
			resetAtributos();
		}

		sc.close();
	}

	public abstract void aumentarSalario();

	public abstract void tecnologias();

}
