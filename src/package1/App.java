package package1;

public class App {

	public static void main(String[] args) {
		
		//Criação de objeto da classe carro
		Carro carro1 = new Carro();
		
		//Atribuição de valores os atributos do objeto
		carro1.setNumDePortas(4);
		carro1.setAno(2010);
		carro1.setCor("Prata");
		carro1.setMarca("Honda");
		carro1.setModelo("Civic");
		
		//Mostrando valores ao usúario utilizando os métodos get
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Número de portas: " + carro1.getNumDePortas());
	}

}
