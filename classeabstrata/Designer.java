package teste.teste.classeabstrata;

public class Designer extends Colaborador {

	public Designer(String nome, String cpf, double salario, String tech) {
		super(nome, cpf, salario, tech);
	}

	public void aumentarSalario() {
		setSalario(getSalario() * 1.1);
	}

	public void tecnologias() {
		String[] tecnologiasValidas = { "figma", "canva", "invision", "sketch" };
		boolean tecnologiaValida = false;

		for (String tecnologia : tecnologiasValidas) {
			if (getTech().equalsIgnoreCase(tecnologia)) {
				tecnologiaValida = true;
				break;
			}
		}

		if (tecnologiaValida) {
			System.out.println("A tecnologia " + getTech() + " é válida para DevBackEnd.");
		} else {
			System.out.println("A tecnologia " + getTech() + " não é válida para DevBackEnd.");
		}
	}

}
