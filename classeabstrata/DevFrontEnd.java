package teste.teste.classeabstrata;

public class DevFrontEnd extends Colaborador {

	public DevFrontEnd(String nome, String cpf, double salario, String tech) {
		super(nome, cpf, salario, tech);
	}

	public void aumentarSalario() {
		setSalario(getSalario() * 1.3);
	}

	public void tecnologias() {
		String[] tecnologiasValidas = { "html", "css", "javascript", "react" };
		boolean tecnologiaValida = false;

		for (String tecnologia : tecnologiasValidas) {
			if (getTech().equalsIgnoreCase(tecnologia)) {
				tecnologiaValida = true;
				break;
			}
		}

		if (tecnologiaValida) {
			System.out.println("A tecnologia " + getTech() + " é válida para DevFrontEnd.");
		} else {
			System.out.println("A tecnologia " + getTech() + " não é válida para DevFrontEnd.");
		}
	}

}
