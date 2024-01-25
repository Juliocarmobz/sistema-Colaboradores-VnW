package teste.sintaxe;

public class Application {

	public static void main(String[] args) {
		Conta contaCorrenteThiago = new Conta();
		Conta contaCorrenteJulio = new Conta("1234-2","Julio Carmo",20000.0);
		//FAZER CONTA CORRENTE ISAEL
		
		contaCorrenteThiago.setNome("Thiago Ferreira");
		contaCorrenteThiago.setNumero("1234-1");
		contaCorrenteThiago.setSaldo(10000.0);
		
		System.out.println(contaCorrenteThiago.getNome());
		System.out.println("-------------------");
		contaCorrenteThiago.visualizar();
		System.out.println("-------------------");
		//CHAMAR O COMPARADOR ENTRE JULIO E THIAGO
	}
}
