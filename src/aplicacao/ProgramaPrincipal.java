package aplicacao;

import java.util.Scanner;

import entidades.Triangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// Agora que a classe Triangulo está pronta, podemos
		// instanciar um novo objeto do tipo triangulo:
		// Triangulo nomeDoObjeto = new Triagulo();
		
		
		// instanciando o objeto sem parametros
		Triangulo trianguloA = new Triangulo();
		
		// como os atributos da classe Triangulo estao públicos
		// conseguimos setar os valores diretamente
		// nomeDoObjeto.atributo = valor;
		
		System.out.println("Digite a base do Triangulo A: ");
		trianguloA.base = sc.nextDouble();
		System.out.println("Digite a altura do Triangulo A: ");
		trianguloA.altura = sc.nextDouble();
		
		// Utilizando o método que calcula a área para o objeto 1 (Triangulo A).
		System.out.printf("Área do Triângulo A: %.2f%n", trianguloA.calcularArea());
		
		// Para o objeto 2 (Triangulo B) decidimos instanciar o objeto já com atributos.
		// para isso, lemos primeiro os valores e gravamos em variáveis.
		// Depois utilizamos o construtor com atributos para criar o objeto:
		
		System.out.println("Digite a base do Triangulo B: ");
		double base = sc.nextDouble();
		System.out.println("Digite a altura do Triangulo B: ");
		double altura = sc.nextDouble();
		
		// Agora que já temos os dados, podemos instanciar o objeto:
		Triangulo trianguloB = new Triangulo(base, altura);
		
		// Essa forma será mais utilizada por que utilizaremos encapsulamento
		// ou seja, nas próximas aulas os atributos das classes serão privados e por isso não será possível
		// definir seus valores diretamente, como fizemos no Triangulo A.
		
		// Utilizando o método que calcula a área para o objeto 1 (Triangulo A).
		System.out.printf("Área do Triângulo B: %.2f", trianguloB.calcularArea());

		// fechando o Scanner (boa prática).
		sc.close();

	}

}
