package teste.teste.classeabstrata;

public class App {

	public static void main(String[] args) {

		DevBackEnd devJunior = new DevBackEnd("Isael", "123-4", 1000.0, "python");

		devJunior.aumentarSalario();
		System.out.println(devJunior.vizualizar());

//		devJunior.desvincularColaborador();
//		System.out.println(devJunior.vizualizar());

		devJunior.tecnologias();

		DevFrontEnd devSenior = new DevFrontEnd("Julio", "5512-1", 1000.2, "java");
		System.out.println(devSenior.vizualizar());
		devSenior.tecnologias();
	}

}
