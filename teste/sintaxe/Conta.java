package teste.sintaxe;

public class Conta {

	private String numero;
	private String nome;
	private double saldo;
		
	public Conta() {
		
	}
	
	public Conta(String numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
		
	//getters and setters
		
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {		
		return saldo;
	}

	public void setSaldo(double saldo) {
		//FAZER O ALGORITMO PARA NÃO ENDIVIDAR *(-1)
		this.saldo = saldo;
	}
	
	//métodos
	
	public void definir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Nummero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Nummero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
		
	public void compararSaldos(double saldo) {
		
		//FAZER O COMPARADOR
	}
}
